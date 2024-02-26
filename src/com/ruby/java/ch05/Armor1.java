package com.ruby.java.ch05;

public class Armor1 {

	private static final char A = 0;

	public static void main(String[] args) {
		
			// int1	
			System.out.println("1");
			
			int num1 = takeoff1();
			
			System.out.println(num1);
			
			System.out.println("2");
			
			
			// String2
			System.out.println("3");
			
			String num2 = takeoff2(6);
			String num21 = takeoff21(6,7);
			String num22 = takeoff22("takeoff");
			
			System.out.println(num2);
			
			System.out.println("4");
			
			
			// long3
			System.out.println("5");
			
			String num3 = takeoff3();
			
			System.out.println(num3);
			
			System.out.println("6");
			
	
			// boolean4			
			System.out.println("7");
			
			boolean num4 = takeoff4();
			
			System.out.println(num4);
			
			System.out.println("8");
			
	
			// char5
			System.out.println("9");
			
			char num5 = takeoff5();
			
			System.out.println(num5);
			
			System.out.println("10");
	
	}
									
			static int takeoff1() {
				System.out.println("takeoff1");
				return 100;
			}
			
			static String takeoff2(int name) {
				System.out.println("takeoff2");
				return name + " ===>" ;
			}
			static String takeoff21(int num211, int num212) {
				System.out.println("takeoff21");
				return num211 + " ===>" + num212;
			}
			static String takeoff22(String name) {
				System.out.println("takeoff22");
				return name + " ===>" ;
			}
			
			
			
			static String takeoff3() {
				System.out.println("takeoff3");
				return "100";
			}
			
			static boolean takeoff4() {
				System.out.println("takeoff4");
				return true;
			}
			
			static char takeoff5() {
				System.out.println("takeoff5");
				return A;
			}
}			

		
		
	
		
		
		
		
		
