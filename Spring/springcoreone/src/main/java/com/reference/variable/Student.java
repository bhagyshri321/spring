package com.reference.variable;

public class Student {
	
	public Samosa samosa;
	


	Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}

	public Samosa getSamosa() {
		return samosa;
	}

	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}
	
public void study() {
	
	this.samosa.display();
		
		System.out.println("I am studying");
		
		
	}

	
	
}

