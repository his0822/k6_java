package quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumber2 {

	public static void main(String[] args) {

		System.out.print("입력값:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int s = (int) Math.pow(10.0, (double) (num - 1)); // 입력된 num 값에 대해서 10의 (num-1)승을 한 값, 10,100,1000,...
		int e = (int) Math.pow(10.0, (double) (num)) - 1; // 10의 num 지수승 값 ( 10,100,1000,...)에서 1을 뺀 수 (9,99,999,...)

		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		int i;
		for (i = s; i <= e; i++) {
			list1.add(i);
		}
		
		for (int x : list1) {
			boolean ox = true;

			for (int j = 2; j < x; j++) {
				if (x % j == 0) {
					ox = false;
					break;
				}
			}
			if (ox) {
                list2.add(x);
            }	
		}
		System.out.println(list2);
	}
}