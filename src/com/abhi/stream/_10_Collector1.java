package com.abhi.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _10_Collector1 {
	
	public static void main(String[] args) {
		Per p1 = new Per("John", "USA");
		Per p2 = new Per("Steve", "JAPAN");
		Per p3 = new Per("Ashok", "INDIA");
		Per p4 = new Per("Ching", "CHINA");
		Per p5 = new Per("Kumar", "INDIA");
		
		List<Per> list = Arrays.asList(p1,p2,p3,p4,p5);
		
		List<Per> collect = list.stream().filter(p->p.country.equals("INDIA")).collect(Collectors.toList());
		collect.forEach(s->System.out.println(s));
		
	}

}
class Per {

	String name;
	String country;

	public Per(String name, String country) {
		this.name = name;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", country=" + country + "]";
	}

}