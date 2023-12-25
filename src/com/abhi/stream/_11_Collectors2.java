package com.abhi.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _11_Collectors2 {
	
	public static void main(String[] args) {
		Person3 p1 = new Person3("John", "USA");
		Person3 p2 = new Person3("Steve", "JAPAN");
		Person3 p3 = new Person3("Ashok", "INDIA");
		Person3 p4 = new Person3("Ching", "CHINA");
		Person3 p5 = new Person3("Kumar", "INDIA");
		
		List<Person3> persons = Arrays.asList(p1, p2, p3, p4, p5);
		// collect names of persons who are belongs to india and store into names collection
		
		List<String> collect = persons.stream().filter(u->u.country.equals("INDIA")).map(p->p.name).collect(Collectors.toList());
		System.out.println(collect);
	}

}
class Person3 {

	String name;
	String country;

	public Person3(String name, String country) {
		this.name = name;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Person3 [name=" + name + ", country=" + country + "]";
	}

}
