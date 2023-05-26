package com.spring.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		
		ApplicationContext con=new ClassPathXmlApplicationContext("com/spring/collection/collecconfig.xml");

		  Emp emp=(Emp) con.getBean("Emp1");
		  
		  System.out.println(emp.getName());
		  
		  System.out.println(emp.getAdd());
		  
		  System.out.println(emp.getCourses());
		  
		  System.out.println(emp.getPhones());
		  
		  System.out.println(emp.getPhones().getClass().getName());
		  
		
		
		
	}

}
