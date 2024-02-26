package com.ruby.java.ch06;

public class Member2 {
	private String name2;
	private int age2;
	
	public Member2() {
		this("guest");
	}
	
	public Member2(String name2) {
		this(name2,0);
		
	}
	
	public Member2(String name2, int age2) {
		this.name2=name2;
		this.age2= age2;
		
	}
	
	public String toString() {
		return name2+ ":"+age2;
		
	}
	public static void main(String[] args) {
		Member2 m1 = new Member2();
		Member2 m2 = new Member2("Amy");
		Member2 m3 = new Member2("Amy", 23);
		
		System.out.println(m1.toString());
		System.out.println(m2.toString());
		System.out.println(m3.toString());
	}
	
}
