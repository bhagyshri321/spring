package com.spring.conslist;

import java.util.List;

import com.spring.conslist.Certi;

public class Person {
	
	private String name;
	private int id;
	private Certi certi;
	private List<String> list;
	private Person(String name, int id, Certi certi, List<String> list) {
		super();
		this.name = name;
		this.id = id;
		this.certi = certi;
		this.list = list;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + ", certi=" + certi + ", list=" + list + "]";
	}
	
	

}
