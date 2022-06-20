package com.qa.FlowOfControl;

public class Scope {

//   TYPES OF SCOPES - Class Level scope, Method scope
//   The idea of where things are accessible or not. 
//	 Where things are accessible and seen.
//	 Class level scope - Is when you put a variable on top of the class. EG
	public static String message = "Hello";

	public static void methodOne() {

		System.out.println("methodLevelMsg");
	}

	public static void main(String[] args) {
		methodOne();
		System.out.print(message);
	}

}
