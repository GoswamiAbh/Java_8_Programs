package com.abhi.lambdaf;

@FunctionalInterface
interface Vehicle{
	public void start();
	
	 default void m1() {
		System.out.println("m1::method called");
	}
	
	public default void m2() {
		System.out.println("m2::method called");
	}
	
    public static void clean() {
	System.out.println("cleaning completed");
		
	}
}

public class _01_Fubtional_Interface implements Vehicle{
	public static void main(String[] args) {
		
		_01_Fubtional_Interface c = new _01_Fubtional_Interface();
		c.start();
		
		c.m1();
		c.m2();
		
		
		Vehicle.clean();
		
	}

	@Override
	public void m1() {
		System.out.println("m1 method overides:: ");
		Vehicle.super.m1();
	}
	@Override
	public void start() {
		System.out.println("car started....!!!");
		
	}
	@Override
	public void m2() {

		System.out.println("override method");
		Vehicle.super.m2();
	}
	
}

