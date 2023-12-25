package com.abhi.functionalInterface;

import java.util.function.Function;

public class _06Function {
	
	public static void main(String[] args) {
		
		Function<String , Integer> f=(name)->name.length();
		
		System.out.println(f.apply("Abhishek"));
		System.out.println(f.apply("Amit"));
	}

}
