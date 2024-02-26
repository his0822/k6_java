package com.ruby.java.ch05;

class Armor {

	private String name = "홍길동";
	private int height = 180;
	private int weight = 100;
	private String color = "Red";

	void takeoff() {   // not private
		System.out.println("Take off"); 
	}

	private void land() { // private
		System.out.println("Land");
	}
	private void shootLaser() {  // private
		System.out.println("Shoot Laser");
	
	}
}

public class ArmorTest { // public 일 경우에는 클래스 이름(ArmorTest)가 파일명과 같아야 함
	public static void main(String[] args) {
		Armor armor = new Armor();
		
		armor.takeoff(); //해당 메서드가 public이므로 프린트 됨
//		armor.land(); // 해당 메서드는 private이므로 인식되지 않음
	}
}

