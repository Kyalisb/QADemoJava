package com.qa.Solid.singleresponsibility;

public class Runner {
	
	public static void main(String[]args) {
		
		car mycar = new Car("black", "A5", 5000);

		System.out.println(mycar.getMileage());

		Driver driver = new Driver();

		driver.drive(mycar, 500);

		System.out.println(mycar.getMileage());
		
		

	}

}
