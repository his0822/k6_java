package com.ruby.java.ch02;

public class Test15 {

	public static void main(String[] args) {
		char c = 'F';
		String gender;
		if (c == 'F')
			gender = "여자";
		else
			gender = "남자";
		//String gender = (c == 'F') ? "여자" : "남자" ; === 92page 3항연산자 참고 
		//( ) 속에 있는 선행식이 참이면 ? 뒤를 표시, 거짓이면 : 뒤를 표시
		//( )는 조건절 if 의미, ?는 then 의미, :는 else 의미
		System.out.println(gender);
		
	}

}
