package com.ruby.java.ch07;

public class Professor extends Person {

	private String subject;
	
	public Professor(String name, int age, String subject) {
//		super();
		
		this.subject = subject;
		System.out.println("4)Professor_this.subject");
		
		System.out.println("5)Professor constructor");
	}

	public String getSubject() {
		System.out.println("6)Professor_getSubject");
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
		System.out.println("11)Professor_setSubject");
		}
	
	public String toString() {
		System.out.println("10)Professor_String toString");
		return super.toString() + ", subjet =" + subject + "]";
	}
	
}
