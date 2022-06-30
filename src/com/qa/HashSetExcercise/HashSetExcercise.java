package com.qa.HashSetExcercise;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExcercise {

	public static void main(String[] args) {
		
		HashSet<String> h = new HashSet<String>();
		h.add("Brenda");
		h.add("Gracious");
		h.add("Robert");
		h.add("Ahurra");
		h.add("Ruth");
		
		Iterator<String> it = h.iterator();
		while(it.hasNext()) {
//			System.out.println(it.next());
		}
		
//		for each entry in the collection, the provided method will run.
//		order is - Argument, value
	
		 h.forEach(value -> System.out.println(value));
		
	}
}
