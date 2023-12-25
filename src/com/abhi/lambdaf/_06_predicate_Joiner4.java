package com.abhi.lambdaf;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class _06_predicate_Joiner4 {
	
	public static void main(String[] args) {
		Emp emp1 = new Emp("amit", "purniya", "devp");
		Emp emp2 = new Emp("saffu", "supol", "db");
		Emp emp3 = new Emp("abhi", "bhopal", "hr");
		Emp emp4 = new Emp("amit", "hyd", "Devops");
		
		List<Emp> emps = Arrays.asList(emp1,emp2,emp3,emp4);
		Predicate<Emp> p1 = (e)-> e.location.equals("supol");
		
		Predicate<Emp> p2 = (e)-> e.dept.equals("db");
		
		Predicate<Emp> p3 = (e)-> e.name.equals("saffu");
		
		Predicate<Emp> p = p1.and(p2).and(p3);
		
		for(Emp emp : emps) {
			if(p.test(emp)) {
				System.out.println(emp.name+" == "+emp.location+" == "+emp.dept);
			}
		}
	}

}

class Emp{
	String name;
	String location;
	String dept;
	
	public Emp(String name,String location,String dept) {

		this.name=name;
		this.location=location;
		this.dept=dept;
	}
}
