package com.spring.autowire;

public class Emp {
	
	
	private Address add;

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

	private Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	private Emp(Address add) {
		super();
		this.add = add;
	}

	@Override
	public String toString() {
		return "Emp [add=" + add + "]";
	}

	
}
