package com.abhi.stream2;

import java.util.Arrays;
import java.util.List;

public class _03AgeAndStart {
	
	public static void main(String[] args) {
		User u1 = new User(11, "Abhi");
		User u2 = new User(22, "Amit");
		User u3 = new User(19, "Shubham");
		User u4 = new User(11, "Kiran");
		User u5 = new User(10, "Ashu");
		
		List<User> list = Arrays.asList(u1,u2,u3,u4,u5);
		
		list.stream().filter(p->p.age>18)
					.filter(p->p.name.startsWith("A"))
					.map(p->p.age+" = "+p.name)
					.forEach(i->System.out.println(i));
		
	}

}

class User{
	int age;
	String name;
	public User(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	
}
