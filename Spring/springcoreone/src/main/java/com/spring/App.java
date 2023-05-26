package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main (String[]args) {
		
		System.out.println("Hello World");
		
	ApplicationContext con=	  new ClassPathXmlApplicationContext("config.xml");
	
	Student  student=(Student)con.getBean("student");
	
	Student  student1=(Student)con.getBean("student1");
	
	
	
	System.out.println(student);
	

	System.out.println(student1);
	

	
	
		
		
	}

}
