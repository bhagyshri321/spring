package com.spring;

public class Student {
	
	private int id;
	
	private String  name;
	
	private String  add;
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", add=" + add + "]";
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, String add) {
		super();
		this.id = id;
		this.name = name;
		this.add = add;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	
	
	

}
