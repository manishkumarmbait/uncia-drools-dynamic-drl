package com.uncia.dynamic_drl.model;

public class Device {

	private String output;
	Boolean valveLeakageAlarm;
	Boolean da_Fan_Sts;
	Boolean lessThan;
	Boolean lessThan1;
	Boolean and;
	Double sinewave;
	Double sineWave1;
	Double daTemp;
	Double maTemp;
	Double datsp;
	Double pidkpl;
	Double pidki;
	Double pid;
	Double chw_Vlv_Ctrl;
	Boolean fanStatus;
	Boolean coolingStatus;
	Double dischargeTempSensorValue;
	Double threshold;

	public String getOutput() {
		return output;
	}

	public void setOutput(String output) {
		this.output = output;
	}

	public Boolean getValveLeakageAlarm() {
		return valveLeakageAlarm;
	}

	public void setValveLeakageAlarm(Boolean valveLeakageAlarm) {
		this.valveLeakageAlarm = valveLeakageAlarm;
	}

	public Boolean getDa_Fan_Sts() {
		return da_Fan_Sts;
	}

	public void setDa_Fan_Sts(Boolean da_Fan_Sts) {
		this.da_Fan_Sts = da_Fan_Sts;
	}

	public Boolean getLessThan() {
		return lessThan;
	}

	public void setLessThan(Boolean lessThan) {
		this.lessThan = lessThan;
	}

	public Boolean getLessThan1() {
		return lessThan1;
	}

	public void setLessThan1(Boolean lessThan1) {
		this.lessThan1 = lessThan1;
	}

	public Boolean getAnd() {
		return and;
	}

	public void setAnd(Boolean and) {
		this.and = and;
	}

	public Double getSinewave() {
		return sinewave;
	}

	public void setSinewave(Double sinewave) {
		this.sinewave = sinewave;
	}

	public Double getSineWave1() {
		return sineWave1;
	}

	public void setSineWave1(Double sineWave1) {
		this.sineWave1 = sineWave1;
	}

	public Double getDaTemp() {
		return daTemp;
	}

	public void setDaTemp(Double daTemp) {
		this.daTemp = daTemp;
	}

	public Double getMaTemp() {
		return maTemp;
	}

	public void setMaTemp(Double maTemp) {
		this.maTemp = maTemp;
	}

	public Double getDatsp() {
		return datsp;
	}

	public void setDatsp(Double datsp) {
		this.datsp = datsp;
	}

	public Double getPidkpl() {
		return pidkpl;
	}

	public void setPidkpl(Double pidkpl) {
		this.pidkpl = pidkpl;
	}

	public Double getPidki() {
		return pidki;
	}

	public void setPidki(Double pidki) {
		this.pidki = pidki;
	}

	public Double getPid() {
		return pid;
	}

	public void setPid(Double pid) {
		this.pid = pid;
	}

	public Double getChw_Vlv_Ctrl() {
		return chw_Vlv_Ctrl;
	}

	public void setChw_Vlv_Ctrl(Double chw_Vlv_Ctrl) {
		this.chw_Vlv_Ctrl = chw_Vlv_Ctrl;
	}

	public Boolean getFanStatus() {
		return fanStatus;
	}

	public void setFanStatus(Boolean fanStatus) {
		this.fanStatus = fanStatus;
	}

	public Boolean getCoolingStatus() {
		return coolingStatus;
	}

	public void setCoolingStatus(Boolean coolingStatus) {
		this.coolingStatus = coolingStatus;
	}

	public Double getDischargeTempSensorValue() {
		return dischargeTempSensorValue;
	}

	public void setDischargeTempSensorValue(Double dischargeTempSensorValue) {
		this.dischargeTempSensorValue = dischargeTempSensorValue;
	}

	public Double getThreshold() {
		return threshold;
	}

	public void setThreshold(Double threshold) {
		this.threshold = threshold;
	}

}
