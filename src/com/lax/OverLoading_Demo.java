package com.lax;

public class OverLoading_Demo {

	public void demo() {
		System.out.println("I'm first method");
	}
	public void demo(int a) {
		System.out.println("I'm second method");
	}
	public static void main(String[] args) {
		OverLoading_Demo oDemo=new OverLoading_Demo();
		oDemo.demo();
		oDemo.demo(10);
	}
}
