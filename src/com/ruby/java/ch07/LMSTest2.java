package com.ruby.java.ch07;

public class LMSTest2 {

	public static void main(String[] args) {
		
		
		Professor p = new Professor("이름",20,"과목");
		System.out.println("17)1:"+p.toString());
		
	
				
		p.setName("김푸름");
		System.out.println("13)set김푸름");
		p.setAge(52);
		System.out.println("14)set52");
		p.setSubject("빅데이터");
		System.out.println("16)set빅데이터");
		
		System.out.println("18000)2:"+p.toString());
		
	}
}
