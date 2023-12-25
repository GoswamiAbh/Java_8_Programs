package com.abhi.functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class _03Predicate {
	
	public static void main(String[] args) {
		
		Person p1 = new Person("Jhon", 26);
		Person p2 = new Person("Abhi", 18);
		Person p3 = new Person("Karan", 16);
		Person p4 = new Person("Viod", 28);
		
		List<Person> persons = Arrays.asList(p1,p2,p3,p4);
		
		Predicate<Person> p = i->i.age>=18;
		
		for(Person person : persons) {
			if(p.test(person)) {
				System.out.println(person.name);
			}
		}
		
		
	}

}
class Person{
	String name;
	int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
}
