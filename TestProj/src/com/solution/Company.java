package com.solution;
// Comapny: Super-Parent Class
class Company {
 
	// public static method which can not be overridden in Java
	public static void staticMethod() {
		System.out.println("Company: Static Instance method");
	}
 
	// non static method
	public void nonStaticMethod() {
		System.out.println("Company: non-Static method");
		System.out.println("test commit in git");
	}
}
 
