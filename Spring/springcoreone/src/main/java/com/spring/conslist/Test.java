package com.spring.conslist;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		
		ApplicationContext con= new ClassPathXmlApplicationContext("com/spring/conslist/config.xml");
	
	    Person per=(Person) con.getBean("person1");
	
	    
	    System.out.println(per);
	
	}

}
