package com.abhi.stream1;

import java.util.Arrays;
import java.util.List;

public class AgeIsGreaderThan {
	
	public static void main(String[] args) {
		
		Person p1 = new Person("Jhon", 26);
		Person p2 = new Person("Abhi", 18);
		Person p3 = new Person("Karan", 16);
		Person p4 = new Person("Viod", 28);
		
		List<Person> asList = Arrays.asList(p1,p2,p3,p4);
		asList.stream().filter(p->p.age>18).map(p->p.name).forEach(i->System.out.println(i));
		
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
