package com.ruby.java.ch09.�⺻API;

//���� �ǽ� �ڵ�
import java.util.Scanner;
public class Test_String�迭�˻� {
	static void getData(String[] arr) {
		Scanner sc = new Scanner(System.in);
		
		for() {
			arr[i] = sc.next();
		}
						
	}
	static void showData(String[] arr) {
		

	}
	/*
	 * ���� 407 Test02: if (s1 == s2)
	 * ���� 409 Test02: if (s1.equals(s2))
	 * compareTo() ��� 
	 */
	static boolean findString(String[] arr, String st) {
		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] == st)
//			if (arr[i].equals(st))
			if (arr[i].compareTo(st) == 0)
		}
		System.out.println(st + "�迭�� ����");
		return false;
	}
	public static void main(String[] args) {
		String[]arr= new String[5];
		//ȭ�鿡�� �Է�
		getData(arr);
		showData(arr);
		Scanner sc = new Scanner(System.in);
		String st = sc.next();
		boolean result = findString(arr, st);
		if (result)
			System.out.println();

	}
}
