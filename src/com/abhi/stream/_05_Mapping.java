package com.abhi.stream;

import java.util.Arrays;
import java.util.List;

public class _05_Mapping {
	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Ashok", "Anil", "Raju", "Rani", "John", "Akash", "Charles");
		
		names.stream().filter(u->u.startsWith("A")).map(u->u.toUpperCase()).forEach(u->System.out.println(u));
	}

}
