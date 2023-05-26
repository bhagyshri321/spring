package com.bean.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {
	
	public static void main(String[] args) {
		
		ApplicationContext con= new AnnotationConfigApplicationContext(JavaConfig.class);
		
		Student s =  con.getBean("getStudent",Student.class);
		
		System.out.println(s);
		
		s.study();
		
		
	}

}
