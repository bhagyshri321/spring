package com.spring.collection;


import java.util.List;
import java.util.Map;
import java.util.Set;

public class Emp {
private String name;
private List<String> phones;

private Set<String> add;

private Map<String, String> courses;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public List<String> getPhones() {
	return phones;
}

public void setPhones(List<String> phones) {
	this.phones = phones;
}

public Set<String> getAdd() {
	return add;
}

public void setAdd(Set<String> add) {
	this.add = add;
}

public Map<String, String> getCourses() {
	return courses;
}

public void setCourses(Map<String, String> courses) {
	this.courses = courses;
}

public Emp(String name, List<String> phones, Set<String> add, Map<String, String> courses) {
	super();
	this.name = name;
	this.phones = phones;
	this.add = add;
	this.courses = courses;
}

public Emp() {
	super();
	// TODO Auto-generated constructor stub
}





}
