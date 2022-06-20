package com.qa.EnhancedLoop.java;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	private int[] myIntArrays;

	public static void main(String[] args) {

		List<String> myArray = new ArrayList<>();
		myArray.add("Brenda");
		myArray.add("Gracious");
		myArray.add("Ruth");

		for (String value : myArray) {
			System.out.println(value);
		}

	}

	public boolean questionThree(int input) {

//		This means the number is even % 2
		if (input % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public void questionFour() {
		myIntArrays = null;
		for (int value : myIntArrays) {
			if (questionThree(value)) {
				System.out.println(value * value * value);
			} else {
				System.out.println(value * value);
			}
		}

	}
}
