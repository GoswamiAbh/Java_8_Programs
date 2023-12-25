package com.abhi.stream2;

import java.util.Arrays;
import java.util.List;

public class _02NameStartWithA {
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("abhi","apurva","saffu","tarun","nisantha","ashu");
		
		list.stream().filter(p->p.startsWith("a")).forEach(i->System.out.println("hello ,"+i));
	}

}
