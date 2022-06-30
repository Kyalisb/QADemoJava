package com.qa.Solid.singleresponsibility;

public class Mechanic {

	public void paintCar(car car, String newColour) {
		car.setColour(newColour);

	}
	
	public void changeSpoiler(car car, boolean flag) {
		car.setHasSpoiler(flag);
	}
}
