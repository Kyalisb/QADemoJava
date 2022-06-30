package com.qa.streamslambdas;

import java.util.ArrayList;
import java.util.List;

public class LambdaDemo {

	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<>();
		myList.add(1);
		myList.add(2);
		myList.add(3);
		myList.add(4);
		myList.add(5);

		for (Integer value : myList) {
			System.out.println(value * 10);

			myList.forEach(value -> System.out.println(value * 10));
		}

	}
}
