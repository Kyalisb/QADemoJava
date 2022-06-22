package com.qa.Person;

public class Runner {

	public static void main(String[] args) {

		Person brenda = new Person("Brenda", 24, "Nurse");
		Person gracious = new Person("Gracious", 24, "Doctor");
		Person ruth = new Person("Ruth", 24, "Doctor");

//    since its private to get the name calling. we need to write the name.get eg. brenda.getname

		brenda.getName();
		gracious.getName();
		ruth.getName();

		Person p = new Person();

		p.add(brenda);
		p.add(gracious);
		p.add(ruth);

		p.printList();

		p.search("brenda");

	}

}
