package com.abhi.stream2;

import java.util.Arrays;
import java.util.List;

public class _08SclicingOperation {

	public static void main(String[] args) {

		List<String> courses = Arrays.asList("Java", "Spring", "Jdbc", "Servlets","Html", "Css", "JavaScript", "Angular");
//wahi tk prent krega jo number doge
		courses.stream().limit(3).forEach(i->System.out.println(i));
//aage ki skip krke uske baad pring krwa dega	
		courses.stream().skip(3).forEach(i->System.out.println(i));
		
		
		List<String> names = Arrays.asList("Java", "Spring", "Jdbc", "Java","Html", "Css", "Java", "Angular");
		
		System.out.println("===========distinct=============");
		names.stream().distinct().forEach(i->System.out.println(i));
		

	}

}
