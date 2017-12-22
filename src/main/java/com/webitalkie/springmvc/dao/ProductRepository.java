/**
 * 
 */
package com.webitalkie.springmvc.dao;

import org.springframework.data.repository.CrudRepository;

import com.webitalkie.springmvc.model.Product;

/**
 * @author mohamad
 *
 */
public interface ProductRepository extends CrudRepository<Product, Long> {

}
