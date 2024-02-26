package com.ruby.java.ch07;

import java.util.Scanner;

// 하나의 java file에 Student 객체를 정의하고 구현하는 실습
/*
 * static 멤버 함수 구현 toString() 함수 구현과 사용 객체 배열 사용
 */
abstract class InterfaceStudents {
    public abstract void showObject();
}

class Student extends InterfaceStudents {
    static int countStudents; // 객체수
    int sid; // 학번
    String sname; // 학생 이름
    String city; // 주소 도시

    public Student() {
        countStudents++;
        sid = 0;
        sname = "";
        city = "";
    }

    public Student(int sid, String sname, String city) {
        this(); // 기본 생성자 호출
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

    static void showNumberObjects() { // 생성된 객체수를 출력한다.
        System.out.println("생성객체수 = " + countStudents);
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

public class Test_Chap07_객체배열 {
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
                arry[i] = createStudent(); // 학생 객체 생성 및 초기화
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

            System.out.print("입력을 계속하시겠습니까? (y/n): ");
            continueInput = sc.next().charAt(0);
            sc.nextLine(); // Enter 키 소비

        } while (continueInput == 'y' || continueInput == 'Y');
    }

    private static InterfaceStudents createStudent() {
        System.out.println("학생정보 입력시작:");
        System.out.print("학번(sid): ");
        int sid = sc.nextInt();
        sc.nextLine(); // 버퍼 비우기
        System.out.print("이름 (sname): ");
        String sname = sc.nextLine();
        System.out.print("도시 (city): ");
        String city = sc.nextLine();

        System.out.println("직장 정보 입력시작:");
        System.out.print("사번 (eno): ");
        String eno = sc.nextLine();
        System.out.print("회사이름 (company): ");
        String company = sc.nextLine();
        System.out.print("사용하는 언어 (language): ");
        String language = sc.nextLine();

        return new CodingWorkStudent(sid, sname, city, eno, company, language);
    }

    private static void showNumberObjects() {
        Student.showNumberObjects();
    }
}