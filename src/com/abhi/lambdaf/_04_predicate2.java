package com.abhi.lambdaf;

import java.util.function.Predicate;

public class _04_predicate2 {
	public static void main(String[] args) {
		
		String[] names = {"Palak","Pooja","Shivani","Shivani","Apurva","Rohani","Vaishnavi"};
		
		Predicate<String> p = s->s.charAt(0)=='S';
		for(String name : names) {
			if(p.test(name)) {
				System.out.println(name);
			}
		}
	}

}
