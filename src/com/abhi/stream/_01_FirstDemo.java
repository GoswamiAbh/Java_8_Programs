package com.abhi.stream;

import java.util.Arrays;
import java.util.List;

public class _01_FirstDemo {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(66,56,43,6,8,90);
		for(Integer i : list) {
			if(i>20) {
				System.out.println(i);
			}
		}
		System.out.println("retrieve data from stream");
		list.stream().filter(e->e>20).forEach(e->System.out.println(e));
	}

}
