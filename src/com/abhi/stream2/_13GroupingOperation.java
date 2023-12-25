package com.abhi.stream2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class _13GroupingOperation {
	
	public static void main(String[] args) {
		Emp2 e1 = new Emp2("abhi", 18, 48000.00,"India");
		Emp2 e2 = new Emp2("kabhi", 28, 458000.00,"India");
		Emp2 e3 = new Emp2("tabhi", 48, 56000.00,"USA");
		Emp2 e4 = new Emp2("jabhi", 58, 77000.00,"USA");
		Emp2 e5 = new Emp2("habhi", 78, 87000.00,"China");
		Emp2 e6 = new Emp2("fabhi", 28, 44000.00,"China");
		
		List<Emp2> emps = Arrays.asList(e1,e2,e3,e4,e5,e6);
		
		Map<String, List<Emp2>> gropBy = emps.stream().collect(Collectors.groupingBy(e->e.country));
		System.out.println(gropBy);
	}

}

class Emp2{
	
	String name;
	int age;
	Double salary;
	String country;
	public Emp2(String name, int age, Double salary,String country) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.country=country;
	}
	@Override
	public String toString() {
		return "Emp2 [name=" + name + ", age=" + age + ", salary=" + salary + ", country=" + country + "]";
	}
	
	
	
	
}

