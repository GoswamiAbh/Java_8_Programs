package com.abhi.functionalInterface;

import java.util.function.Predicate;

public class _01Predicate {
	
	public static void main(String[] args) {
		Predicate<Integer> p = i->i>10;
		
		System.out.println(p.test(11));
		System.out.println(p.test(5));
 	}

}
