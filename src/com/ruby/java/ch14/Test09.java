package com.ruby.java.ch14;

interface Calculator {
	int func();
}

public class Test09 {

	static int num1 = 10;
	int num2 = 20;

	public static void main(String[] args) {
		Test09 test = new Test09();
		int num3 = 30;

		Calculator calc = () -> {
			int num4 = 40;
			Test09.num1++;
			test.num2++;
			test.num1++;
//			num3++;   -- 람다식이 쓰여져 있는 상위의 동일한 메소드 내에 선언된 지역변수는 사용가능하지만 수정불가하다
			num4++;
			return num4;
		};
	}
}
