package com.abhi.stream1;

import java.util.Arrays;
import java.util.List;

public class FlatMapCourses {
	
	public static void main(String[] args) {
		List<String> back = Arrays.asList("java","spring","microservices");
		
		List<String> ui = Arrays.asList("html","css","javascript");
		
		List<List<String>> flatMap = Arrays.asList(back,ui);
		
		
		flatMap.stream().forEach(i->System.out.println(i));
		
	}

}
