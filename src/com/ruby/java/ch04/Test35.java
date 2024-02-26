package com.ruby.java.ch04;

public class Test35 {

	public static void main(String[] args) {
		String []st = {"apple","banana","peach","pineapple"};
			
		int[] arr = {1,2,3,4,5};
		
		int i;
		int sum=0;
		for( i=0 ; i<3 ; i++) { // for( int i=0 ; i<3 ; i++) 로 하면 에러발생, i의 int 변수선언은 1번만.
			System.out.println(arr[i]);
			sum += i;
		}
		
		for(String stx : st) {
			System.out.println(stx); //간결한 코딩 -  
		}	
		
		for(int num: arr) {
			System.out.println(num);
		}
		
		
	}

}
