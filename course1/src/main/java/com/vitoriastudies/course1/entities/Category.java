package com.vitoriastudies.course1.entities;

import java.io.Serializable;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import java.util.Objects;


public class Category implements Serializable{


	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;

	
	private Set<Product> products = new HashSet<>() ;

	public Category(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	
	public Category() {
		
	}
	
	public Set<Product> getProducts() {
		return products;
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Category other = (Category) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
