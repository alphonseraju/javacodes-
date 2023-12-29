package com.My.packages.opps;

public class classandobject {
	static {
		System.out.println("static block is executed");
	}
	
	// attributes / fields 
	int age = 23;
	String name = "Raju";
	
	static String aadharCard = "6575785585";
	
	public void getName() {
		System.out.println(name);
	}
	
	public void getAge() {
		System.out.println(age);
	}
	
	public static void getDetailes() {
		System.out.println(aadharCard);	
	}
	
	public static void main(String[] args) {
		getDetailes();
	}
}
