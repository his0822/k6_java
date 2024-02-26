package com.ruby.java.ch11;

import java.io.FileInputStream;

public class Test04 {

	public static void test() throws Exception {
		
			FileInputStream fi = new FileInputStream("a1.txt");
			int c = fi.read();
			System.out.println((char)c);			
		
//			catch (Exception e) {
//			e.printStackTrace();
//			System.out.println(e.getMessage());
//		}
	}
	
	public static void main(String[] args) {
		System.out.println("Start");
		try {
			test();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("End");
	}
}
