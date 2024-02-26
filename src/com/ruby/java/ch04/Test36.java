package com.ruby.java.ch04;

public class Test36 {

	public static void main(String[] args) {
		char letter = 'A';
		int num = 'A';
		System.out.println("num = "+ num);
				
		char[]alphabet = new char[26];
		
		
//		for (int i = 0 ; i < alphabet.length; i++) {
//			alphabet[i] = (char)((int)letter + i);
//		}
		
		int i = 0;
		for (; i < alphabet.length; i++) {
			alphabet[i] = (char)((int)letter + i);
		}
		
		
		for(char c : alphabet) {
			System.out.print("\t"+c);
		}

	}

}
