package com.ruby.java.ch07;

import java.util.Scanner;

// �ϳ��� java file�� Student ��ü�� �����ϰ� �����ϴ� �ǽ�
/*
 * static ��� �Լ� ���� toString() �Լ� ������ ��� ��ü �迭 ���
 */
abstract class InterfaceStudents {
    public abstract void showObject();
}

class Student extends InterfaceStudents {
    static int countStudents; // ��ü��
    int sid; // �й�
    String sname; // �л� �̸�
    String city; // �ּ� ����

    public Student() {
        countStudents++;
        sid = 0;
        sname = "";
        city = "";
    }

    public Student(int sid, String sname, String city) {
        this(); // �⺻ ������ ȣ��
        this.sid = sid;
        this.sname = sname;
        this.city = city;
    }

    public String toString() {
        return "sid = " + sid + ", sname = " + sname + ", city = " + city;
    }

    public void showObject() {
        System.out.println("[" + sid + ", " + sname + ", " + city + "]");
    }

    static void showNumberObjects() { // ������ ��ü���� ����Ѵ�.
        System.out.println("������ü�� = " + countStudents);
    }
}

class WorkStudent extends Student {
    String eno;
    String company;

    public WorkStudent(int sid, String sname, String city, String eno, String company) {
        super(sid, sname, city);
        this.eno = eno;
        this.company = company;
    }

    public String toString() {
        return super.toString() + ", eno = " + eno + ", company = " + company;
    }

    public void showObject() {
        super.showObject();
        System.out.println("[" + eno + ", " + company + "]");
    }
}

class CodingWorkStudent extends WorkStudent {
    String language;

    public CodingWorkStudent(int sid, String sname, String city, String eno, String company, String language) {
        super(sid, sname, city, eno, company);
        this.language = language;
    }

    public String toString() {
        return super.toString() + ", language = " + language;
    }

    public void showObject() {
        super.showObject();
        System.out.println("[" + language + "]");
    }
}

public class Test_Chap07_��ü�迭 {
    static Scanner sc = new Scanner(System.in);

    static void showObjects(InterfaceStudents is) {
        is.showObject();
    }

    public static void main(String[] args) {
        InterfaceStudents arry[] = new InterfaceStudents[5];
        char continueInput;

        do {
            showNumberObjects();

            for (int i = 0; i < 5; i++) {
                arry[i] = createStudent(); // �л� ��ü ���� �� �ʱ�ȭ
            }

            showNumberObjects();

            for (InterfaceStudents s : arry) {
                if (s != null) {
                    System.out.println(s.toString());
                }
            }

            for (InterfaceStudents sx : arry) {
                if (sx != null) {
                    showObjects(sx);
                }
            }

            System.out.print("�Է��� ����Ͻðڽ��ϱ�? (y/n): ");
            continueInput = sc.next().charAt(0);
            sc.nextLine(); // Enter Ű �Һ�

        } while (continueInput == 'y' || continueInput == 'Y');
    }

    private static InterfaceStudents createStudent() {
        System.out.println("�л����� �Է½���:");
        System.out.print("�й�(sid): ");
        int sid = sc.nextInt();
        sc.nextLine(); // ���� ����
        System.out.print("�̸� (sname): ");
        String sname = sc.nextLine();
        System.out.print("���� (city): ");
        String city = sc.nextLine();

        System.out.println("���� ���� �Է½���:");
        System.out.print("��� (eno): ");
        String eno = sc.nextLine();
        System.out.print("ȸ���̸� (company): ");
        String company = sc.nextLine();
        System.out.print("����ϴ� ��� (language): ");
        String language = sc.nextLine();

        return new CodingWorkStudent(sid, sname, city, eno, company, language);
    }

    private static void showNumberObjects() {
        Student.showNumberObjects();
    }
}