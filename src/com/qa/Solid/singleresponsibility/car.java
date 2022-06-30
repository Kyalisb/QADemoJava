package com.qa.Solid.singleresponsibility;

public class car {
	private String colour;
	private String model;
	private int mileage;
	private boolean hasSpoiler;
	

	
	public car(String colour, String model, int mileage, boolean hasSpoiler) {
		super();
		this.colour = colour;
		this.model = model;
		this.mileage = mileage;
		this.hasSpoiler = hasSpoiler;
	}



	public String getColour() {
		return colour;
	}



	public void setColour(String colour) {
		this.colour = colour;
	}



	public String getModel() {
		return model;
	}



	public void setModel(String model) {
		this.model = model;
	}



	public int getMileage() {
		return mileage;
	}



	public void setMileage(int mileage) {
		this.mileage = mileage;
	}



	public boolean isHasSpoiler() {
		return hasSpoiler;
	}



	public void setHasSpoiler(boolean hasSpoiler) {
		this.hasSpoiler = hasSpoiler;
	}

	
}
