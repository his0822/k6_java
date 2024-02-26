package com.ruby.java.ch09.�⺻API;
/*
 * ==, s1.equals(s2)
 */
public class Test02 {

	public static void main(String[] args) {

		String s1 = new String("java");//heap�� ��ü ����
		String s3 = new String("java");
		String s2 = "java";//�����Ϸ��� static ������ ������ ������ �Ŀ� ����
		String s4 = "java";

		System.out.println(System.identityHashCode(s1)+":" + System.identityHashCode(s3));//���� ��
		System.out.println(s1 + " : "+ s3.toString());
		System.out.println(s2.hashCode()+":" + s4.hashCode());//���� ��
		if (s1 == s3) {			
			System.out.println("s1 == s3::���� ��ü�̴�.");
		} else {
			System.out.println("s1 == s3::�ٸ� ��ü�̴�.");
		}
		
		System.out.println(System.identityHashCode(s2)+":" + System.identityHashCode(s4));//���� ��
		System.out.println(s2.hashCode()+":" + s4.hashCode());//���� ��
		s1.equals(s4);
		if (s2 == s4) {
			System.out.println("s2 == s4::���� ��ü�̴�.");
		} else {
			System.out.println("s2 == s4::�ٸ� ��ü�̴�.");
		}
		if (s1.equals(s3)) {//Object�� equal()�� overriding - hash code�� �ƴ� ������ ���ϵ��� String class���� �������� ��
			System.out.println("s1.equals(s3)::���� ���ڿ��� �����ϴ�.");
		} else {
			System.out.println("s1.equals(s3)::�ٸ� ���ڿ��� �����ϴ�.");
		}
		if (s1 == s2) {//Object�� equal()�� overriding - hash code�� �ƴ� ������ ���ϵ��� String class���� �������� ��
			System.out.println("s1 ==s2 ::���� ���ڿ��� �����ϴ�.");
		} else {
			System.out.println("s1 != s2::�ٸ� ���ڿ��� �����ϴ�.");
		}
		if (s1 == s2) {//Object�� equal()�� overriding - hash code�� �ƴ� ������ ���ϵ��� String class���� �������� ��
			System.out.println("s1 ==s2 ::���� ���ڿ��� �����ϴ�.");
		} else {
			System.out.println("s1 != s2::�ٸ� ���ڿ��� �����ϴ�.");
		}
		if (s2 == s4) {//Object�� equal()�� overriding - hash code�� �ƴ� ������ ���ϵ��� String class���� �������� ��
			System.out.println("s2 == s4 ::���� ���ڿ��� �����ϴ�.");
		} else {
			System.out.println("s2 != s4::�ٸ� ���ڿ��� �����ϴ�.");
		}
		if (s2.equals(s4)) {
			System.out.println("s2.equals(s4)::���� ���ڿ��� �����ϴ�.");
		} else {
			System.out.println("s2.equals(s4)::�ٸ� ���ڿ��� �����ϴ�.");
		}
		if (s1.equals(s4)) {
			System.out.println("s1.equals(s4)::���� ���ڿ��� �����ϴ�.");
		} else {
			System.out.println("s1.equals(s4)::�ٸ� ���ڿ��� �����ϴ�.");
		}

		System.out.println("s1 = " + s1 + ", s2 = " + s2);
		String s5 = "JAVA";

		if (s1.equals(s5)) {
			System.out.println("s1.equals(s5)::���� ���ڿ��� �����ϴ�.");
		} else {
			System.out.println("s1.equals(s5)::�ٸ� ���ڿ��� �����ϴ�.");
		}

		if (s1.equalsIgnoreCase(s5)) {
			System.out.println("s1.equalsIgnoreCase(s5)::���� ���ڿ��� �����ϴ�.");
		} else {
			System.out.println("s1.equalsIgnoreCase(s5)::�ٸ� ���ڿ��� �����ϴ�.");
		}
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}
}