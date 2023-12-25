package com.abhi.stream1;

import java.util.Arrays;
import java.util.List;

public class FirstDemo {
	
	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(20,33,12,16,19);
		
		asList.stream().filter(i->i>18).forEach(i->System.out.println(i));
	}

}
