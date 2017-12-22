package com.webitalkie.springmvc.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
//Inheritance only needs to be defined for base class
@Inheritance(strategy = InheritanceType.JOINED)
public class Product implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(nullable=false, length=50, unique=false)
	private String name;
	
	@ManyToOne(fetch=FetchType.LAZY, cascade=CascadeType.MERGE)
	@JoinColumn(name="id_vendor", columnDefinition="BIGINT")
	private Vendor vendor;
	
	protected Product() {}

	public Product(Long id, String name, Vendor vendor) {

		this.id = id;
		this.name = name;
		this.vendor = vendor;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Product[id=%d, name=%s, vendor=_]", id, name);
	}
}
