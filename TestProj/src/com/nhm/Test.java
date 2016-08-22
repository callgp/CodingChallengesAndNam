package com.nam;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child x = new Child();
		Base y = (Base) x;
		y.foo();
		
		Car car = new Car();
		Car.Wheel wheel = new Car.Wheel();
		wheel.test(car);

		//Output:
	}

}
