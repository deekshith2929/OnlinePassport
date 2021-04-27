package com.cg.op.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.op.model.PassportRegistrationModel;



@Repository
public interface PassportRegistartionDOA extends JpaRepository<PassportRegistrationModel,Long>  {

}
