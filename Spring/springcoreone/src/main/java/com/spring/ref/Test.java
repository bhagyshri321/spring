package com.spring.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		  ApplicationContext con= new ClassPathXmlApplicationContext("com/spring/ref/refconfig.xml");
		
		 A a= (A) con.getBean("aref");
		 
		 System.out.println(a.getX());
		 System.out.println(a.getOb().getY());
		  
		  
		  
	}
	
}
