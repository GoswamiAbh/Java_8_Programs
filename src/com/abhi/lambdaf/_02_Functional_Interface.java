package com.abhi.lambdaf;

@FunctionalInterface
interface MyIntrface{
	public void m1() ;
}

public class _02_Functional_Interface {
	public static void main(String[] args) {
		
		MyIntrface mit = ()-> System.out.println("m1 method called ....!!!");
		
		mit.m1();
	}

}
