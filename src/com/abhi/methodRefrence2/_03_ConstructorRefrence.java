package com.abhi.methodRefrence2;

import java.util.function.Supplier;

class Person {
	public Person() {

		System.out.println("Person constructor called");
	}
}
public class _03_ConstructorRefrence {
	
	public static void main(String[] args) {
		Supplier<Person> d = Person::new;
		Person p = d.get();
		System.out.println(p.hashCode());
		
	}

}
