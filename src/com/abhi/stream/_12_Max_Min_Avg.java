package com.abhi.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

// Write a java program to get MAX, MIN and AVG salary from given employees data using Stream API.

public class _12_Max_Min_Avg {
	
	public static void main(String[] args) {
		
		Employe e1 = new Employe(1, "Robert", 26500.00);
		Employe e2 = new Employe(2, "Abraham", 46500.00);
		Employe e3 = new Employe(3, "Ching", 36500.00);
		Employe e4 = new Employe(4, "David", 16500.00);
		Employe e5 = new Employe(5, "Cathy", 25500.00);

		List<Employe> list = Arrays.asList(e1, e2, e3, e4, e5);
		//MAximum Salary
		Optional<Employe> collect = list.stream().collect(Collectors.maxBy(Comparator.comparing(e->e.salary)));
		System.out.println("MaximimSalary :: "+collect.get().name);
		
		//Minimum Salary
		Optional<Employe> min = list.stream().collect(Collectors.minBy(Comparator.comparing(e->e.salary)));

		System.out.println("minimum Salary :: "+min.get().name);
		
		//Average salary
		
		Double avg = list.stream().collect(Collectors.averagingDouble(e->e.salary));
		System.out.println(avg );
	}

}
class Employe {
	int id;
	String name;
	double salary;

	public Employe(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
}