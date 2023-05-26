package com.JDBC.industry.dao;

import java.util.List;

import com.JDBC.industry.entities.Student;

public interface StudentDao {
	
	public int insert(Student student);
	
	public int change(Student student);
	
	public int delete(int id);
	
	public Student getStudent(int id);
	
	public List<Student> getAllStudents();
	
	

}
