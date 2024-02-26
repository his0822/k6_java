package com.ruby.java.ch02;

public class Test07 {

	public static void main(String[] args) {
		boolean isOn = false;
		while(!isOn) {
			//반복 실행
			
		}
		short e = 10;
		//short f = -e; == 에러 발생
		int f = -e; // == 에러 해결
		int a = 10;
		int b,c = 0;
		b = a++;
		c = ++a;
		System.out.println("b="+b+", c="+c);
		System.out.println("a="+a);
		boolean result1 = b == c;
		System.out.println("result1 = "+result1);
		b = ++a;
		c = a++;
		System.out.println("b="+b+", c="+c);
		System.out.println("a="+a);
		boolean result2 = b == c;
		System.out.println("result2 = "+result2);
		
	}

}
