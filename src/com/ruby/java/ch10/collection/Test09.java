//10.3.4 TreeMap Ŭ���� - binary search tree
package com.ruby.java.ch10.collection;

import java.util.Map;
import java.util.TreeMap;

public class Test09 {

	public static void main(String[] args) {
		TreeMap<String, String> users = new TreeMap<>();
		users.put("728", "������");
		users.put("924", "����");
		users.put("319", "��Ǫ��");
		users.put("620", "���ϴ�");
		users.put("817", "������");
	

		System.out.println(users);//users.toString() - ������ �Է� ������� ������ �ʰ� Ű ���� ���� ������
		// users.toString()�� AbstractMap�� ������
		Map.Entry<String, String> entry = null;

		entry = users.firstEntry(); 
		print("ù��° entry ", entry);

		entry = users.lastEntry();
		print("���� ū Ű ���� ���� ��Ʈ��", entry);

		entry = users.lowerEntry("700");
		print("�־��� Ű������ ���� ���߿��� ���� ū ��Ʈ��", entry);

		entry = users.higherEntry("620");
		print("�־��� Ű������ ū ���߿��� ���� ���� ��Ʈ��", entry);

		while (!users.isEmpty()) {
			entry = users.pollFirstEntry();//���� ���� Ű ���� ��Ʈ���� ��ȯ�� ����
			print("���� ���� Ű ���� ���� ��Ʈ��", entry);
			System.out.println("�����ִ� ��Ʈ�� �� : " + users.size());
		}
	}

	static void print(String s, Map.Entry<String, String> entry) {
		System.out.println(s + " : " + entry.getKey() + " / " + entry.getValue());
	}
}