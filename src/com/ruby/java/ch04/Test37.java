package com.ruby.java.ch04;

import java.util.Random;

public class Test37 {

	public static void main(String[] args) {
		//난수 생성하기
		Random rnd = new Random(); //Random 클래스 - 난수 생성과 관련된 클래스
		int [] score = new int[20];
		for (int i = 0 ; i < score.length; i++) {
			score[i] = rnd.nextInt(20);
			
		}
//		for (int num : score)
//			System.out.print(num+" ");

		for (int i = 0 ; i < score.length; i++) {
			if  (i % 4 == 0) // 가로줄에 숫자가 4개가 쓰이고 나면 다음줄로 넘기기
				System.out.println();
			if (score[i]<10)
				System.out.print(" "); // 세로 줄을 맞추기 위해서 10보다 작은 수는 앞에 띄어쓰기를 하나 추가함
			System.out.print(score[i] + " "); //다음 숫자마다 가로줄 한칸씩 띄어쓰기
		}
		
		int sum = 0;
		int max = 0;
		int min = 999;
		double avg = 0.0;
		
		for (int i = 0 ; i < score.length; i++) {
			sum += score[i];
			if(max < score[i])
				max = score[i];
			if(min > score[i])
				min = score[i];
		}
		avg = sum / score.length;
		System.out.println("\n");
		System.out.println("총 점 : " + sum);
		System.out.println("평 균 : " + avg);
		System.out.println("최댓값 : " + max);
		System.out.println("최솟값 : " + min);
	}

}
