package quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumber3 {

//	public static void test() {
//
//		System.out.print("입력값:");
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//
//		int s = (int) Math.pow(10.0, (double) (num - 1)); // 입력된 num 값에 대해서 10의 (num-1)승을 한 값, 10,100,1000,...
//		int e = (int) Math.pow(10.0, (double) (num)) - 1; // 10의 num 지수승 값 ( 10,100,1000,...)에서 1을 뺀 수 (9,99,999,...)
//
//		List<Integer> list1 = new ArrayList<>();
//		List<Integer> list2 = new ArrayList<>();
//		List<Integer> list3 = new ArrayList<>();
//
//		
//		for (int i = s; i <= e; i++) {
//			list1.add(i);
//		}
//
//		int exponentN = num;
//		while (exponentN > 0) {
//			for( int c = 1 ; c <= num ; c++) {
//				
//			for (int x : list1) {
//				boolean ox = true;
//
//				for (int j = 2; j < x; j++) {
//					if (x % j == 0) {
//						ox = false;
//						break;
//					}
//				}
//				if (ox) {
//					list2.add(x);
//				}
//
//			}
//			list1.clear();
//			list1.addAll(list2);
//			list2.clear();
//			
//			exponentN = exponentN - 1;
//			list3.add(x / Math.pow(10.0, (double) (exponentN - 1)));
//		}
//		System.out.println(list1);
//	}

	public static void main(String[] args) {

		System.out.print("입력값:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int s = (int) Math.pow(10.0, (double) (num - 1)); // 입력된 num 값에 대해서 10의 (num-1)승을 한 값, 10,100,1000,...
		int e = (int) Math.pow(10.0, (double) (num)) - 1; // 10의 num 지수승 값 ( 10,100,1000,...)에서 1을 뺀 수 (9,99,999,...)

//		
//		
//		while (true) {
//		
//			int ex = num;
//
//			boolean ox = true;
//
//			while (ex > 0) {
//				for (int i = (int) Math.pow(10.0, (double) (ex - 1)); i <= (int) Math.pow(10.0, (double) (ex))
//						- 1; i++) {
//
//					for (int j = 2; j < i / 2; j++) {
//						if (i % j == 0) {
//							ox = false;
//							break;
//						}
//					}
//					if (ox) {
//						int k = i;
//						ex = ex - 1;
//					}
//				} 
//				
//
//				if (ox) {
//					System.out.print(i + ",");
//				}
//			}

		List<Integer> list1 = new ArrayList<>();

		boolean ox = true;
		
		
		for (int i = s; i <= e / 2; i++) {
				
				
				for (int ex = 1; ex <= num; ex++) {

					int currentSN = i / (int) Math.pow(10.0, (double) (ex - 1));
					int currentEN = e;

					for (int j = 2; j < currentEN / 2; j++) {
						if (currentSN % j == 0 || currentSN == 1) {
							ox = false;
							break;
						}

					}
					if (ox) {
						list1.add(currentSN);
					}
				}
				
			}
		}
	}
}
