package com.webitalkie.springmvc.exceptions;

public class HomeNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public HomeNotFoundException(String message, Throwable cause) {
        
		super(message, cause);
    }
}
