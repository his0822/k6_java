package com.ruby.java.ch08;
/*
 * enum Ŭ������ ���Ͽ� �Ʒ� �ڵ带 �н��ϴ� ���� �߿��ϴ�
 * �ڷᱸ�� �ڵ��� ���� ���� �н����� �� �ʿ�
 * enum Ŭ������ �����ڴ� ���� ȣ��Ǵ°�? ���ذ� �ʿ� 
 */
import java.util.Scanner;

//�ڷᱸ���ÿ� ���
enum Mandarin {
	�ݱ�(600), �Ѷ��(500), ������(300), õ����(400), Ȳ����(800);

	private int price;
	//enum�� ������: enum ������� �����ڸ� ȣ���Ͽ� �ʱ�ȭ�Ѵ� - enum ��ü�� ó�� ������� �� ȣ��ȴ�
	Mandarin(int p) {
		price = p;
		System.out.println("enum ������ ����:: price = " + price);
	}

	int getPrice() {
		return price;
	}
	
	static Mandarin MandarinAt(int idx) {
		for (Mandarin m : Mandarin.values())
			if (m.ordinal() == idx)
				return m;
		return null;
	}
}



public class EnumTest02 {
	static Scanner stdIn = new Scanner(System.in);
	Mandarin m[] = Mandarin.values();//Mandarin�� �����ڸ� ȣ���ϰ� �� ���� ������ �Լ��� �����Ѵ�.
	//values()�� static �Լ��� ���ŵ� ��� ���Ҹ� �迭�� ����
	static Mandarin selectMenu() {
		int key;
		do {
		for (Mandarin m : Mandarin.values()) {//Mandarin m[] = Mandarin.values();�� �ǹ̰� ���� 
			System.out.print(m.ordinal()+ ".");
			System.out.println(" " + m + "(" + m.getPrice()+ ")");
		}
		System.out.println("����: ");
		key = stdIn.nextInt();
		} while(key < Mandarin.�ݱ�.ordinal() || key > Mandarin.Ȳ����.ordinal());
		
		return Mandarin.MandarinAt(key);
	}

	public static void main(String[] args) {
		Mandarin m;//�����ڸ� ȣ������ �ʴ´�
		//Mandarin m2 = new Mandarin(100);//�����ڸ� ȣ���� �� ���� - ������ 
		//*
		Mandarin ma = Mandarin.�Ѷ��;//enum Ŭ���� �����ڰ� ȣ��ȴ� 
		System.out.println("enum ��ü ������");
		System.out.println("Ȳ����� ��: "+ ma.compareTo(Mandarin.������));
		Mandarin m2	= Mandarin.�ݱ�;
		Mandarin m5 = Mandarin.Ȳ����;
		
		Mandarin ma2 = Mandarin.valueOf("������");
		System.out.println(ma2);

		Mandarin list[] = Mandarin.values();
		System.out.println("== ���� ���� ==");
		for (Mandarin m3 : list)
			System.out.println(m3 + ":" + m3.getPrice());
			
			//*/
		Mandarin mSelected = selectMenu();
		System.out.println(mSelected + ":selectedMenu:" + mSelected.getPrice());
	}
}