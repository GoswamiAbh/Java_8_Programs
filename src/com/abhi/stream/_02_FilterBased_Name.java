package com.abhi.stream;

import java.util.Arrays;
import java.util.List;

public class _02_FilterBased_Name {
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("John","Anamika","Anupam","Vijay");
	
		list.stream().filter(i -> i.startsWith("A")).forEach(e->System.out.println(e));
		
	}

}
