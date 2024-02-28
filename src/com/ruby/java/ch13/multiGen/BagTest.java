package com.ruby.java.ch13.multiGen;


class Bag<T,N>{
	private T thing;
	private N name;
	
	public Bag(T thing, N name) {
		this.thing = thing;
		this.name = name;
	}

	public N getName() {
		return name;
	}

	public void setName(N name) {
		this.name = name;
	}

	public T getThing() {
		return thing;
	}

	public void setThing(T thing) {
		this.thing = thing;
	}
	
//	public Bag() {
//		// TODO Auto-generated constructor stub
//	}
	
	void showType() {
		System.out.println("T�� Ÿ���� "+ thing.getClass().getName());
		System.out.println("N�� Ÿ���� "+ name.getClass().getName());
	}
}


class Book {
	public String toString() {
		return "å";
	}
}
class PencilCase{}
class Notebook{}

public class BagTest{
	
	public static void main(String[] args) {
//		Bag<Book> bag = new Bag<>(new Book());
//		Bag<PencilCase> bag2 = new Bag<>(new PencilCase());
//		Bag<Notebook> bag3 = new Bag<>(new Notebook());
//		
//		bag.showType();
//		bag2.showType();
//		bag3.showType();
		
		
		Bag<Book,String> bag = new Bag<>(new Book(), "����");
		
		bag.showType();
		
		Book book = bag.getThing();
		String name = bag.getName();
		
		System.out.println("Thing is : " + book);
		System.out.println("Name is : " + name);
		
		
//		bag = bag2;
		
	}
}