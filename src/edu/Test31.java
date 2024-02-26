package edu;

public class Test31 {

	public static void main(String[] args) {
		
		int j=1;
		for(; j< 10; ) {
			for(int i = 2; i <10; i++) {
				System.out.print(i+"*"+j+"="+(i*j));
				System.out.print("\t");
				}
			j++;
			System.out.print("\n"); //한줄바꿈
		}
	}

}
