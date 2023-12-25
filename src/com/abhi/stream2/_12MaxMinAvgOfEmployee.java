package com.abhi.stream2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class _12MaxMinAvgOfEmployee {
	
	public static void main(String[] args) {
		
		Emp1 e1 = new Emp1("abhi", 18, 48000.00);
		Emp1 e2 = new Emp1("kabhi", 28, 458000.00);
		Emp1 e3 = new Emp1("tabhi", 48, 56000.00);
		Emp1 e4 = new Emp1("jabhi", 58, 77000.00);
		Emp1 e5 = new Emp1("habhi", 78, 87000.00);
		Emp1 e6 = new Emp1("fabhi", 28, 44000.00);
		
		List<Emp1> emps = Arrays.asList(e1,e2,e3,e4,e5,e6);
		
		Optional<Emp1> minSalary = emps.stream().collect(Collectors.minBy(Comparator.comparing(e->e.salary)));
		System.out.println("MInimum Salary :: "+minSalary.get().salary);
		
		
		Optional<Emp1> maxSalary = emps.stream().collect(Collectors.maxBy(Comparator.comparing(e->e.salary)));
		System.out.println("Maximum salary :: "+maxSalary.get().salary);
		
		Double avgSalary = emps.stream().collect(Collectors.averagingDouble(e->e.salary));
		System.out.println("Average Salary :: "+avgSalary);
	}

}
class Emp1{
	
	String name;
	int age;
	Double salary;
	public Emp1(String name, int age, Double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Emp1 [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
	
}
