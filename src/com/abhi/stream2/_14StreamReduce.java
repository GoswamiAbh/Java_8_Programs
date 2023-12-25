package com.abhi.stream2;

import java.util.Arrays;

public class _14StreamReduce {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6};
		
//		int sum = 0 ;
//		for(int i : arr) {
//			sum = sum+i;
//		}
//		System.out.println(sum);
		
		int reduce = Arrays.stream(arr).reduce(0, (a,b)->a+b);
		System.out.println(reduce);
	}

}
