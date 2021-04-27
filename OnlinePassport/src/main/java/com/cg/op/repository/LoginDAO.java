package com.cg.op.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.op.model.Login;



@Repository
public interface LoginDAO extends JpaRepository<Login, Integer> {

	Login findByEmail(String email);
//	List<Login> retAllLog();
   
}