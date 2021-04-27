//package com.cg.op.Service;
//
//import static org.assertj.core.api.Assertions.assertThat;
//import static org.junit.Assert.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//import java.util.Date;
//
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.mockito.Mockito;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import com.cg.op.service.*;
//import com.cg.op.model.*;
//import com.cg.op.repository.*;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//
//public class VerificationServiceImplTest {
//
//	@MockBean
//	private VerificationRepository verRepository;
//	
//	@Autowired
//	private VerificationService verService;
//	
//	@Test
//	public void testCreateEnquiry() {
//		Verification v=new Verification();
//		v.setVerifyername("bye");
//		v.setVerifystatus("Done Verification");
//		Mockito.when(verRepository.save(v)).thenReturn(v);
//		assertThat(verService.createVerification(v)).isEqualTo(v);
//
//	}
//	@Test
//	public void testUpdateEnquiry() {
//		   Verification ver=new Verification();
//		ver.setPassportNo(11);
//		ver.setVerifydate(new Date());
//		ver.setVerifystatus("on hold");
//		ver.setVerifyername("puvvadi");
//		Mockito.when(verRepository.save(ver)).thenReturn(ver);
//		
//		ver = verService.createVerification(ver);
//		//updating 
//		
//		ver.setVerifyername("raghu");
//		ver.setVerifystatus("rejected");
//		Mockito.when(verRepository.saveAndFlush(ver)).thenReturn(ver);
//	//	assertThat(verService.updateVerification(ver)).isEqualTo(ver);
//		
//	}
//	 
//
//	@Test
//	   public void testGetVerification() {
//		   Verification ver=new Verification();
//		   ver.setVerifyid(48);
//		   ver.setPassportNo(11);
//		   ver.setVerifydate(new Date());
//		   ver.setVerifyername("deekshith");
//		   ver.setVerifystatus("Done  Verification");
//		   Mockito.when(verRepository.getOne(48L)).thenReturn(ver);
//		    
//		 //   assertThat(verService.getVerification(ver)).isEqualTo(ver);  
//
//	   }
//
//	
//}
