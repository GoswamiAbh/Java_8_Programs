package com.abhi.stream;

import java.util.Arrays;
import java.util.List;

public class _06_Mapping {
	
	public static void main(String[] args) {
		Employee e1 = new Employee("Amit", 18, 72000);
		Employee e2 = new Employee("Saffu", 24, 20000);
		Employee e3 = new Employee("Shivani", 22, 55000);
		Employee e4 = new Employee("Abhishek", 8, 20000);
		Employee e5 = new Employee("Vivek", 15, 29000);
		
		List<Employee> list = Arrays.asList(e1,e2,e3,e4,e5);
	
		list.stream().filter(u->u.salary>=50000).map(u->u.name +"--"+u.age).forEach(System.out::println);
	}

}

class Employee{
	String name;
	int age;
	double salary;
	
	public Employee(String name,int age,double salary) {

		this.name=name;
		this.age=age;
		this.salary=salary;
		
	}
}
