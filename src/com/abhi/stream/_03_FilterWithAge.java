package com.abhi.stream;

import java.util.Arrays;
import java.util.List;

public class _03_FilterWithAge {
	
	public static void main(String[] args) {
		
		User u1 = new User("Abhishek",38);
		User u2 = new User("Amit",20);
		User u3 = new User("Jitesh",46);
		User u4 = new User("Kiran",16);
		User u5 = new User("Ankita",8);
		User u6 = new User("Shivani",17);
		
		List<User> list = Arrays.asList(u1,u2,u3,u4,u5,u6);
		
		list.stream().filter(u -> u.age>18 && u.name.startsWith("A")).forEach(u -> System.out.println(u));
		
	}
	

}

class User{
	String name;
	int age;
	
	public User(String name,int age) {
		this.name=name;
		this.age=age;
		
	}

	public String toString() {
		return "User[name=" + name + ",age="+ age +"]";
		
	}
}
