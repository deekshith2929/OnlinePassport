package com.cg.op.service;

import java.util.List;
import java.util.Optional;

import com.cg.op.model.Login;

public interface LoginService {
	public Optional<Login> getLoginById(int Id);
       public boolean authenticate(Login login);

	   public Login changePassword(Login login);
	   
	   public Login add(Login login);
	   
	   
//	   public List<Login> retAllLog();
}