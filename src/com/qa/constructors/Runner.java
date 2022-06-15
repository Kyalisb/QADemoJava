package com.qa.constructors;

public class Runner {

	public static void main(String[] args) {
		// DataType variableName = value
		Person anoush = new Person("anoush", 29, 12); // new person object
		anoush.name = "Anoush Lowton";
		anoush.age = 29;
		anoush.shoeSize = 11;

		Person tom = new Person("tom", 24, 11); // new person object
		tom.name = "tom Wilson";
		tom.age = 15;
		tom.shoeSize = 10;

		System.out.println(anoush.name);
		System.out.println(anoush.age);
		System.out.println(anoush.shoeSize);
		System.out.println();
		System.out.println(tom.name);
		System.out.println(tom.age);
		System.out.println(tom.shoeSize);
	}

}
