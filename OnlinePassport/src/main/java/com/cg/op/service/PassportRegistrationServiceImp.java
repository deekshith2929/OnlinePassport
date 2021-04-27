package com.cg.op.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.op.model.PassportRegistrationModel;
import com.cg.op.exception.RegistrationNotFoundException;
import com.cg.op.repository.PassportRegistartionDOA;
@Service
public class PassportRegistrationServiceImp implements PassportRegistrationService{
     
	@Autowired
	PassportRegistartionDOA repository;
	
	@Override
	public PassportRegistrationModel addPassportRegistration(PassportRegistrationModel entity) {
		return repository.save(entity);
	}
	
	@Override
	public PassportRegistrationModel getRegisterById(Long id) throws RegistrationNotFoundException{
		PassportRegistrationModel data = repository.findById(id).orElseThrow(() -> new RegistrationNotFoundException("Registration Not Found for this id:"));
	   return data;
	}
	
	@Override
	public void deleteEmployee(Long id) throws RegistrationNotFoundException {
		PassportRegistrationModel data = repository.findById(id).orElseThrow(() -> new RegistrationNotFoundException("Registration Not Found for this id:"));
         repository.delete(data);	
         
	}
	
	@Override
	public List<PassportRegistrationModel> getAllEmployees(){
		return repository.findAll();
	}
	
	@Override
	public void update( PassportRegistrationModel entity) throws RegistrationNotFoundException  {
		repository.findById(entity.getId()).orElseThrow(() -> new RegistrationNotFoundException("Registration Not Found for this id:"));
		repository.save(entity);
	}
}