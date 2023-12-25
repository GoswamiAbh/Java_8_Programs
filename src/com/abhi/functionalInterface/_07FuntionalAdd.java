package com.abhi.functionalInterface;

import java.util.function.BiFunction;

public class _07FuntionalAdd {
	
	public static void main(String[] args) {
		
		BiFunction<Integer, Integer ,Integer> f =(a,b)->a+b;
		
		int sum = f.apply(10, 20);
		System.out.println(sum);
	}

}
