package com.ruby.java.ch14;


interface MyInterface{
	public void print();
}

class MyClass1 implements MyInterface{
	@Override
	public void print() {
		System.out.println("MyClass1");
	}
}

class MyClass2 implements MyInterface{
	@Override
	public void print() {
		System.out.println("MyClass2");
	}
}


public class Test01 {

	public static void test(MyInterface mi) {
		mi.print();
	}
	
	public static MyInterface test2() {
		MyInterface mi = new MyInterface() {
			@Override
			public void print() {
				System.out.println("test2() �޼��忡�� ��ȯ�� MyInterface");
			}
		};
		return mi;
	}
	
	public static void main(String[] args) {
		
		MyClass1 mc1 = new MyClass1();
		MyClass2 mc2 = new MyClass2();
		mc1.print();
		mc2.print();
		
		MyInterface mi = new MyInterface() {
			@Override
			public void print() {
				System.out.println("�͸� Ŭ������ ����");
			}
		};
		
		test(mc1);
		test(mi);
		
		mi.print();
		
		(new MyInterface() {
			@Override
			public void print() {
				System.out.println("����, ����, ȣ���� �ѹ��� ó��");
				
			}
		}).print();

		MyInterface mi2 = test2();
		mi2.print();
	}
}
