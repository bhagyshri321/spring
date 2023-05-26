package com.config.file;

import org.springframework.stereotype.Component;

@Component("mystudent")
public class Student {
	
	public void study() {
		
		System.out.println("student is reading book");
	}
	
	

}
