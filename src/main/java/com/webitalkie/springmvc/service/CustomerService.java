package com.webitalkie.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.webitalkie.springmvc.dao.CustomerRepository;
import com.webitalkie.springmvc.model.Customer;

@Service
@Transactional(rollbackFor = {Exception.class})
public class CustomerService {

	@Autowired
	private CustomerRepository repository;
	
	public List<Customer> find(Specification<Customer> query) {

		return repository.findAll(query);
	}
}
