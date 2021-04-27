package com.cg.op.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.op.model.Login;
import com.cg.op.repository.LoginDAO;


@Service
public class LoginServiceImpl implements LoginService{
    @Autowired
private	LoginDAO logindao;
	
	@Override
	public boolean authenticate(Login login) {
		
		Login login1=logindao.findByEmail(login.getEmail());
		if(login.getEmail().equals(login1.getEmail()) && (login.getPassword().equals(login1.getPassword()))) 
				{
			       return true;
				}
		return false;
	}

	@Override
	public Login changePassword(Login login){
			return  logindao.save(login);
		}
	public Optional<Login> getLoginById(int Id) {
		return logindao.findById(Id);
	}

	@Override
	public Login add(Login login) {
		return logindao.save(login);
	}
//   @Override
//	public List<Login> retAllLog(){
//	    return logindao.findAll();
//	}
//	
	
}
