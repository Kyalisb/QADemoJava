package com.qa.Solid.singleresponsibility;

public class Driver {
	
	public void drive(car car, int milesDriven) {
		
		car.setMileage(car.getMileage() + milesDriven);
	}
}
