package com.standalone.collec;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 ApplicationContext con=new ClassPathXmlApplicationContext("com/standalone/collec/config.xml");

	  Person p= (Person) con.getBean("per");
	  
	  System.out.println(p);
	  
	  System.out.println(p.getFriends().getClass().getName());
	
	}

}
