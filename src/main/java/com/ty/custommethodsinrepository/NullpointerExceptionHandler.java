package com.ty.custommethodsinrepository;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;


@ControllerAdvice
public class NullpointerExceptionHandler {
	
	
	
	
	@ExceptionHandler(NullPointerException.class)
	public ResponseEntity<ResponseStucture<String>> nullPointerException(NullPointerException nullpointer)
	{

		ResponseStucture<String> resp=new ResponseStucture<String>();
		resp.setStatus(HttpStatus.BAD_REQUEST.value());
		resp.setMessage(nullpointer.getMessage());
		resp.setData("Can't deal with Null Values");
		
		return new ResponseEntity<ResponseStucture<String>>(resp,HttpStatus.BAD_REQUEST);
		
		
		
		
		
	}

}
