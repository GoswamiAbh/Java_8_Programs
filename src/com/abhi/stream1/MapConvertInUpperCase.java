package com.abhi.stream1;

import java.util.Arrays;
import java.util.List;

public class MapConvertInUpperCase {
	
	public static void main(String[] args) {
		List<String> asList = Arrays.asList("India","usa","uk","Japan");
		
		asList.stream().map(name->name.toUpperCase()).forEach(i->System.out.println(i));
	}

}
