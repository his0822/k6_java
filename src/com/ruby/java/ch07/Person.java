package com.ruby.java.ch07;

public class Person {

	private String name;
	private int age;
	
	public Person() {
		this.name = name;
		System.out.println("1)Person_this.name");
		this.age = age;
		System.out.println("2)Person_this.age");
		System.out.println("3)Person constructor");
	}	
	
	
	
	public String getName() {
		System.out.println("Person_getName");
		return name;
		
	}
	public void setName(String name) {
		
		this.name = name;
		System.out.println("7)Person_String name");
	}
	public int getAge() {
		System.out.println("8)Person_getAge");
		return age;
		
	}
	public void setAge(int age) {
		this.age = age;
		System.out.println("9)Person_setAge");
	}
	
	public String toString() {
		System.out.println("12)Person_String toString");
		return "Person [name=" + name + ", age=" + age ;
	}
	 
	
}
