package com.qa.exceptions;

import java.util.jar.JarException;

public class ExceptionExample {

	public void multiplyException(int numOne, int numTwo) throws Exception {
	if(numOne == 5 || numTwo == 5) {
		throw new JarException("can't multiply by 5");
		
	System.out.println(numOne * numTwo);
	}
	
	}
