package com.abhi.functionalInterface;

import java.util.function.Supplier;

public class _04Supplier {
	public static void main(String[] args) {
		
		Supplier<String> s = ()->{
			String otp="";
			for(int i=1;i<=5;i++) {
				otp =otp+(int)(Math.random()*10);
			}
			return otp;
		};
		
		System.out.println(s.get());
	}

}
