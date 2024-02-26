//���� �Ʒ� �ʿ�   - �ǽ� ��� - ���̽� dictionary
package com.ruby.java.ch10.collection;
//MAP�� iterator ��� �ǽ� - iterator ��� �ǽ� 
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test07 {

	public static void main(String[] args) {

		HashMap<String, String> dic = new HashMap<>();

		dic.put("��������", "��� ���� ��ſ��� ��");
		dic.put("�а���", "���� �μ��������� ����� ����");
		dic.put("�����߷�", "���и� ���ǻ�� �����");
		dic.put("���л���", "����ġ�� ���鼭 ���� ������");
		dic.put(null, null); // HashMap�� null �� ���� ����

// ���1 -iterator ���
		System.out.println("\n���1:" + dic.keySet());
		Iterator<String> keys = dic.keySet().iterator();
		while (keys.hasNext()) {
			String key = keys.next();
			System.out.println(String.format("%s : %s", key, dic.get(key)));
		}

// ���2 - Ȯ���� for �� - Entry ��ü
		System.out.println("\n���2:");
		for (Map.Entry<String, String> elem : dic.entrySet()) {
			System.out.println(String.format("%s : %s", elem.getKey(), elem.getValue()));
		}

// ���3 - Ȯ���� for �� - key �� ��� 
		System.out.println("\n���3:");
		for (String key : dic.keySet()) {
			System.out.println(String.format("%s : %s", key, dic.get(key)));
		}
	}
}