package com.ruby.java.ch04;
import java.util.Random;
public class Test38Matrix {

	public static void main(String[] args) {
		
		int A[][] = new int [3][4]; //난수 입력
		int B[][] = new int [4][5]; //난수 입력
		int C[][] = new int [3][5]; 
		int D[][] = new int [3][4]; //난수 입력
		int E[][] = new int [3][4]; 
		int F[][] = new int [4][3];
		Random rand = new Random();
		
		for (int i = 0; i < A.length; i++)
			for(int j = 0; j < A[0].length; j++)
				A[i][j] = rand.nextInt(10);
		for (int i = 0; i < B.length; i++)
			for(int j = 0; j < B[0].length; j++)
				B[i][j] = rand.nextInt(10);
		for (int i = 0; i < D.length; i++)
			for(int j = 0; j < D[0].length; j++)
				D[i][j] = rand.nextInt(10);
		
						
		
		// C = A * B  : 행렬 곱하기
		for (int i = 0; i < A.length; i++)
			for(int j = 0; j < B[0].length; j++)
				for(int k = 0; k< A[0].length ; k++) {
					C[i][j] = A[i][k]*B[k][j];
					System.out.print(C[i][j]+ " ");
					
				}
		System.out.println();
		// E = A + D  : 행렬 더하기
		for (int i = 0; i < A.length; i++)
			for(int j = 0; j < A[0].length; j++) {
				E[i][j] = A[i][j]+D[i][j];
				System.out.print(E[i][j]+ " ");
				
			}
		System.out.println();
		
		// F = A의 전치 행렬
		for (int i = 0; i < A.length; i++)
			for(int j = 0; j < A[0].length; j++) {	
				F[j][i] += A[i][j];
				System.out.print(F[j][i]+ " ");
				
			}	
		System.out.println();
	}
}

