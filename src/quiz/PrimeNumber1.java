package quiz;

import java.util.Scanner;

public class PrimeNumber1 {

	public static void main(String[] args) {

		System.out.print("�Է°�:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for (int i = 2; i <= a / 2; i++) {
			if (a % i == 0) {
				System.out.println("�Ҽ���");
				break;
			} else {
				System.out.println("�Ҽ��ƴ�");
				break;
			}
		}
	}
}
