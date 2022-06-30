package com.qa.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExercise {
	
	public void questionOne() {

	Scanner scanner = new Scanner(System.in);

	System.out.println("please enter two intergers: ");

	try
	{
		int numOne = scanner.nextInt();
		int numTwo = scanner.nextInt();
		System.out.println(numOne / numTwo);

	}catch(
	InputMismatchException ime)
	{
		System.out.println("Invalid input");
	}catch(
	ArithmeticException ae)
	{
		e.printStackTrace();

	}
}
