package com.ruby.java.ch14;


interface NumberFunc{
	int func(int n);
}

interface NumberFunc1{
	int func1(int n);
}
interface NumberFunc2{
	int func2(int n);
}
interface NumberFunc3{
	int func3(int n, int m);
}

public class Test05 {

	public static void main(String[] args) {
		
		NumberFunc sum = (n) ->{
			int result = 0 ;
			for( int i = 0 ; i <= n ; i++) {
				result +=i ;
			}
			return result;
		};
		
		NumberFunc1 sum1 = (n) ->{
			int result = 0 ;
			for( int i = 0 ; i <= n/2 ; i++) {
				result += 2*i ;
			}
			return result;
		};
		
		NumberFunc2 sum2 = (n) ->{
			int result = 0 ;
			for( int i = 0 ; i <= n/2-1 ; i++) {
				result += 2*i+1 ;
			}
			return result;
		};
		
		NumberFunc3 sum3 = ( n , m ) ->{
			int result = 0;
			for ( int i = 0 ; i <= n ; i++) {
				if ( (i)%2 == m ) {
					result += i ;
				}
			}
			return result;
		};
		
	
		System.out.println("1���� 10������ �� : " + sum.func(10));
		System.out.println("1���� 100������ �� : " + sum.func(100));
		
		System.out.println("1���� 10������ ¦���� : " + sum1.func1(10));
		System.out.println("1���� 100������ ¦���� : " + sum1.func1(100));
		
		System.out.println("1���� 10������ Ȧ���� : " + sum2.func2(10));
		System.out.println("1���� 100������ Ȧ���� : " + sum2.func2(100));
		
		System.out.println("1���� 10������ Ȧ���� : " + sum3.func3(10,1));
		System.out.println("1���� 10������ ¦���� : " + sum3.func3(10,0));
	}
}
