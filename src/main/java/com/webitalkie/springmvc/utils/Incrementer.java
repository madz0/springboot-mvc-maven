package com.webitalkie.springmvc.utils;

public class Incrementer {

	private int i = -1;
	
	public int incr() {
		
		return ++i;
	}
	
	public int get() {
		
		return i;
	}
}
