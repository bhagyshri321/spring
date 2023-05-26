package com.JDBC.industry.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.JDBC.industry.entities.Student;

public class RowMapperImpl implements RowMapper<Student> {

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Student s= new Student();
		s.setId(rs.getInt(1));
		s.setCity(rs.getString(2));
		
		return s;
		
	}

}
