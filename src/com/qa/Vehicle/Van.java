package com.qa.Vehicle;

public class Van extends Vehicle {

	private int storageSpace;

	public Van(String brand, int engine, String colour, int storageSpace) {
		super(brand, engine, colour);
		this.storageSpace = storageSpace;
	}

	public int getStorageSpace() {
		return storageSpace;
	}

	public void setStorageSpace(int storageSpace) {
		this.storageSpace = storageSpace;
	}

}
