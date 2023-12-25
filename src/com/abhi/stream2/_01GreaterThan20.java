package com.abhi.stream2;

import java.util.Arrays;
import java.util.List;

public class _01GreaterThan20 {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(12,22,3,4,44,64,75,20);
		
		list.stream().filter(p->p>20).forEach(i->System.out.println(i));
	}

}
