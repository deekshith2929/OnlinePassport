package com.cg.op.service;

import java.util.List;
import java.util.Optional;

import com.cg.op.model.PassportRegistrationModel;
import com.cg.op.exception.RegistrationNotFoundException;

public interface PassportRegistrationService {

	public PassportRegistrationModel addPassportRegistration(PassportRegistrationModel entity) ;

	public void update(PassportRegistrationModel entity)  throws RegistrationNotFoundException;

	public PassportRegistrationModel getRegisterById(Long id) throws RegistrationNotFoundException;

	public void deleteEmployee(Long id) throws RegistrationNotFoundException;

	public List<PassportRegistrationModel> getAllEmployees();

	
}