package com.ruby.java.ch04;

import java.util.Random;

public class Test38 {

	public static void main(String[] args) {
		int arr[][] = new int [5][5];
		Random rand = new Random();
		for (int i = 0; i < arr.length; i++)
			for(int j = 0; j < arr[0].length; j++)
				arr[i][j] = rand.nextInt(999);
		
		for (int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				if (arr[i][j]>99)
					System.out.print(""+arr[i][j]);
				else if (arr[i][j]>9 && arr[i][j]<=99)
					System.out.print(" "+arr[i][j]);
				else 
					System.out.print("  "+arr[i][j]);
			
				System.out.print(arr[i][j]+ "\t");
			}
			System.out.println();
						
		}
		
		
		
		
//		System.out.println("행수:"+arr.length );//행의 길이
//		System.out.println("열수:"+arr[0].length );// 열의길이
//		arr[0][0] = 1;
//		arr[0][1] = 2;
//		
//		int arr2[][] = {{1,2},{3,4,7,8},{5,6,9}}; //ragged array 코딩주의 필요
//		System.out.println(arr2);
		
	}

}
