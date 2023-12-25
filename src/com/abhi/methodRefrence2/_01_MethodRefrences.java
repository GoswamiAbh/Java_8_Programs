package com.abhi.methodRefrence2;

interface MyInterfaces{
	public void m1();
	
}

public class _01_MethodRefrences {
	
	public static void m2() {
		System.out.println("m2 method :: called");
	}
	
	public static void main(String[] args) {
		MyInterfaces mi = _01_MethodRefrences::m2;
		mi.m1();
	}
	
	

}
