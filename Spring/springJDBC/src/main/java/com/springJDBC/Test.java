package com.springJDBC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test{
	
	public static void main(String[] args) {
		
		System.out.println("Hello");
		
		ApplicationContext con= new ClassPathXmlApplicationContext("com/springJDBC/config.xml");
		
		 JdbcTemplate bean = con.getBean("jdbcTemplate",JdbcTemplate.class );
		 
		// insert query
		 
	 String query= "insert into student (id,city) values(?,?)";
		 
		 //fire query
		 
		 int result = bean.update(query,89,"indore");
		 
		 System.out.println("inserted");
		
	}

}
