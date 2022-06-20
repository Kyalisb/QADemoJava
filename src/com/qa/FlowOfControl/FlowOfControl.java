package com.qa.FlowOfControl;

public class FlowOfControl {

// Code execution STARTS in the main method
// Then it runs line by line 
//	The order of how Java runs the coding
public static void methodSix() {
	System.out.println("Line 6");
	
}
	
public static void main(String[] args) {
	System.out.println("Line 1");
	methodSix();
	System.out.println("Line 2");
	System.out.println();
	System.out.println("Line 3");
	System.out.println("Line 4");
	System.out.println("Line 5");
}
}