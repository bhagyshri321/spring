package com.bean.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.bean.annotation")
public class JavaConfig {
	
	
	
	@Bean
	public Student getStudent() {
		
		
		//creating student object
		Student student = new Student();
		
		return student;
	}

}
