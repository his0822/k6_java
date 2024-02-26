package com.ruby.java.ch02;

public class Test3 {
	public static void main(String[] args) {
		// <71page>
		// float exchangeRate = 1236.50; == 에러 발생
//		float exchangeRate = (float)1236.50; // type casting == 에러 해결1
		float exchangeRate = 1236.50f; // == 에러 해결2
		String st = "Good Day! How are you OK?";
		int num = 2147483647 ; // int 사이즈는 4바이트 = 32비트 (1byte=8비트)
		// num 변수의 사이즈 확인?
		int numSize = Integer.SIZE;
		System.out.println("numSize= " + numSize);
		// long d = 2147483648 ; == 에러 발생
		long d = 2147483648L ; //== 에러 해결
		// d 변수가 8바이트인지 확인?
		int dSize = Long.SIZE;
		System.out.println("dSize= " + dSize);
	}
}
