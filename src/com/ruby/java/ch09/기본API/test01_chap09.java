package com.ruby.java.ch09.�⺻API;
class MyObject {
	public MyObject() {}
	public String toString() {
		return "MyObject";
	}
}
public class test01_chap09 {
	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();
		Object obj3 = new Object();

		System.out.println("obj1.hashCode()=" + obj1.hashCode());//����� ����
		System.out.println(Integer.toHexString(obj1.hashCode()));
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());

		Class c = obj1.getClass();
		System.out.println(c.getName());

		System.out.println(obj1);//toString() ����� ���� ������ �ڵ����� Ÿ�� ĳ���� ������ > ������ hexa�� ������ ��
		System.out.println(obj1.toString());//399 ������ �ϴ��� Ŭ���� �̸��� string
		System.out.println(obj2);
		System.out.println(obj3);

		MyObject obj4 = new MyObject();
		System.out.println(obj4);
		MyObject obj5 = new MyObject();
		//obj4.equals(obj5) //MyObject�� equals()�� �����
		if (obj4.equals(obj5)) {//hashcode�� �ٸ��� �ٸ� ��ü�� ���� -������ hashcode�� ���� �Ǵ��Ѵ�
			System.out.println("���� ��ü�̴�.");//MyObject Ŭ�������� equals()�� �������� ���
		} else {
			System.out.println("�ٸ� ��ü�̴�.");//Object�� equal() ���ÿ���, 403������ ���� 
		}
		System.out.println(obj4.hashCode() + ":" + obj5.hashCode());
		if (obj4 == obj5) {
			System.out.println("���� ��ü�̴�.");
		} else {
			System.out.println("�ٸ� ��ü�̴�.");
		}
		System.out.println("obj4 = " + obj4);
		MyObject mo2 = new MyObject();//402�������� toString() �������̵�
		System.out.println(mo2);
	}
}