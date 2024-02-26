// 입력받은 자릿수에 해당하는 모든 수 중에서 소수만 찾아내기

package edu;
import java.util.Scanner;

public class Test31_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("입력: ");
		int score = sc.nextInt();
	
		
		
		
		
		int i = 2;
		for(; i<score; i++) {
			if( score % i == 0 ) break; 
		
		System.out.println(score);
		}
		
		
		sc.close();
		
		
	}		
}