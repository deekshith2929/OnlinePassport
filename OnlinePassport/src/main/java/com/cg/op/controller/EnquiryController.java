package com.cg.op.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.op.model.Enquiry;
import com.cg.op.exception.EnquiryNotFoundException;
import com.cg.op.repository.EnquiryRepository;
import com.cg.op.service.EnquiryServiceImp;
@CrossOrigin(origins = "http://localhost:3001")
@RestController
//@RequestMapping("/")
public class EnquiryController {
	@Autowired
	private EnquiryServiceImp enqService;
	@Autowired
	private EnquiryRepository enqRepo;
	@PostMapping("/enquiry")
	public Enquiry createEnquiry(@RequestBody Enquiry enquiry) {
		return enqService.createEnquiry(enquiry);
	}
	@GetMapping("/enquiry")
	public List<Enquiry> getAllEnquiry(){
		return enqService.getAllEnquiry();
	}
	@GetMapping("/enquiry/{id}")
	public ResponseEntity<Enquiry> getEnquiryById(@PathVariable (value="id")long enquiryid) throws EnquiryNotFoundException{
		Enquiry enquiry=enqService.getEnquiryById(enquiryid).orElseThrow(()-> new EnquiryNotFoundException("No Enquiry is found wiht this Id:" +enquiryid));
		return ResponseEntity.ok().body(enquiry);	
	}
	@PutMapping("/enquiry/{id}")
	public ResponseEntity<Enquiry> updateEnquiry(@PathVariable (value="id")long enquiryid,@RequestBody Enquiry e) throws EnquiryNotFoundException {
		Enquiry enq=enqRepo.findById(enquiryid).orElseThrow(()-> new EnquiryNotFoundException("Sorry! No Enquiry found"));
		enq.setPassportno(e.getPassportno());
		enq.setEnquirydate(e.getEnquirydate());
		enq.setEnquirystatus(e.getEnquirystatus());
		enq.setEnquirydesc(e.getEnquirydesc());
		Enquiry UpdateEnquiry=enqRepo.save(enq);
		return ResponseEntity.ok(UpdateEnquiry);
	}
	@DeleteMapping("/enquiry/{id}")
	public String deleteEnquiry(@PathVariable (value="id")long enquiryid) throws EnquiryNotFoundException {
		Enquiry enq=enqService.getEnquiryById(enquiryid).orElseThrow(()-> new EnquiryNotFoundException("Sorry! No Enquiry found"));
		enqService.deleteEnquiry(enq);
		return "Enquiry Deleted";
	}
}