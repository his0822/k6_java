package com.ruby.java.ch02;

public class Test16 {

	public static void main(String[] args) {
		byte a = 23;
		int b = a;
		
		//a = b; == 에러 발생
		//a = (byte)b; == 에러 해결
		System.out.println(a);
		System.out.println(b);
		
		byte i = 10;
		byte j = 20;
		byte k = (byte)(i + j);
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);

	}

}
