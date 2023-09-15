package com.dnb.testDemo.advice;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.dnb.testDemo.exceptions.IdNotFoundException;

@ControllerAdvice
public class ApplicationAdvice {
@ExceptionHandler (IdNotFoundException.class)
public ResponseEntity<?> InvalidId(IdNotFoundException e){
	Map<String,String> map = new HashMap<>();
	map.put("Message is", e.getMessage());
	map.put("HttpStatus", HttpStatus.NOT_FOUND+"");
	return new ResponseEntity(map,HttpStatus.NOT_FOUND);
	
}
}
