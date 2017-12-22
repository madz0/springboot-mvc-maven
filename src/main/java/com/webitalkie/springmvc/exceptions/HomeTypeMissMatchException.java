package com.webitalkie.springmvc.exceptions;

import org.springframework.beans.TypeMismatchException;

public class HomeTypeMissMatchException extends TypeMismatchException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public HomeTypeMissMatchException(Object value, Class<?> requiredType) {
		super(value, requiredType);
		// TODO Auto-generated constructor stub
	}

}
