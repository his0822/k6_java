package com.ruby.java.ch08.polymorphism;

abstract class Employee{
	String name;
	int salary;
	
	public abstract void calcSalary();
	
	public abstract void calcBonus();
}

class Salesman extends Employee{
	public void calcSalary() {
		System.out.println("(4)");
		System.out.println("(4_1)Salesman 급여 = 기본급 + 판매수당");
	}
	public void calcBonus() {
		System.out.println("(10)");
		System.out.println("(10_1)Salesman 보너스 = 기본급 * 12 * 4");
	}
}

class Consultant extends Employee{
	public void calcSalary() {
		System.out.println("(6)");
		System.out.println("(6_1)Consultant 급여 = 기본급 + 컨설팅 특별 수당");
	}
	public void calcBonus() {
		System.out.println("(12)");
		System.out.println("(12_1)Salesman 보너스 = 기본급 * 12 * 2");
	}
}

abstract class Manager extends Employee{
	public void calcSalary() {
		System.out.println("(8)");
		System.out.println("(8_1)Manager 급여 = 기본급 + 팀 성과 수당");
	}
}

class Director extends Manager{
	public void calcBonus() {
		System.out.println("(14)");
		System.out.println("(14_1)Director 보너스 = 기본급 * 12 * 6");

	}
}

public class HRSTest {
	public static void calcTax(Employee e) {
		System.out.println("소득세를 계산합니다.");
	}

	public static void main(String[] args) {
		
		
		Salesman s = new Salesman();
		System.out.println("(1)");
		Consultant c = new Consultant();
		System.out.println("(2)");
//		Manager m = new Manager();
//		System.out.println("(1)");
		Director d = new Director();
		System.out.println("(3)");
		
		s.calcSalary();
		System.out.println("(5)");
		c.calcSalary();
		System.out.println("(7)");
		d.calcSalary();
		System.out.println("(9)");
		
		s.calcBonus();
		System.out.println("(11)");
		c.calcBonus();
		System.out.println("(13)");
		d.calcBonus();
		System.out.println("(15)");
		
		System.out.println(s.toString());
		
		Salesman s2 = s;
		System.out.println(s2.toString());
		
		if(s.equals(s2)) {
			System.out.println("동일한 객체입니다.");
		}else{System.out.println("서로 다른 객체입니다.");}
		
		calcTax(s);
		calcTax(c);
		calcTax(d);
				
	}
}
