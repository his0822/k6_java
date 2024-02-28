package com.ruby.java.ch13.nonGen;

class Bag {
	private Object thing;

	public Bag(Object thing) {
		this.thing = thing;
	}

	public Object getThing() {
		return thing;
	}

	public void setThing(Object thing) {
		this.thing = thing;
	}

	void showType() {
		System.out.println("Object의 타입은 " + thing.getClass().getName());
	}
}

class Book {}
class PencilCase {}
class Notebook {}

public class BagTest {

	public static void main(String[] args) {
		Bag bag = new Bag(new Book());
		Bag bag2 = new Bag(new PencilCase());
		Bag bag3 = new Bag(new Notebook());

		bag.showType();
		bag2.showType();
		bag3.showType();

		bag = bag2; // 제네릭이 아니면 덮어쓰기 되지만, 제네릭은 불가능하게 막아줌
		
	}
}