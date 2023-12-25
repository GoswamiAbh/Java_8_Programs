package com.abhi.stream2;

import java.util.Arrays;
import java.util.List;

public class _05StartWithAAndLength {
	
	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("india","usa","uk","japan","china","Austria");
		
		names.stream().filter(p->p.startsWith("A")).map(p->p+" = "+p.length()).forEach(i->System.out.println(i));
	}

}
