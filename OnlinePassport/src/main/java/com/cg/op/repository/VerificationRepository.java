package com.cg.op.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.op.model.Verification;

@Repository
public interface VerificationRepository extends JpaRepository<Verification,Long>{

	

}
