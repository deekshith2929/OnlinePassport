package com.cg.op.service;

import java.util.Optional;
import java.util.function.IntPredicate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.op.model.Verification;
import com.cg.op.repository.VerificationRepository;

@Service
public class VerificationServiceImpl implements VerificationService{
	@Autowired
	private VerificationRepository verRepo;
	public Verification createVerification(Verification ver)
	{
		return verRepo.save(ver);
	}
	public Verification updateVerification(Verification ver)
	{
		return verRepo.save(ver);
	}
	public Optional<Verification> getUserById(long id)
	{
		return verRepo.findById(id);
	}
	public void deleteVerification(Verification ver)
	{
		verRepo.delete(ver);
	}
	@Override
	public Verification getVerification(Verification ver) {
		long id = ver.getVerifyid();
		Verification theVerification=null;
	
		theVerification = verRepo.getOne(id);
		return theVerification;
		}
	
}
