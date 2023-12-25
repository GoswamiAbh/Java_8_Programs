package com.abhi.stream;

import java.util.stream.Stream;

public class _14_Parallel_Stream {
	
	public static void main(String[] args) {
		
		System.out.println("=====serial stream=======");
		Stream<Integer> ss = Stream.of(1,2,3,4,5);
		ss.forEach(n->System.out.println(n+" :: "+Thread.currentThread()));
		
		System.out.println("========parallel Stream======");
		
		Stream<Integer> pl = Stream.of(1,2,3,4,5);
		pl.parallel().forEach(n->System.out.println(n + " :: "+Thread.currentThread()));
	}

}
