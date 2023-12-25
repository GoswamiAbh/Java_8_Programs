package com.abhi.methodRefrence2;

public class _02_InstanceMethodRef {
	
	public void m1() {
		for(int i = 0;i<=5;i++) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		
		_02_InstanceMethodRef im = new _02_InstanceMethodRef();
		Runnable r = im :: m1;
		Thread t = new Thread(r);
		t.start();
			
			
	}

}
