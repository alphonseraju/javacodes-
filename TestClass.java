package com.mypackage.oopsconcepts;

public class TestClass {
	int age;
	String name;
	
	public void getDetailes(int age, String name) {
		this.age = age;
		this.name = name;
		System.out.println("Employee name is: " + name + "\n" + "Employee age is : " + age);
	}
	
	public static void main(String[] args) {
		TestClass tc = new TestClass();
		tc.getDetailes(25, "Shanker");
	}
}
