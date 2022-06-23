package com.qa.Vehicle;

public class Car {

	private boolean hasSunRoof;
	private int numOfDoors;

	public Car(boolean hasSunRoof, int numOfDoors) {
		super();
		this.hasSunRoof = hasSunRoof;
		this.numOfDoors = numOfDoors;
	}

	public boolean isHasSunRoof() {
		return hasSunRoof;
	}

	public void setHasSunRoof(boolean hasSunRoof) {
		this.hasSunRoof = hasSunRoof;
	}

	public int getNumOfDoors() {
		return numOfDoors;
	}

	public void setNumOfDoors(int numOfDoors) {
		this.numOfDoors = numOfDoors;
	}
	
	
}

