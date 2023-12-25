package com.abhi.functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class _05Consumer {
	
	public static void main(String[] args) {
		
		Consumer<String> c=(name)->System.out.println(name +" , Good Morning");
		
		c.accept("abhishek");
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		list.forEach(i->System.out.println(i));
	}

}
