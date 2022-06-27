package com.qa.Vehicle;

public class Vehicle {
	
	private String brand;
	private int engine;
	private String colour;
	
	
	public Vehicle(String brand, int engine, String colour) {
		super();
		this.brand = brand;
		this.engine = engine;
		this.colour = colour;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getEngine() {
		return engine;
	}
	public void setEngine(int engine) {
		this.engine = engine;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	
	public void calculateBill() {
		System.out.println("");
	}
	

	
	

}
