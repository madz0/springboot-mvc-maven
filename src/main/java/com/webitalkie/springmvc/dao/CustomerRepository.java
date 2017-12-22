/**
 * 
 */
package com.webitalkie.springmvc.dao;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

import com.webitalkie.springmvc.model.Customer;

/**
 * @author mohamad
 *
 */
public interface CustomerRepository extends CrudRepository<Customer, Long>, JpaSpecificationExecutor<Customer> {

	
}
