package com.qa.operators;

public class operators {
	// Add
	public void add(int numOne, int numTwo) {
		System.out.println(numOne + numTwo);
	}

//	Multiply
	public void multiply(int numOne, int numTwo) {
		System.out.println(numOne * numTwo);
	}

//	Subtract
	public void subtract(int numOne, int numTwo) {
		System.out.println(numOne - numTwo);

	}

//	Divide
	public void divide(double numOne, double numTwo) {
		if(numOne < numTwo){
			System.out.println(numOne + numTwo);
		}else {
			System.out.println("Division cannot be performed");
			
		}
		
	}

}
