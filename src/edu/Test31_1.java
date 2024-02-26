package edu;
import java.util.Scanner;

public class Test31_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("입력: ");
		int score = sc.nextInt();

		//	방법1		
//		int i = 2;
//		for(; i<score ; i++) {
//			if(score%i == 0) {
//				System.out.println(score+"=>소수가 아닙니다"); break;
//			} else {
//				System.out.println(score+"=>소수입니다"); break;
//			}
//		}
//	}
//
		
		
		//방법2
//	 boolean flag = false;
//	 for(int i = 2 ; i<score ; i++) {
//		 if(score % i == 0 ) {
//			 flag = true;
//			 break;
//		 }
//	 }
//	 System.out.println(flag?"소수가 아닙니다.":"소수입니다.");
//	sc.close();
//	}
		
		
		//방법3
		int i = 2;
		for(; i<score; i++) {
			if(score % i ==0 ) break;
		}
		System.out.println((i<score)?"소수가 아닙니다.":"소수입니다.");
		sc.close();
	
	}
}

			