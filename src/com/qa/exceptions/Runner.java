package com.qa.exceptions;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("What's the number to divide with?");
		
		try {
			int n = scan.nextInt();
			System.out.println(n);
		}catch(Exeption e) {
			System.out.println("please enter a number");
		}
		
		
//		int num1, num2;
//		
//		
//		try {
//			int[] a = {20, 2};
//			System.out.println(a[2]);
//		} catch (Exception e) {
//			System.out.println("An exception happened!");
//		}
			
			
		}
		
		
	}

//		Scanner scanner = new Scanner(System.in);
//
//		System.out.println("Please enter a integer:");
//
//		int numberOne = 0;

//		try {
//			numberOne = scanner.nextInt();
//			System.out.println("The number you entered was: " + numberOne);
////		} catch (InputMismatchException ime) {
////			System.out.println("You didn't enter an integer");
//            scanner.nextLine();
