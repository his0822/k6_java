package com.ruby.java.ch06;
//하나의 java file에 Student 객체를 정의하고 구현하는 실습
/*
 * static 멤버 함수 구현
 * toString() 함수 구현과 사용
 * 객체 배열 사용
 */
abstract class InterfaceStudents {
	public abstract void showObject();
}
class Student extends InterfaceStudents {
 static int countStudents;//객체수
 int sid;//학번
 String sname; //학생 이름
 String city; //주소 도시

 public String toString() {
	 return "sid="+sid + ", sname=" + sname + ", city=" + city;
 }
 public void showObject() {
	 System.out.println("["+sid +", " + sname + ", " + city+"]");
 }
 static void showNumberObjects() {//생성된 객체수를 출력한다.
	 System.out.println(" 생성객체수=" + countStudents);
 }
}
class WorkStudent extends Student {
	String eno;
	String company;
	 public String toString() {
		 return 
	 }
	 public void showObject() {
		 //Student 출력 코드 추가
		 System.out.println("["+eno +", " + company + "]");
	 }
}
class CodingWorkStudent extends WorkStudent {
	String language;
	 public String toString() {
		 return 
	 }
	 public void showObject() {
		 //WorkStudent 출력 코드 추가 
		 System.out.println("["+language+"]");
	 }
}
 // 생성자 구현한다.
public class Test_Chap06_객체배열 {
	 static void showObjects(InterfaceStudents is) {
		 is.showObject();
	 }
	 public static void main(String[] args) {
	 Student arry[] = new Student[5];
	 showNumberObjects();
	 arry[0] = new Student();
	 arry[1] = new Student(202301);
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
