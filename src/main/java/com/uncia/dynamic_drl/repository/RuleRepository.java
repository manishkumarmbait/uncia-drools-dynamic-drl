package com.uncia.dynamic_drl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uncia.dynamic_drl.model.Rule;

@Repository
public interface RuleRepository extends JpaRepository<Rule, Long>{

}
