package com.abhi.stream1;

import java.util.Arrays;
import java.util.List;

public class DistinctOperation {
	
	public static void main(String[] args) {
		
		List<String> distinct = Arrays.asList("ravi","rani","ravi","vikaram","rani");
		
		distinct.stream().distinct().forEach(i->System.out.println(i));
		
	}

}
