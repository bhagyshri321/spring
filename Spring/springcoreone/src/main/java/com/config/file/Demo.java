package com.config.file;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {
	
	public static void main(String[] args) {
		
	ApplicationContext con=  new AnnotationConfigApplicationContext(Javaconfig.class);
	
	  Student s=con.getBean("mystudent",Student.class);
	  
	  System.out.println(s);
	  
	  s.study();
	
	
	
	
	}}
	