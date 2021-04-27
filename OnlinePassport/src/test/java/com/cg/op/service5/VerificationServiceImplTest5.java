//package com.cg.op.service5;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.mockito.Mockito.times;
//import static org.mockito.Mockito.verify;
//import static org.mockito.Mockito.when;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Date;
//import java.util.List;
//import java.util.Optional;
//
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.TestInstance;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.mockito.MockitoAnnotations;
//import com.cg.op.controller.VerificationController;
//import com.cg.op.exception.UserNotFoundException;
//import com.cg.op.model.Verification;
//import com.cg.op.repository.VerificationRepository;
//import com.cg.op.service.*;
//
//
//@SuppressWarnings("unused")
//@TestInstance(TestInstance.Lifecycle.PER_CLASS)
//
//public class VerificationServiceImplTest5 {
//	
//	@InjectMocks
//	private VerificationServiceImpl verService;
//	
//	@Mock
//	private VerificationRepository verRepo;
//	
//	@Mock
//	private VerificationController verController;
//	
//	
//	private Verification ver;
//	
//	
//	
//	@BeforeAll
//	public void init() {		
//		MockitoAnnotations.openMocks(this);
//		ver = new Verification();
//
//		ver.setPassportNo(11);
//		ver.setVerifydate(new Date());
//		ver.setVerifystatus("on hold");
//		ver.setVerifyername("puvvadi");
//
//
//		
//			}
//	@Test
//	public void CreateVerificationTest() {
//		ver = new Verification();
//
//		ver.setPassportNo(11);
//		ver.setVerifydate(new Date());
//		ver.setVerifystatus("on hold");
//		ver.setVerifyername("puvvadi");
//
//
//		when(verService.createVerification(ver)).thenReturn(ver);
//		verController.createVerification(ver);
//		assertEquals("on hold", ver.getVerifystatus());
//		
//	}
//	@Test
//	public void updateVerificationTest() throws UserNotFoundException {
//		Verification ver1 = new Verification();
//		ver1.setVerifyid((long) 104);
//		ver1.setPassportNo(11);
//		ver1.setVerifydate(new Date());
//		ver1.setVerifystatus("on hold");
//		ver1.setVerifyername("puvvadi");
//		
//		
//		Long verId = ver1.getVerifyid();
//		Optional<Verification> verEntity1 = verRepo.findById(verId);
//		
//		when(verRepo.findById(verId)).thenReturn(verEntity1);
//		when(verRepo.save(ver1)).thenReturn(ver1);
//		
//		ver1.setPassportNo((long) 520);
//		verController.updateVerification(ver1);
//		assertEquals(520, ver1.getPassportNo());
//	}
//	@Test
//	public void getUserByIdTest() throws UserNotFoundException {
//		
//		Long verid = ver.getVerifyid();
//		Optional<Verification> verification = Optional.of(ver);
//		when(verRepo.findById(verid)).thenReturn(verification);
//		
//		Verification viewverification = verService.getUserById(verid);
//		assertEquals("puvvadi", viewverification.getVerifyername());;
//		
//		
//	}
//  @Test
//  public void getAllVerificationTest()
//  {
//	  List<Verification> verificationList = new ArrayList<Verification>();
//	  Verification ver = new Verification();
//		ver.setVerifyid((long) 104);
//		ver.setPassportNo(11);
//		ver.setVerifydate(new Date());
//		ver.setVerifystatus("on hold");
//		ver.setVerifyername("puvvadi");
//      Verification ver1 = new Verification();
//		ver1.setVerifyid((long) 104);
//		ver1.setPassportNo(11);
//		ver1.setVerifydate(new Date());
//		ver1.setVerifystatus("on hold");
//		ver1.setVerifyername("puvvadi");
//		verificationList.add(ver);
//		verificationList.add(ver1);
//		
//			when(verRepo.findAll()).thenReturn(verificationList);
//			
//			List<Verification> verificationList2 = verService.getAllVerification();
//			
//			assertEquals(2, verificationList2.size());
//		
//	  
//  }
//  
//
//
//}
