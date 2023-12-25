package com.abhi.stream2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _10CollectorsOperation {
	
	public static void main(String[] args) {
		 person1 p1 = new person1("Abhishek", "India");
		 person1 p2 = new person1("Jhon", "USA");
		 person1 p3 = new person1("Chang", "China");
		person1 p4 = new person1("Kimoti", "Korea");
		person1 p5 = new person1("Mohit", "India");
		
		List<person1> persons = Arrays.asList(p1,p2,p3,p4,p5);
		
		persons.stream().filter(p->p.country.equals("India")).collect(Collectors.toList()).forEach(p->System.out.println(p));

		
	}

}
class person1{
	
	String name;
	String country;
	public person1(String name, String country) {
		this.name = name;
		this.country = country;
	}
	@Override
	public String toString() {
		return "person1 [name=" + name + ", country=" + country + "]";
	}
	
	
	
	
}