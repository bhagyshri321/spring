 package com.JDBC.industry.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.JDBC.industry.entities.Student;



public class StudentDaoImpl implements StudentDao{

	private JdbcTemplate jdbcTemplate;
	

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
	 
	//insert
	public int insert(Student student) {
		 String query= "insert into student (id,city) values(?,?)";
		 
		 int r = this.jdbcTemplate.update(query,student.getId(),student.getCity());
		return r;
	}
     
	//update
	public int change(Student student) {
		 String query= "update student set city=? where id =?";
		 
		 int r = this.jdbcTemplate.update(query,student.getCity(),student.getId());
		return 0;
	}

	//delete
	public int delete(int id) {
		   String query= "delete from student where id =?";
		   int r = this.jdbcTemplate.update(query,id);
		return r;
	}

	
	//getting details of single object
	public Student getStudent(int id) {
		String query= "select * from student where id = ?";
		RowMapper<Student> rowMapper = new RowMapperImpl();
		
		 Student student = this.jdbcTemplate.queryForObject(query, rowMapper,id);
		
		return student;
	}

	
	//Selecting all data
	public List<Student> getAllStudents() {
		
		String query= "select * from student";
		List<Student> students = this.jdbcTemplate.query(query,new RowMapperImpl());
		return students;
	}

}
