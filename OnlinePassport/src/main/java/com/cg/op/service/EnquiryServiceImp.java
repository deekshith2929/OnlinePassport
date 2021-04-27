package com.cg.op.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.op.model.Enquiry;
import com.cg.op.repository.EnquiryRepository;

@Service
public class EnquiryServiceImp implements EnquiryService {
	@Autowired
	private EnquiryRepository enqRepo;
	
	public Enquiry createEnquiry(Enquiry enquiry) {
		return enqRepo.save(enquiry);
	}
	public List<Enquiry> getAllEnquiry(){
		return enqRepo.findAll();
	}
	public Optional<Enquiry> getEnquiryById(Long enquiryid){
		return enqRepo.findById(enquiryid);
	}
	public Enquiry updateEnquiry(Enquiry enquiry) {
		return enqRepo.save(enquiry);
	}
	public void deleteEnquiry(Enquiry enquiry) {
			enqRepo.delete(enquiry);
	}

}