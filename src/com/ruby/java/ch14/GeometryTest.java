package com.ruby.java.ch14;

import java.util.function.Function;

//interface  Geometry {
//	 String circle(int r);
//	 String rectangle(int w, int h);
//	 String triangle(int w, int h);
//}
//
//public class GeometryTest{
//		
//	public static void main(String[] args) {
//		
//		Function<Geometry, Double> func = (s) -> {
//			
//			
//		}
//	}
//}

//추상 클래스로 변경된 Geometry 인터페이스
abstract class Geometry {
	abstract double gArea();
}

//Circle 클래스
class Circle extends Geometry {
	private int r;

	public Circle(int r) {
		this.r = r;
	}

	@Override
	double gArea() {
		return Math.PI * Math.pow(r, 2);
	}
}

//Rectangle 클래스
class Rectangle extends Geometry {
	private int w;
	private int h;

	public Rectangle(int w, int h) {
		this.w = w;
		this.h = h;
	}

	@Override
	double gArea() {
		return w * h;
	}
}

//Triangle 클래스
class Triangle extends Geometry {
	private int w;
	private int h;

	public Triangle(int w, int h) {
		this.w = w;
		this.h = h;
	}

	@Override
	double gArea() {
		return 0.5 * w * h;
	}
}

public class GeometryTest {
	public static void main(String[] args) {
		// Circle 객체를 생성하고 면적을 계산합니다.

		Function<Geometry, Double> func = (g) -> {

			return g.gArea();
		};

		Circle c = new Circle(3);
		System.out.println("Circle Area: " + func.apply(c));

		// Rectangle 객체를 생성하고 면적을 계산합니다.
		Rectangle r = new Rectangle(4, 8);
		System.out.println("Circle Area: " + func.apply(r));

		// Triangle 객체를 생성하고 면적을 계산합니다.
		Triangle t = new Triangle(3, 6);
		System.out.println("Circle Area: " + func.apply(t));

	}
}
