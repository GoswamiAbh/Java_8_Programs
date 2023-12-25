package com.abhi.stream1;

import java.util.Arrays;
import java.util.List;

public class StartWithA {
	
	public static void main(String[] args) {
		
		List<String> asList = Arrays.asList("Jhon","Vinod","Abhi","Apurva");
		
		asList.stream().filter(i->i.charAt(0)=='A').forEach(i->System.out.println(i));
		
	}

}
