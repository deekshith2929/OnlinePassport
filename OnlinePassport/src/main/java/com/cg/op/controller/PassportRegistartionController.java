package com.cg.op.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.cg.op.model.PassportRegistrationModel;
import com.cg.op.exception.RegistrationNotFoundException;
import com.cg.op.repository.PassportRegistartionDOA;
import com.cg.op.service.PassportRegistrationServiceImp;

import ch.qos.logback.classic.Logger;


//mark class as Controller 
@CrossOrigin(origins = {"http://localhost:3001"})
@RestController

public class PassportRegistartionController  {
     
	@Autowired
	public PassportRegistrationServiceImp service;
	
	@Autowired
	public PassportRegistartionDOA repo;
	
	final Logger log=(Logger) org.slf4j.LoggerFactory.getLogger(PassportRegistartionController.class);
	
	@PostMapping("/register/all")
	public PassportRegistrationModel createRegister(@RequestBody PassportRegistrationModel data) {
	log.info("create a new Register"+data.toString());
	return service.addPassportRegistration(data);
	}
	
	   @GetMapping("/register/all/{id}")
	   public PassportRegistrationModel getRegisterById(@PathVariable(value="id") Long dataid) throws RegistrationNotFoundException {
		PassportRegistrationModel reg= service.getRegisterById(dataid);
		log.info("Dispaly register"+reg.toString());
	   return reg;
	  }
	 
     
     @DeleteMapping("/register/all/{id}")
     public  String deleteRegister(@PathVariable(value="id") Long regid) throws RegistrationNotFoundException  {
	  service.deleteEmployee(regid);
	   return "File deleted";
    }
     
    
//     @PutMapping("/register/all")
// 	    public ResponseEntity<Boolean> update(@RequestBody PassportRegistrationModel source) throws RegistrationNotFoundException  {
// 		service.update(source);
// 		@SuppressWarnings({ "rawtypes", "unchecked" })
// 		ResponseEntity<Boolean> responseEntity = new ResponseEntity(true, HttpStatus.OK);
// 		return responseEntity;
 	//}
     
     @PutMapping("/register/all/{id}")
     public ResponseEntity<PassportRegistrationModel> updateRegister(@PathVariable(value="id")long regid, @RequestBody PassportRegistrationModel passs) throws RegistrationNotFoundException{
    	 PassportRegistrationModel passs1 = repo.findById(regid).orElseThrow(() -> new RegistrationNotFoundException("Registration Not Found for this id:"));
    	 passs1.setFirstName(passs.getFirstName());
    	 passs1.setLastName(passs.getLastName());
    	 passs1.setDateOfBirth(passs.getDateOfBirth());
    	 passs1.setGender(passs.getGender());
    	 passs1.setEmail(passs.getEmail());
    	 passs1.setQualification3(passs.getQualification3());
    	 passs1.setCity(passs.getCity());
    	 passs1.setStreet(passs.getStreet());
    	 passs1.setPlotNo(passs.getPlotNo());
    	 passs1.setState(passs.getState());
    	 passs1.setDistricts(passs.getDistricts());
    	 passs1.setMobileNo(passs.getMobileNo());
    	 passs1.setZipcode(passs.getZipcode());
    	 PassportRegistrationModel updatedpasss = repo.save(passs1);
    	 return ResponseEntity.ok(updatedpasss);
     }
   
   @GetMapping("/register/all")
   public List<PassportRegistrationModel> allRegisters(){
	   return service.getAllEmployees();
    }
}