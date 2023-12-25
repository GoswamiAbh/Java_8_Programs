package com.abhi.stream1;

import java.util.Arrays;
import java.util.List;

public class MapSalary {
	
	public static void main(String[] args) {
		
		emp emp1 = new emp("jhon", 19, 14000.00);
		emp emp2 = new emp("vinod", 19, 18000.00);
		emp emp3 = new emp("karan", 19, 11000.00);
		emp emp4 = new emp("vikram", 19, 16000.00);
		
		List<emp> emps = Arrays.asList(emp1,emp2,emp3,emp4);
		
		emps.stream().filter(i->i.salary>15000.00).map(i->i.name+" - "+i.age).forEach(i->System.out.println(i));
	}

}

class emp{
	String name;
	int age;
	double salary;
	public emp(String name, int age,double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary=salary;
	}
	
	
}
