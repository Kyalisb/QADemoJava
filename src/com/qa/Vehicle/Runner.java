package com.qa.Vehicle;

public class Runner {

	public static void main(String[] args) {
		
		Vehicle car = new Vehicle ("Lorry", 3, "White");
		Vehicle motorBike = new Vehicle ("Scooter", 50, "Black");
		Vehicle van = new Vehicle ("Citroen", 4, "Red");
	
		
		
		Garage g = new Garage ();
		g.add(car);
		g.add(motorBike);
		g.add(van);

	}
}
