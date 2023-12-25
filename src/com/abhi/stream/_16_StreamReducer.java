package com.abhi.stream;

import java.util.Arrays;

public class _16_StreamReducer {

	public static void main(String[] args) {
		int[] num = {1,2,3,4,5};
		
		int sum =0;
		for(int i : num) {
			sum = sum+i;
		}
		System.out.println(sum);
		
		//reduce stream 
		int reduce = Arrays.stream(num).reduce(0,(a,b) -> a+b);
		System.out.println(reduce);
	}
}
