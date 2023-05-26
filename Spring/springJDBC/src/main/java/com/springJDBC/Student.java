package com.springJDBC;

public class Student {
	
	private int id;
	private String city;
	
	
	private Student(int id, String city) {
		super();
		this.id = id;
		this.city = city;
	}
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", city=" + city + "]";
	}


	private Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	

}
