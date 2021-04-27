package com.cg.op.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.op.model.Login;
import com.cg.op.repository.LoginDAO;
import com.cg.op.service.LoginServiceImpl;

@CrossOrigin(origins = "http://localhost:3001")
@RestController
public class LoginController {

	@Autowired
	LoginServiceImpl LoginService;
	 @Autowired
	 private	LoginDAO logindao;
	
	@PostMapping("/add")
	public Login addUser( @RequestBody Login login) {
		return LoginService.add(login);
	}
	    @GetMapping("/authenticate")
	    public String authenticate(@RequestBody Login user){
  			boolean status=LoginService.authenticate(user);
  			if(status) 
				return "success";
			else
				return "fail";
  		}
	    
	    @PutMapping("/changepassword/{id}")
		public ResponseEntity<Login> changePassword(@PathVariable(value = "id") int Id, @RequestBody Login login) {
	    	System.out.println("From Postman = "+login);
	    	Login logindb = LoginService.getLoginById(Id).orElse(new Login());
	    	System.out.println("From DB = "+login);
	    	logindb.setPassword(login.getPassword());
			 return new ResponseEntity<Login>(LoginService.changePassword(logindb),HttpStatus.OK);
		}
	    @GetMapping("/getlogin/{id}")
		public ResponseEntity<Login> getLoginById(@PathVariable(value="id") int Id){
	    	System.out.println("From Postman = "+Id);
			Login login = LoginService.getLoginById(Id).orElse(new Login());
			return ResponseEntity.ok().body(login);
		}
	    
	    @GetMapping("/list")
	          public List<Login> retList(){
//	    	List<Login> ll=LoginService.retAllLog();
	    	System.out.println( logindao.findAll());
	    	return logindao.findAll();
	    }
	    
}