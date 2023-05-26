package com.spring.ambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext con=new ClassPathXmlApplicationContext("com/spring/ambiguity/config.xml");
		
		Addition add=(Addition) con.getBean("add");
		
		 add.doSum();
	}

}
