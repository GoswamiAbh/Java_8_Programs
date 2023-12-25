package com.abhi.stream1;

import java.util.Arrays;
import java.util.List;

public class MapStartWithAPrintLength {
	
	public static void main(String[] args) {
		
		List<String> asList = Arrays.asList("India","usa","uk","Japan");
		
		asList.stream().filter(i->i.startsWith("I")).map(i->i.length()).forEach(i->System.out.println(i));

	}

}
