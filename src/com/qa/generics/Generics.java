package com.qa.generics;

import java.util.List;

public class Generics {
	
	public class Cage<T extends Animal> {

	    private List<T> list;

	    public void add(List<T> list) {
	        this.list = list;
	    }

	    public List<T> get() {
	        return list;
	    }

}
	
	public class Cage<T extends Mammal & Reptile> {

	    private List<T> list;

	    public void add(List<T> list) {
	        this.list = list;
	    }

	    public List<T> get() {
	        return list;
	    }
	}
