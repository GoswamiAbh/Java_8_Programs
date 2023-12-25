package com.abhi.stream;

import java.util.Arrays;
import java.util.List;

public class _09_MatchingOperation {
	
	public static void main(String[] args) {
		
		Person p1 = new Person("John", "USA");
		Person p2 = new Person("Steve", "JAPAN");
		Person p3 = new Person("Ashok", "INDIA");
		Person p4 = new Person("Ching", "CHINA");
		
		List<Person> list = Arrays.asList(p1,p2,p3,p4);
		//Terminal Operations
		//  boolean anyMatch (Predicate p )
		boolean anyMatch = list.stream().anyMatch(p->p.country.equals("INDIA"));
		System.out.println("Any Idian Available ? :: "+anyMatch);
		
		
		//  boolean allMatch (Predicate p )
		boolean allMatch = list.stream().allMatch(p->p.country.equals("INDIA"));
		System.out.println("Any Idian Available ? :: "+allMatch);
		
		
		//  boolean noneMatch (Predicate p )

	boolean noneMatch = list.stream().noneMatch(p->p.country.equals("Maxico"));
		System.out.println("Any Idian Available ? :: "+noneMatch);
		
		
	}

}
class Person {

	String name;
	String country;

	public Person(String name, String country) {
		this.name = name;
		this.country = country;
	}

}