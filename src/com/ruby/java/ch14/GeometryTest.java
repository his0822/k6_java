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

//�߻� Ŭ������ ����� Geometry �������̽�
abstract class Geometry {
	abstract double gArea();
}

//Circle Ŭ����
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

//Rectangle Ŭ����
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

//Triangle Ŭ����
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
		// Circle ��ü�� �����ϰ� ������ ����մϴ�.

		Function<Geometry, Double> func = (g) -> {

			return g.gArea();
		};

		Circle c = new Circle(3);
		System.out.println("Circle Area: " + func.apply(c));

		// Rectangle ��ü�� �����ϰ� ������ ����մϴ�.
		Rectangle r = new Rectangle(4, 8);
		System.out.println("Circle Area: " + func.apply(r));

		// Triangle ��ü�� �����ϰ� ������ ����մϴ�.
		Triangle t = new Triangle(3, 6);
		System.out.println("Circle Area: " + func.apply(t));

	}
}
