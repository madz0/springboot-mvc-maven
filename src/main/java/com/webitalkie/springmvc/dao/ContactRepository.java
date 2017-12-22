package com.webitalkie.springmvc.dao;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import com.webitalkie.springmvc.model.Contact;

public interface ContactRepository extends CrudRepository<Contact, Long> {

	//Pageable can sort too Or if we don't want pageable just use sort
	public List<Contact> findByName(String name, Pageable pagable);
}
