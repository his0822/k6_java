package com.ruby.java.ch10.collection;
//�ǽ� ���
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Test01_1 {
	public static void main(String[] args) {
		Object arr[] = new Object[10];
		String s = "java";
		s.length();
		Integer i1 = 123;
		arr[0] = s;
		arr[1] = i1;
//		int len = arr[0].length();//Object�� length()�� ����
		int len = ((String) arr[0]).length();

		ArrayList lst = new ArrayList();//��� Ÿ���� ��ü���� ������ �� �ִ� �׷��� ���ߴ�! - ������?
		String s2 = "java";//s2�� String
		Integer i2 = 123;//i2�� ������ü, wrapperŬ������ ���� boxing
		lst.add(s2);//String��ü
		lst.add(i2);//������ü
		//lst. //. ������ ��Ÿ���� �޼ҵ带 Ȯ��
		//int len = (lst.get(0)).length();//Object�� length()�� ����
		int len2 = ((String)lst.get(0)).length();

		System.out.println("len2 = " + len2);

		ArrayList<String> list = new ArrayList<>();//String ��ü�� ���� > �ٶ����� �����̴� 

		list.add("����");		list.add("�ϰ�");		list.add("����");
		list.add("����");		list.add("����");		list.add("����");
		int len_string = list.get(0).length(); //list�� string ��ü�̴� �� ���̴�(������?)
		
		for (String element : list) { //�迭�� �ƴ� ArrayList���� Ȯ���� for ��� �����ϴ� 
			System.out.print(" " + element);
		}
		System.out.println();
		list.add("����");		list.add("�θ�");		list.add("����");
		list.add("�ϰ�");		list.add("����");		list.add("����");
		System.out.println("1 : " + list.toString()); //�� �޼ҵ�� ArrayList�� �Լ�
		//list.toString();//to.�����Ͽ� ��Ÿ���� �Լ� ����Ʈ Ȯ��
		System.out.println("list.size() = " + list.size());

//		list.size();
		list.add(1, "LA");//�ε��� 1 ��ġ�� LA �߰�
		print(2, list);

		// int indexOf(Object o) / int lastIndexOf(Object o)
		System.out.println("3 : " + list.indexOf("����"));
		System.out.println("4 : " + list.lastIndexOf("����"));

		// boolean remove(Object o)
		list.remove("LA");//���� ��ü�� �·� �̵��ϴ� ȿ��
		//list.remove(Object) ������ �� // Object o = "LA"; ���� ������ �� �ִ� 

		Object obj2 = "LA";//obj2�� Object�� ����Ŭ���� ��ü�� ��� ���� �� �ִ� 
		print(5, list);

		// E remove(int index)
		list.remove(2);
		print(6, list);

		// boolean contains(Object o)
		System.out.println("7 : " + list.contains("LA"));//boolean contains(Object o)�� ����Ѵ� 
		
		// Object[] toArray() *** �߿�
		Object obj[] = list.toArray();//list�� �迭�� ���� - Object[] toArray()
		System.out.println("8 : " + obj);//obj�� ���� �����̰� �̸� toString()���� ��ȯ
		System.out.println("8 : " + Arrays.toString(obj));//�迭�� ���ҵ��� ��Ʈ������ ��ȭ
		// <T> T[] toArray(T[] a) - �ؼ��� �� �־�� �Ѵ� 
		String cities[] = new String[5];
		//cities = list.toArray();//list�� �迭�� ���� - �迭�� ũ�⸦ list ũ��� �ڵ� ����
		cities = list.toArray(cities);//toArray([T[] a)�� return type�� T[]
		//toArray()�� return type�� Object[] ���� 475 �ϴܼ��� 
		//list.toArray();//Ȯ��
		System.out.println("9 : " + Arrays.toString(cities));

		// void clear()
		list.clear();
		print(10, list);//print(list.toString()) ����

		// boolean isEmpty()
		System.out.println("11: " + list.isEmpty());

		list.add("�ĸ�");
		list.add("����");
		list.add("LA");

		// Arrays Ŭ������ static <T> List<T> asList(T... a) *** �߿�
		List<String> list2 = Arrays.asList("����", "����", "����");//asList()�� �迭�� �Է¹޾� ����Ʈ�� ����� 
		print(12, list2);

		// boolean addAll(Collection<? extends E> c) - ?�� wild card ��� *** �߿�
		list.addAll(list2);
		print(13, list);

		// boolean containsAll(Collection<?> c)
		System.out.println("14: " + list.containsAll(list2));

		// boolean retainAll(Collection<?> c)
		list.retainAll(list2);
		print(15, list);

		// boolean removeAll(Collection<?> c)
		list.removeAll(list2);
		print(16, list);
	}

	static void print(int n, List<String> list) {
		System.out.println(n + " : " + list);//��Ʈ������ Ÿ�� ��ȯ�� toString() ȣ���Ͽ� ����
		//System.out.println(n + " : " + list.toString());//������ ȿ��
	}
}