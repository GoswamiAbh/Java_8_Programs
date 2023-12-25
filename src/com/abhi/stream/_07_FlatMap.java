package com.abhi.stream;

import java.util.Arrays;
import java.util.List;

public class _07_FlatMap {
	
	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Abhi","Amit","saffu");
		
		List<String> courses = Arrays.asList("html","css","javaScript");
		
		List<List<String>> list = Arrays.asList(names , courses);
		
		list.stream().flatMap(s->s.stream()).forEach(u->System.out.println(u));
	}

}
