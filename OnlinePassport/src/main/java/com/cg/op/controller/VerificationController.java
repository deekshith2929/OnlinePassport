package com.cg.op.controller;

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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.cg.op.exception.UserNotFoundException;
import com.cg.op.model.*;
import com.cg.op.repository.VerificationRepository;
import com.cg.op.service.*;
@CrossOrigin(origins="http://localhost:3000")
@RestController
public class VerificationController {

	@Autowired
	  private VerificationService verService;

	@Autowired
	private VerificationRepository verRepo;
	
	  @PostMapping("/verifications")
	  public Verification createVerification(@RequestBody Verification v)
		{	
			return verService.createVerification(v);
		}
	  @PutMapping("/verifications/{id}")
	  public ResponseEntity<Verification> updateVerification(@PathVariable(value="id") long verid,@RequestBody Verification v) throws UserNotFoundException
		{  
		  Verification v1=verRepo.findById(verid).orElseThrow(()->new UserNotFoundException("sorry!! No Verification id found!!! with id->"+verid));
		  
	      v1.setVerifydate(v.getVerifydate());
	      v1.setVerifyername(v.getVerifyername());
	      v1.setVerifystatus(v.getVerifystatus());
	      Verification updatedver=verRepo.save(v1);
	      return ResponseEntity.ok(updatedver);
		}
	 
	  @GetMapping("/verifications")
	  public List<Verification> getAllVerification(){
			return verRepo.findAll();
		}		
		
	  @GetMapping("/verifications/{id}")
	  public ResponseEntity<Verification> getVerificationById(@PathVariable Long id) throws UserNotFoundException {
			Verification verification = verRepo.findById(id)
					.orElseThrow(() -> new UserNotFoundException("sorry!! No Verification id found!!! with that ID"));
			return ResponseEntity.ok(verification);
		}
	  
	  
	  @DeleteMapping("/verifications/{id}")
	  public String deleteUser(@PathVariable(value="id" )long verid) throws UserNotFoundException
		{
		  Verification v1=verService.getUserById(verid).orElseThrow(()->new UserNotFoundException("sorry!! No user found!!! with id->"+verid));
		verService.deleteVerification(v1);
			return "User deleted";
		}

}
