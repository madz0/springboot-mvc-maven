package com.webitalkie.springmvc.model;

import java.util.List;

public class Contacts {

	private List<Contact> contacts;

	public List<Contact> getContacts() {
		
		return contacts;
	}

	public void setContacts(List<Contact> contacts) {
		
		this.contacts = contacts;
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		contacts.stream().forEach(x->{
			
			sb.append(x).append("___");
		});
		
		return sb.toString();
	}
}
