package com.ruby.java.ch04;

public class Test32 {

	public static void main(String[] args) {

		int[] score;
		score = new int[] {1,2,3,4,5,6,7,8,9,10,11,12};
		int num = score.length;
		
		String str = "nice day";
		int snum = str.length();
		
		System.out.println("num = " + num);
		System.out.println("snum = " + snum);
		
//		int[]arr = new int[5];0
//		arr[0] = 10; //arr의 0번지에 10 저장
//		arr[1] = 20; //arr의 1번지에 20 저장
//		arr[2] = 30; //arr의 2번지에 30 저장
//		arr[3] = 40; //arr의 3번지에 40 저장
//		arr[4] = 50; //arr의 4번지에 50 저장
		
		int[] arr = {10,20,30,40,50};
		
		for (int i=0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
//		System.out.println(arr[0]); //arr의 0번지 값 출력
//		System.out.println(arr[1]); //arr의 1번지 값 출력
//		System.out.println(arr[2]); //arr의 2번지 값 출력
//		System.out.println(arr[3]); //arr의 3번지 값 출력
//		System.out.println(arr[4]); //arr의 4번지 값 출력
				
	}

}
