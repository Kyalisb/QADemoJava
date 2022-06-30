package com.qa.exceptions;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		
		Exercise ex = new Exercise();
		
		try {
			ex.exceptionExercise();
		}catch (DivisionException de) {
			System.out.println();
		}
		}
	}
		
	
	