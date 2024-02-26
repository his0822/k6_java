package com.ruby.java.ch06;

public class StaticMethodTest {
	int num = 123;
	

	public static void main(String[] args) {
	StaticMethodTest.print1();
	StaticMethodTest exam = new StaticMethodTest();
	exam.print2();
	}
	public static void print1() {
		System.out.println("Hello");
	}
	public void print2() {
		System.out.println("java");
	}
}



