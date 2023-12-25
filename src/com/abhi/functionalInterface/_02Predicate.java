package com.abhi.functionalInterface;

import java.util.function.Predicate;

public class _02Predicate {
	
	public static void main(String[] args) {
		
		String[] names = {"Abhi","sbhuham","karan","vinod","Apurva"};
		
		Predicate<String> p = name->name.charAt(0)=='A';
		
		for(String name : names) {
			if(p.test(name)) {
				System.out.println(name);
			}
		}
	}

}
