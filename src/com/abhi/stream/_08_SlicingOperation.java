package com.abhi.stream;

import java.util.Arrays;
import java.util.List;

public class _08_SlicingOperation {
	
	public static void main(String[] args) {
		

		List<String> javacourses = Arrays.asList("corejava", "advjava", "springboot", "restapi", "microservices");
//limit ( long maxSize )  => Get elements from the stream based on given size

		javacourses.stream().limit(3).forEach(u->System.out.println(u));
		
//skip (long n)  => It is used to skip given number of elements from starting position of the stream 

		javacourses.stream().skip(1).forEach(u->System.out.println(u));

//distinct ( )  => To get unique elements from the Stream
		List<String> names = Arrays.asList("raja", "rani", "raja", "rani", "guru");
		names.stream().distinct().forEach(name->System.out.println(name));
		
	}

}
