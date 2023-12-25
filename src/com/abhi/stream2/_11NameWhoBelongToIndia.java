package com.abhi.stream2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _11NameWhoBelongToIndia {
	
	public static void main(String[] args) {
		person2 p1 = new person2("Abhishek", "India");
		person2 p2 = new person2("Jhon", "USA");
		person2 p3 = new person2("Chang", "China");
		person2 p4 = new person2("Kimoti", "Korea");
		person2 p5 = new person2("Mohit", "India");
		
		List<person2> persons = Arrays.asList(p1,p2,p3,p4,p5);
		
		persons.stream().filter(p->p.country.equals("India"))
						.map(p->p.name.toUpperCase() +" == "+p.country.toUpperCase())
						.collect(Collectors.toList()).forEach(i->System.out.println(i));
		

		
	}

}

class person2{
	
	String name;
	String country;
	public person2(String name, String country) {
		this.name = name;
		this.country = country;
	}
	@Override
	public String toString() {
		return "person2 [name=" + name + ", country=" + country + "]";
	}
	
	
}
