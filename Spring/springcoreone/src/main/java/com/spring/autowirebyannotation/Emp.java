package com.spring.autowirebyannotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {
	
	//Autowitre can be used on propery, setter method and constructor
	
	@Autowired
	private Address add;

	private Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	//@Autowired
	private Emp(Address add) {
		super();
		this.add = add;
		System.out.println("constructor is called");
	}

	public Address getAdd() {
		return add;
	}

	
	//@Autowired
	public void setAdd(Address add) {
		this.add = add;
		System.out.println("setter method is called");
	}

	@Override
	public String toString() {
		return "Emp [add=" + add + "]";
	}
	
	

}
