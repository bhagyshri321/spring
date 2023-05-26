package com.spring.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		
	ApplicationContext con=new 	ClassPathXmlApplicationContext("com/spring/constructor/ciconfig.xml");
		
	Person per= (Person) con.getBean("Person1");
	
	System.out.println(per);
	
	}

}
