package com.spring.ambiguity;

public class Addition {                                          //by default string constructor is called coz we write values in string format in xml file
	
	                                                               //if string constructor is not defined then it calls the top order constructor
	private int  a ;
	private int b;                                                //first take only 2 constructor int and double then it will call the cosbntructor which is above
	
	                                                               // then add string constructor then it will call string cons irrespective of its order
	
	private Addition(double a, double b) {                          // to call const of our choice we can define type in xml file
		super();
		this.a = (int) a;
		this.b = (int) b;
		
		System.out.println("constructor: double, double");
		
	}
		
	
	
	
	
	private Addition(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		
		System.out.println("constructor: int, int");
		
	}
	
	
	
	private Addition(String a, String b) {
		super();
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		
		System.out.println("constructor: String, String");
		
	}
		
		
		
		
	
		public void doSum() {
			System.out.println("sum is ="+ (this.a +this.b));
		}

}
