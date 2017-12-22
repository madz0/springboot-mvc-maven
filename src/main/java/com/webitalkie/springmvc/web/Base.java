package com.webitalkie.springmvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.webitalkie.springmvc.exceptions.HomeNotFoundException;
import com.webitalkie.springmvc.exceptions.HomeTypeMissMatchException;

@Controller
public class Base {

	@ExceptionHandler({ HomeTypeMissMatchException.class, 
		HomeNotFoundException.class, Exception.class })
	public String handleException(Exception ex) {
		
		return ex.getMessage();
	}
}
