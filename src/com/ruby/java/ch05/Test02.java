package com.ruby.java.ch05;

public class Test02 {

	static void test(String name, int...apple) {
		System.out.print(name + " || ");
		
		for(int samsung : apple)
			System.out.print(samsung + " | ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		test("오정임",98,85,88);
		test("김푸름",90,95,92);
		test("김하늘",80,98,95);
		
	}
}
