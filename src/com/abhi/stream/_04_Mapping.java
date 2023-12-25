package com.abhi.stream;

import java.util.Arrays;
import java.util.List;

public class _04_Mapping {
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("India","Usa","Uk","Japan");
	
		list.stream().filter(u->u.startsWith("I")).map(u->u.toUpperCase()).forEach(u->System.out.println(u));
	}

}
