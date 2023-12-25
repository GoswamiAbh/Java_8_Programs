package com.abhi.stream2;

import java.util.Arrays;
import java.util.List;

public class _07FlatMap {
	
	public static void main(String[] args) {
		
		List<String> javaCourse = Arrays.asList("Java","Spring","Jdbc","Servlets");
		
		List<String> uiCourse = Arrays.asList("Html","Css","JavaScript","Angular");
		
		List<List<String>> courses = Arrays.asList(javaCourse,uiCourse);
		
		courses.stream().forEach(i->System.out.println(i));
		
		System.out.println("====flat MAp=======");
		
		courses.stream().flatMap(s->s.stream()).forEach(i->System.out.println(i));
	}

}
