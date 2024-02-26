package com.ruby.java.ch06;

public class MTest {

	int[][] mA = {
			{1,2,3,4},
			{5,6,7,8},
			{9,10,11,12}
	};
	
	int[][] mB = {
			{1,2,3},
			{4,5,6},
			{7,8,9},
			{10,11,12}
	};
	
	Integer [][] mR = new Integer[3][3];
	
	public void multiple() {
		
		for (int i = 0 ; i < mA.length ; i++ ) {
			for(int j = 0 ; j < mB[0].length ; j++) {	
				int a = 0 ;
				for(int k = 0 ; k < mA[0].length ; k++) {
					a += mA[i][k]*mB[k][j];
					mR[i][j] = a;
				
				}
			}
		}
	}
			
		
	
			
	
	
	public void print() {
		
		for (int i = 0 ; i < mR.length ; i++) {
			for (int j = 0 ; j< mR[0].length ; j++) {
				if (j != 2) {
					if(mR[i][j]>9 && mR[i][j]<100 ) {
						System.out.print(" "+ mR[i][j]+" ");
					}else{
						System.out.print(mR[i][j]+" ");
					}
				}
				else {
					if(mR[i][j]>9 && mR[i][j]<100 ) {
						System.out.print(" "+ mR[i][j]+"\n");
					}else{
						System.out.print(mR[i][j]+"\n");
					}
					
				}
			}
		}
	}
	
		
	public static void main(String[] args) {
		
		MTest t1 = new MTest();
		t1.multiple();
		t1.print();
		
	}
	
}
