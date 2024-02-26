package com.ruby.java.ch02;

public class Test13 {

	public static void main(String[] args) {
		byte a = 0b00010001;
		byte b = 0b00100010;
		//byte d = (~a);
		int c = a & b; //0
		System.out.println(Integer.toBinaryString(c));
		int d = a | b;//110011
		System.out.println(Integer.toBinaryString(d));
		int e = a ^ b; // 110011
		System.out.println(Integer.toBinaryString(e));
		int f = 12;
		int g  = (~f) + 1; //12//two's complement
		System.out.println("g="+g);
		int h = f << 1; //왼쪽으로 1비트 이동? 2배
		System.out.println("h="+h);
		int i = f >> 1; //오른쪽으로 1비트 이동? 1/2배
		System.out.println("i="+i);

	}

}
