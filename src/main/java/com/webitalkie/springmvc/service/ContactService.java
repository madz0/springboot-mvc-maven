package com.webitalkie.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.webitalkie.springmvc.dao.ContactRepository;
import com.webitalkie.springmvc.model.Contact;

@Service
public class ContactService {

	@Autowired
	private ContactRepository repository;
	
	@Transactional(rollbackFor = {Exception.class})
	public void saveContacts(List<Contact> contacts) throws Exception {
		
		/*contacts.getContacts().stream().forEach(c->{
			repository.save(c);
		});*/
	
		for(int i=0; i< contacts.size(); i++) {
	
			if(contacts.get(i).getName() == null || contacts.get(i).getName().equals("")) {
			
				throw new Exception("Name of contact cannot be null");
			}
			
			System.out.println("cccccccccc:"+contacts.get(i).toString());
			repository.save(contacts.get(i));
		}
	}
}
