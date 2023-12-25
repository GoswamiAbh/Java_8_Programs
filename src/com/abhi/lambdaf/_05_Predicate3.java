package com.abhi.lambdaf;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class _05_Predicate3 {

	public static void main(String[] args) {

		Person p1 = new Person("Amit", 24);
		Person p2 = new Person("Shubham", 15);
		Person p3 = new Person("saffu", 17);
		Person p4 = new Person("abhishek", 26);
		Person p5 = new Person("nisantha", 24);
		
		List<Person> persons = Arrays.asList(p1,p2,p3,p4,p5);
		Predicate<Person> predicate = p -> p.age <=18;
		
		for(Person person:persons) {
			if(predicate.test(person)) {
				System.out.println(person.name +" "+person.age);
			}
		}

	}

}

class Person {
	String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}
