package com.ruby.java.ch09.�⺻API;
//iterator ���� �ǽ� 
import java.util.StringTokenizer;

public class Test14 {
	public static void main(String[] args) {

		String msg = "Although the world is full of suffering, it is full also of the overcoming of it.";
		StringTokenizer st1 = new StringTokenizer(msg);
		System.out.println("�ܾ� �� : " + st1.countTokens());
		while (st1.hasMoreTokens()) {
			System.out.print(st1.nextToken() + " + " );
		}
		System.out.println();
		StringTokenizer st11 = new StringTokenizer(msg, ",.");
		System.out.println("�ܾ� �� : " + st11.countTokens());
		while (st11.hasMoreTokens()) {
			System.out.print(st11.nextToken() + " + " );
		}
		System.out.println("\n================");
		String s = "id=guest&name=Amy&pwd=1004";
		StringTokenizer st2 = new StringTokenizer(s, "&");
		while (st2.hasMoreTokens()) {
			System.out.println("�����ִ� ��ū �� : " + st2.countTokens());
			System.out.println(st2.nextToken());
		}

		System.out.println("================");
		StringTokenizer st3 = new StringTokenizer(s, "=&");
		while (st3.hasMoreTokens()) {
			System.out.println(st3.nextToken());
		}
	}
}