package edu;
public class Test29 {
	public static void main(String[] args) {
		int i = 0;
		for(; i < 10;) {
			if( (i%2) == 0) {
				i++;
				continue;}
			System.out.println(i);
			i++;
		}
	}
}
