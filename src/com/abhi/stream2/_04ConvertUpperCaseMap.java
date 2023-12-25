package com.abhi.stream2;

import java.util.Arrays;
import java.util.List;

public class _04ConvertUpperCaseMap {
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("india","usa","uk","japan","china");
		
		list.stream().map(p->p.toUpperCase()).forEach(i->System.out.println(i));
	}

}
