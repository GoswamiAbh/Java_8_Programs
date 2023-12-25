package com.abhi.lambdaf;

import java.util.function.Predicate;

public class _03_Predicate_Function {
	
	public static void main(String[] args) {
		
		int [] i = {12,3,34,44,54};
		
	
		Predicate<Integer> p = d ->(d>10);
		for(int num : i) {
			if(p.test(num)) {
				System.out.println(num);
			}
		}
		
		Predicate<Integer> p1 = d ->(d>10);
		System.out.println(p1.test(100));
		System.out.println(p1.test(9));
	}
	

}
