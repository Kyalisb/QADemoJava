package com.qa.StreamExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExercise {

	public static void main(String[] args) {
		
		List<String> listOfNames = new ArrayList<>();
		
		listOfNames.add("Micheal");
		listOfNames.add("Dean");
		listOfNames.add("James");
		listOfNames.add("Chris");
		
		Stream<String> ListOfNamesStream = listOfNames.stream();
		
		ListOfNamesStream.filter(name -> ! listOfNames.contains("j")). forEach(value -> system.out.println("Hello " + value));
		
		
		
	}
	
}
