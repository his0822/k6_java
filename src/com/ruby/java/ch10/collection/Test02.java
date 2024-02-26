package com.ruby.java.ch10.collection;
//�ǽ� ���
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
class Employee {
	String name;
	int age;
	int height;
	int weight;
	String blood_type; 
	String email;
	public Employee(String name, int age, int height, int weight, String blood_type, String email) {
		this.name =name;this.age=age;this.height=height;this.weight=weight;this.blood_type=blood_type; this.email=email;
	}
	public Employee() {}
	public String toString() {
		return name + " : " + age + " : " + height + " : " + weight + " : " + blood_type + " : " + email;
	}
}
/*
 * public interface Comparator<T> {
    int compare(T o1, T o2);
   }
 */
class EmpComparator implements Comparator<Employee> {
	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.name.compareTo(e2.name);
	}
}


public class Test02 {

	public static void main(String[] args) {
		// Comparator ��ü ����
		Comparator<String> comparator = new Comparator<String>() {
		    @Override
		    public int compare(String o1, String o2) {
		        return o1.compareTo(o2); // ���ڿ��� ���������� ��
		    }
		};
		//page 459 �׸�
		Employee e1 = new Employee("ȣ�ӽɽ�",39,182,142, "RH(_)B", "chukylover53");
		Employee e2= new Employee("����Ʈ",40,184,120,"A","gadget");
		Employee e3 = new Employee("������",35,180,80,"O","jjangu");
		//
		Employee e10 = new Employee();
		
		//page 460 �׸�
		Employee [] arr = new Employee[5];
		arr[0] = new Employee();
		//
		arr[4] = new Employee();
		
		int [] num = new int[5];
		num[0] = 10;num[1] = 20; num[2] = 30; //num[1] = 15;// �����Ϸ���  
		
		Object arr2[] = new Object[10];
		arr2[0]=e1;
		arr2[1]=e2;
		arr2[2]=e3;
			
		String s = "java";
		Integer ix = 123;
		arr2[3] = s;
		arr2[4] = ix;
		//int len = arr2[0].length();//�����̴� arr2[0].�� ��Ÿ���� �޼ҵ�� Object �޼ҵ常 �ִ�: ���� 466������ ������ ���� 
		int len2 = ((String)arr2[3]).length();
		
		
		
		ArrayList lst = new ArrayList(); //() �� ��ü�� �����ϸ� �ڵ����� Ÿ���� object�� ũ�Ⱑ 10�� ����Ʈ�� ����
		lst.add(s);
		lst.add(ix);
		lst.add(1, "good");
				
		//int len3 = list.get(0).length();//���� > list.get(0).�� Object�̱� �����̴�.
		int len4 = ((String)lst.get(0)).length();
		
		//������ 468 -  generic Ÿ���� �н�
		ArrayList<String> list = new ArrayList<>();//ũ�Ⱑ 10�� ����Ʈ ����
		list.add("����");
		list.add("�ϰ�");
		list.add("����");
		list.add("����");
		list.add("����");
		list.add("����");
		int len5 = list.get(0).length();//list.get(0).�� String�� ��ȯ�Ѵ� ������ �����ڿ��� T�� String���� ����
		//E get(int index) >> generic���� ����� ������ Ÿ���̹Ƿ� 
		Collections.sort(list);
		//list.sort(comparator);
		System.out.println("0: ������:: ");
		for (String element : list) { //list�� �ִ� ������� ó������ ������ element�� �Է��Ѵ�
			System.out.print(element+" ");
		}
		System.out.println();
		
		for (int i = 0; i <list.size(); i++)
			System.out.print("list.size()�� ����� ���:: " + list.get(i));
		
		System.out.println("\n==============");
		System.out.println("1: " + list.toString());//ArrayList�� override�� �޼ҵ�
		
		Iterator<String> iter = list.iterator();//iterator()�� iterator<String> ��ü�� ��ȯ
		//480������ 1��° ���� 
		while (iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
		System.out.println();
		ArrayList<Employee> elist = new ArrayList<>();
		elist.add(new Employee("kim", 1,2,3, "A", "kim@gmail.com"));
		elist.add(new Employee("hong", 11,12,13, "B", "hong@gmail.com"));
		elist.add(new Employee("Choi", 12,62,23, "O", "Choihong@gmail.com"));
		elist.add(new Employee("han", 21,72,33,"A", "hanhong@gmail.com"));
		elist.add(new Employee("Go", 31,82,43, "B", "gohong@gmail.com"));
		//elist.add("hong");//���� ������?
		//Collections.sort(elist, new EmpComparator());
		elist.sort(new EmpComparator());
		for (Employee ee: elist)
			System.out.println(ee.toString());
		System.out.println();
		Employee[]emparr = new Employee[elist.size()];
		elist.toArray(emparr);
		Arrays.sort(emparr,new EmpComparator() );

		for (Employee ee2: emparr)
			System.out.println(ee2.toString());
	}
}