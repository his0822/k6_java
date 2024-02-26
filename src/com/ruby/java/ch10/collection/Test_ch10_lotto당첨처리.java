package com.ruby.java.ch10.collection;
//���������� �ǽ�

//hashset�� arraylist�� ��ȯ�Ͽ� �����ϱ� ����

/*
 * �ζ� ��÷ ��Ģ:
 * ��: ��ȣ 2��, 1��
 * 5��: ��ȣ 3�� - 5000��
 * 4��: ��ȣ 4�� - 5����
 * 3��: ��ȣ 5�� - 150���� - �Ǹűݾ׿� ����(�Ǹűݾ��� 12.5%)
 * 2��: 3���ȣ + ���ʽ���ȣ - 3000���� - �Ǹ� �ݾ׿� ����, ��÷ Ȯ��: 1,300,000����1
 * 1��: 6�� ���� - ��÷ Ȯ�� 8,000,000 ���� 1, 10�� ~ 30��
 */
//hashset�� arraylist�� ��ȯ�Ͽ� �����ϱ� ����
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;



class ListComparator implements Comparator<List<Integer>> {
	@Override
	public int compare(List<Integer> l1, List<Integer> l2) {
		Iterator<Integer> ait = l1.iterator();
		Iterator<Integer> bit = l2.iterator();
		while (ait.hasNext()) {
			int anum = ait.next();
			int bnum = bit.next();
			if (anum > bnum)
				return 1;
			else if (anum < bnum)
				return -1;

		}
		return 0;
	}
}

public class Test_ch10_lotto��÷ó�� {

	public static void main(String[] args) {

		lotto_generator(10);

	}

	public static void lotto_generator(int n) {
		Random number = new Random();
		List<HashSet<Integer>> lotSet = new ArrayList<>();
		HashSet<Integer> lotto = null;// ����1��
//		List<List<Integer>> al = new ArrayList<>();
		/*
		 * [[35, 40, 27, 29, 14, 31, 15], [0, 1, 18, 38, 6, 24, 29], [16, 32, 0, 18, 34,
		 * 22, 14], [32, 34, 40, 9, 12, 28, 14], [0, 19, 6, 9, 42, 29, 13], [2, 3, 37,
		 * 43, 44, 29, 14], [33, 1, 17, 22, 6, 8, 12], [34, 21, 9, 10, 27, 44, 45], [18,
		 * 34, 23, 9, 28, 29, 15], [32, 6, 23, 24, 10, 27, 43]]
		 */
		for (int i = 0; i < n; i++) {

			lotto = new HashSet<>();
			// ������ �κ�
			for (int j = 0; lotto.size() < 6; j++) {
				lotto.add(1 + number.nextInt(45));
			}
			lotSet.add(lotto); // ���� ��ο� ���� ������ �߰�

		}
		System.out.println("\nlot hashset�� ���\n");
		for (HashSet<Integer> eachLotto : lot) {
			/*
			 * [33 1 17 22 6 8] + ���ʽ���ȣ: 12 [ 0 1 18 38 6 24] + ���ʽ���ȣ: 29
			 */
			// ������ �κ�
		}
//		System.out.println("���� ������::lot = " + al);

//		al.sort(new ListComparator());
//		System.out.println("���� ������::lot = " + al);
		// hashset�� ����Ʈ�� �����ϴ� �˰��� ����
		// hashset�� arrayList�� ��ȯ
		// ��÷��ȣ ��÷
		HashSet<Integer> win = new HashSet<>();
		for (int j = 0; win.size() < 6; j++) {// 6�� ��ȣ�� ���ʽ� ��ȣ
			win.add(1 + number.nextInt(45));
		}
		int bonus = 1 + number.nextInt(45);
		System.out.print("��÷��ȣ: " + win + "���ʽ���ȣ= " + bonus);// 6���� ��÷��ȣ�� ���ʽ���ȣ
		// 6���� ���� ������ ã�´�
		System.out.println();
		winnerLotto(win, bonus, lotSet);// 1���� ã�´�

	}

	static void winnerLotto(HashSet<Integer> w, int bn, List<HashSet<Integer>> lottoSet) {
		// ��÷��ȣ w�� ���Ͽ� ����� ���� ����Ʈ al�� ��� ���� elem�� ���Ͽ� �����Ѵ�
		for (int i = 0; i < lottoSet.size(); i++) {
			// ������ �κ�
			checkWinner(w, bn, lottoSet.get(i));
		}
	}

	static void checkWinner(HashSet<Integer> w, int bonus, List<Integer> elem) {
		// ��÷��ȣ w�� �� ���ڸ� ���� ���� ��Ʈ���� ���ԵǾ� �ִ����� ����
		List<Integer> L = new ArrayList<>(w);
		int count = 0;
		for (int i = 0; i < L.size()-1; i++)
		{
			/*
			 * ��÷��ȣ �� ��ȣ�� � �����ϴ����� elem�� ���Ͽ� ����
			 */
			//������ �κ�
		}
		switch (count) {
		case 0:
		case 1:
		case 2:
			System.out.println("��");
			break;
		case 3:
			System.out.println("5�� ���� " + elem + " ��÷��ȣ:" + w);
			break;
		case 4:
			System.out.println("4�� ���� " + elem + " ��÷��ȣ:" + w);
			break;
		case 5:
//			if (L.get(6).equals(elem.get(6))) { //���ʽ� ��ȣ�� ��ġ�ϴ� ���� ���� 
				System.out.println("2�� ���� " + elem + " ��÷��ȣ:" + w);
				break;
			}
			else {
				System.out.println("3�� ���� " + elem + " ��÷��ȣ:" + w);
				break;
			}
			
		case 6:
			System.out.println("1�� ���� " + elem + " ��÷��ȣ:" + w);
			break;
		}

}}