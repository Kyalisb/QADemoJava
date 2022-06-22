package com.qa.strings;

public class Runner {
	public static void main(String[] args) {

		String weather = "yesterday it was raining";
		String weather2 = "today it is sunny";

		System.out.println("weather2");
		System.out.println("weather");

//		2nd assignment to concatenate.

		String thirdString = weather2 + ", " + weather;
		System.out.println(thirdString);

//		Capitalising strings

		String thirdStringUpper = thirdString.toUpperCase();
		System.out.println(thirdStringUpper);

//		Using substring method

		String str1 = "yesterday it was raining";
		String str2 = "today it is sunny";

		String mySubString1 = str2.substring(0, 11);
		String mySubString2 = str1.substring(16, 24);
		System.out.println(mySubString1 + mySubString2);

	}

}
