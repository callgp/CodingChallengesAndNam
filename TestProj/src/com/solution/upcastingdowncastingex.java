package com.solution;

public class upcastingdowncastingex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		dog.eat(); 
		Animal anim = dog;
		anim.eat();
		anim.bark();//The compiler always, always verify method call based on the reference types, not on the actual object at runtime. That's why the above code gives compile error, event it looks like the real object is a Dog object.

	}

}
