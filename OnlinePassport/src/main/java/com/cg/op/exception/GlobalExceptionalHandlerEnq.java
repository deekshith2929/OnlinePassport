package com.cg.op.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionalHandlerEnq {
	@ExceptionHandler(EnquiryNotFoundException.class)
	public ResponseEntity<ErrorMessage> HandleEnquiryNotFoundException(EnquiryNotFoundException ex){
		ErrorMessage error=new ErrorMessage();
		error.setErrorCode(HttpStatus.NOT_FOUND.value());
		error.setErrorMessage(ex.getMessage());
		return new ResponseEntity(error,HttpStatus.OK);
		
	}
	@ExceptionHandler(Exception.class)
	public ResponseEntity HandlerException(Exception ex) {
		return new ResponseEntity(ex.getMessage(),HttpStatus.BAD_REQUEST);
		
	}

}