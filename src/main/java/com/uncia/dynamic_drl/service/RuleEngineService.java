package com.uncia.dynamic_drl.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

import org.kie.api.KieServices;
import org.kie.api.builder.KieBuilder;
import org.kie.api.builder.KieFileSystem;
import org.kie.api.builder.Message;
import org.kie.api.builder.ReleaseId;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.internal.io.ResourceFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uncia.dynamic_drl.model.Device;
import com.uncia.dynamic_drl.model.Rule;
import com.uncia.dynamic_drl.repository.RuleRepository;

@Service
public class RuleEngineService {

	@Autowired
	private RuleRepository ruleRepository;

	public Device executeRules(Device device) throws FileNotFoundException {

		List<Rule> rules = ruleRepository.findAll();

		String drlContent = generateDrlContent(rules);
		String drlFilePath = "c:\\temp\\generated-rule.drl";
		/*
		 * try(PrintWriter writer = new PrintWriter(drlFilePath)){
		 * writer.write(drlContent); } catch(IOException e){e.printStackTrace(); return
		 * null; }
		 */

//		try {
			PrintWriter writer = new PrintWriter(drlFilePath);
			writer.write(drlContent);
//		} catch (IOException e) {
//			e.printStackTrace();
//			return null;
//		}

		KieServices kieServices = KieServices.Factory.get();
		KieFileSystem kfs = kieServices.newKieFileSystem();
		kfs.write(ResourceFactory.newFileResource(new File(drlFilePath)));

		KieBuilder kieBuilder = kieServices.newKieBuilder(kfs).buildAll();

		if (kieBuilder.getResults().hasMessages(Message.Level.ERROR)) {
			throw new RuntimeException("Rule compilation errors: " + kieBuilder.getResults());
		}

		ReleaseId released = kieServices.newReleaseId("org.default", "artifact", "1.0.0");
		KieContainer kieContainer = kieServices.newKieContainer(released);
		KieSession kieSession = kieContainer.newKieSession();

		kieSession.insert(device);
		kieSession.fireAllRules();
		return device;

	}
//	com.uncia_drools_deviation_db.model.Device

	private String generateDrlContent(List<Rule> rules) {
		StringBuilder drlContent = new StringBuilder();
		drlContent.append("package KieRule;\n\n").append("import com.uncia_drools_deviation_db.model.Device;\n");
		for (Rule rule : rules) {
			drlContent.append("rule \"").append(rule.getRuleName()).append("when\n").append("device : Device(")
					.append(rule.getConditions()).append(")\n").append("then\n").append("device.setOutput(\"")
					.append(rule.getAction()).append("\");\n").append("update(device);\nend;\n\n");
		}
		return drlContent.toString();
	}

}
