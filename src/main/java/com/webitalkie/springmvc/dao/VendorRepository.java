/**
 * 
 */
package com.webitalkie.springmvc.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.webitalkie.springmvc.model.Vendor;

/**
 * @author mohamad
 *
 */
public interface VendorRepository extends CrudRepository<Vendor, Long> {

	@Query("SELECT v FROM Vendor v")
	List<Vendor> getAll();
}
