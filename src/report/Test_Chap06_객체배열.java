package com.ruby.java.ch06;

//�ϳ��� java file�� Student ��ü�� �����ϰ� �����ϴ� �ǽ�
/*
 * static ��� �Լ� ����
 * toString() �Լ� ������ ���
 * ��ü �迭 ���
 */
abstract class InterfaceStudents {
	public abstract void showObject();
}

class Student extends InterfaceStudents {
	static int countStudents;// ��ü��
	int sid;// �й�
	String sname; // �л� �̸�
	String city; // �ּ� ����

public Student() {
	// TODO Auto-generated constructor stub
}

	public Student(int sid) {
		this.sid = sid;
	}

	public Student(String sname) {
		this.sname = sname;
	}

	public String toString() {
		return "sid=" + sid + ", sname=" + sname + ", city=" + city;
	}

	public void showObject() {
		System.out.println("[" + sid + ", " + sname + ", " + city + "]");
	}

	static void showNumberObjects() {// ������ ��ü���� ����Ѵ�.
		System.out.println(" ������ü��=" + countStudents);
	}
}

class WorkStudent extends Student {
	String eno;
	String company;

	public String toString() {
		 return 
	 }

	public void showObject() {
		// Student ��� �ڵ� �߰�
		System.out.println("[" + eno + ", " + company + "]");
	}
}

class CodingWorkStudent extends WorkStudent {
	String language;

	public String toString() {
		 return 
	 }

	public void showObject() {
		// WorkStudent ��� �ڵ� �߰�
		System.out.println("[" + language + "]");
	}
}

// ������ �����Ѵ�.
public class Test_Chap06_��ü�迭 {
	static void showObjects(InterfaceStudents is) {
		is.showObject();
	}

	public static void main(String[] args) {
		Student arry[] = new Student[5];
		showNumberObjects();
		arry[0] = new Student();
		arry[1] = new Student(202301);
		arry[2] = new Student("today");
		arry[2] = new WorkStudent();
		arry[3] = new CodingWorkStudent();
		arry[3] = new WorkStudent();
		showNumberObjects();
		for (Student s : arry) {
			System.out.println(s.toString());
		}
		for (Student sx : arry) {
			showObjects(sx);
		}
	}

}
