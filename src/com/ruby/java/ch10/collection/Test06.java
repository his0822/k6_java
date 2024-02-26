//HashMap - key ������ hash�Ͽ� ���� - �ǽ� ��� 
package com.ruby.java.ch10.collection;

import java.util.HashMap;

public class Test06 {

	public static void main(String[] args) {

		String word[] = { "BUMBLEBEE", "HEAVEN", "ALTHOUGH", "WONDER" };
		String meaning[] = { "�ܹ����� ���ϴ� ȣ�ڹ�", "õ��", "�׷����� �ұ��ϰ�", "ȣ����� ���" };

		HashMap<String, String> dic = new HashMap<>();

		for (int i = 0; i < word.length; i++) {
			dic.put(word[i], meaning[i]);
		}
		//dic.toString()�� AbstractMap�� �����
		System.out.println(dic);//dic.toString() = ��� ������ �Է� ������ �ٸ���
		System.out.println(dic.size()); // 4
		
		// keySet(), values()�� collection ���·� ��ȯ
		System.out.println(dic.keySet()); // [HEAVEN, BUMBLEBEE, WONDER, ALTHOUGH]
		System.out.println(dic.values()); // [õ��, �ܹ����� ���ϴ� ȣ�ڹ�, ȣ����� ���, �׷����� �ұ��ϰ�]

		System.out.println("HEAVEN : " + dic.get("HEAVEN"));
		dic.replace("HEAVEN", "���� �ູ�� ����");
		System.out.println("HEAVEN : " + dic.get("HEAVEN"));
		dic.put("HEAVEN", "�̻����� ����");
		System.out.println("HEAVEN : " + dic.get("HEAVEN"));

		System.out.println(dic.containsKey("BUMBLEBEE")); // true
		System.out.println(dic.containsValue("���尡")); // false

		dic.remove("HAVEN");
		System.out.println(dic.containsKey("HAVEN")); // false

		dic.clear();
		System.out.println(dic.isEmpty()); // true
		System.out.println(dic.size()); // 0
	}
}