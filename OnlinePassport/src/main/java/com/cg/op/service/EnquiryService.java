package com.cg.op.service;

import java.util.List;
import java.util.Optional;

import com.cg.op.model.Enquiry;

public interface EnquiryService {
	public Enquiry createEnquiry(Enquiry enquiry);
	public List<Enquiry> getAllEnquiry();
	public Optional<Enquiry> getEnquiryById(Long enquiryid);
	public Enquiry updateEnquiry(Enquiry enquiry);
	public void deleteEnquiry(Enquiry enquiry);

}