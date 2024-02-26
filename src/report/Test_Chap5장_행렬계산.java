package com.ruby.java.ch05;

import java.util.Random;

/*
 * 하나의 자바 파일에서 함수 구현 실습
 */
public class Test_Chap5장_행렬계산 {
	/*
	 * 행렬 덧셈, 곱셈 연산 메소드 정의
	 * 1차버젼: 덧셈후 바로 출력
	 * 2차버젼: 덧셈후 return 값으로 결과 행렬 반환
	 */
	
	static void getData(int x[][]){
		Random rand = new Random();
		for(int i = 0 ; i < x.length ; i++) {
			for( int j = 0 ; j < x[0].length ; j++) {
				x[i][j] = rand.nextInt(10)+1; 
			}
		}
			
	}
	
	static void showMatrix(int B [][]) {
		//2차원 모습으로 출력
		System.out.println("2차원 행렬:");
		
		for ( int i = 0 ; i < B.length ; i++) {
			for( int j = 0 ; j < B[0].length ; j++) { 
				if(j != B[0].length-1) 
					System.out.print(B[i][j]+" ");
				else 
					System.out.print(B[i][j] + " \n");
			}
		}
	}
		
		
	

	static int[][] addMatrix(int B[][], int C[][]){
		
		int row = B.length;
		int col = B[0].length;
		int addm[][] = new int [row][col];
		
		for (int i = 0 ; i < row ; i++) {
			for ( int j = 0 ; j < col ; j++) {
				addm[i][j] = B[i][j]+ C[i][j];
			}
		}
		return addm;
	}

	
	static int[][] multiplyMatrix(int B[][],int E[][]){
		
		int Brow = B.length;
		int Bcol = B[0].length;
		int Ecol = E[0].length;
		int multim[][] = new int [Brow][Ecol];
		
		for (int i = 0 ; i < Brow ; i++) {
			for ( int j = 0 ; j < Ecol ; j++) {
				int a = 0;
				for ( int k = 0 ; k < Bcol ; k++) {
					a += B[i][k] * E[k][j];
				}
				multim[i][j] = a;
			}
		}
		return multim;
	}
	
	static int[][] transposeMatrix(int B[][]){
		int row = B.length;
		int col = B[0].length;
		int transm[][] = new int [col][row];
		
		for (int i = 0 ; i < row ; i++) {
			for ( int j = 0 ; j < col ; j++) {
				transm[j][i] = B[i][j];
			}
		}
		return transm;
	}
	
	public static void main(String[] args) {
		/*
		 * 난수 생성으로 초기화
		 * A[3][4] = B[3][4] + C[3][4]; D[3][5] = B[3][4] * E[4][5];
		 * F[4][3] = B[3][4]의 전치 행렬
		 */
		
		int A[][] = new int [3][4];
		int B[][] = new int [3][4];//난수
		int C[][] = new int [3][4];//난수
		int D[][] = new int [3][5];
		int E[][] = new int [4][5];//난수
		int F[][] = new int [4][3];
		
			
		
		
		System.out.println("행렬 더하기: A[3][4] = B[3][4] + C[3][4]");
		getData(B);
		getData(C);
		getData(E);
		A = addMatrix(B, C);
		showMatrix(B);
		showMatrix(C);
		showMatrix(A);
		System.out.println("행렬 곱하기: D[3][5] = B[3][4] * E[4][5]");
		D = multiplyMatrix(B,E);
		showMatrix(B);
		showMatrix(E);
		showMatrix(D);
		System.out.println("행렬 전치: F[4][3] = B[3][4]의 전치 행렬");
		F = transposeMatrix(B);
		showMatrix(B);
		showMatrix(F);

	}

}
