package com.spring.component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext con=new ClassPathXmlApplicationContext("com/spring/component/config.xml");
	
		
		  Student s=con.getBean("student",Student.class);
		  
		  System.out.println(s);
		 
		
		
	
		 
		 //scope
	 Student s1=con.getBean("student",Student.class);
	 
	 System.out.println(s1.hashCode());
	 
	 
 Student s2=con.getBean("student",Student.class);
	 
	 System.out.println(s2.hashCode());
	 
	 
	
	}

}
