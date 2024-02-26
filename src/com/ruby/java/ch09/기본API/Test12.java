
package com.ruby.java.ch09.�⺻API;

import java.util.Arrays;

public class Test12 {
	static void showData(String[]arr) {
		System.out.println();
		for (String st: arr)
			System.out.print(st + " -> ");
	}
	static void sortData(String[]arr, int[]arrInt) {
		for (int i = 0; i< arr.length;i++)
		{
			arrInt[i] = Integer.parseInt(arr[i]);
		}
		Arrays.sort(arrInt);//�������� arrInt[]����Ǹ� main������ �����
	}
	static void showNumber(int[]arr) {
		System.out.println();
		for (int n: arr)
			System.out.print(n + " -> ");
	}
	public static void main(String[] args) {
		// string ������ ���� 
		String arr[] = {"12", "291", "135", "25"};
		showData(arr);
		Arrays.sort(arr);
		showData(arr);
		
		int n1 = 10;
		Integer obj1 = n1; // Integer.valueOf(n1)
		//obj1.* - methods�� ����ϱ� ����
		
		Integer obj2 = Integer.parseInt("20");// "9", "12" ���Ľÿ��� 12,9�� �´� �̶� �ʿ�
		int n2 = obj2; // obj2.intValue()
		//obj2.hashCode();
		
		Integer obj3 = 30; // new Integer(30)

		int n3 = obj3 + 40;

		System.out.println("\n" + n1 + " : " + obj1);
		System.out.println(obj2 + " : " + n2);
		System.out.println(n3);
		//������ �迭�� ��ȯ�� ���� 
		int []arrInt = new int[arr.length];
		sortData(arr, arrInt);
		showNumber(arrInt);

	}
}