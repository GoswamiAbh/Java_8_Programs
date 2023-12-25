package com.abhi.stream2;

import java.util.Arrays;
import java.util.List;

public class _09MatchingOperation {
	
	public static void main(String[] args) {
		person p1 = new person("Abhishek", "India");
		person p2 = new person("Jhon", "USA");
		person p3 = new person("Chang", "China");
		person p4 = new person("Kimoti", "Korea");
		person p5 = new person("Mohit", "India");
		
		List<person> persons = Arrays.asList(p1,p2,p3,p4,p5);
		
		boolean status1 = persons.stream().anyMatch(p->p.country.equals("India"));
		
		System.out.println("person belog to any counry which is belog to india ::"+status1);

		boolean status2 = persons.stream().allMatch(p->p.country.equals("USA"));
		System.out.println("all match status :: "+status2);
		
		boolean status3 = persons.stream().noneMatch(p->p.country.equals("India"));
		System.out.println("none match status  :: "+status3);
		
	}

}

class person{
	
	String name;
	String country;
	public person(String name, String country) {
		this.name = name;
		this.country = country;
	}
	
	
}
