package com.cg.op.service;

import java.util.Optional;
import com.cg.op.model.Verification;

public interface VerificationService {

	public Verification createVerification(Verification ver);
	
	public Verification updateVerification(Verification ver);
	
	public Optional<Verification> getUserById(long id);
	
	public void deleteVerification(Verification ver);
	
	public Verification getVerification(Verification ver);
	

	
}
