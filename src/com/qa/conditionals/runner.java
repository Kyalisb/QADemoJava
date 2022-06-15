package com.qa.conditionals;

import com.qa.calculator.Calculator;

public class runner {
	public static void main(String[] args) {

		Calculator calc = new Calculator();
		
		calc.add(8, 8);
		calc.multiply(6, 8);
		calc.subtract(30, 9);
		calc.divide (15, 6);
		
		

	}
}
