package com.abhi.stream2;

import java.util.stream.Stream;

public class _06SalaryGreaterThanAndName {
	
	public static void main(String[] args) {
		
		Emp e1 = new Emp("abhi", 18, 48000.00);
		Emp e2 = new Emp("kabhi", 28, 458000.00);
		Emp e3 = new Emp("tabhi", 48, 56000.00);
		Emp e4 = new Emp("jabhi", 58, 77000.00);
		Emp e5 = new Emp("habhi", 78, 87000.00);
		Emp e6 = new Emp("fabhi", 28, 44000.00);
		
		Stream<Emp> emps = Stream.of(e1,e2,e3,e4,e5,e6);
		
		emps.filter(emp->emp.salary>=50000.00).map(e->e.name+" = "+e.age).forEach(i->System.out.println(i));
		

	}

}

class Emp{
	
	String name;
	int age;
	Double salary;
	public Emp(String name, int age, Double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	
}
