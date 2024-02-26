package com.ruby.java.ch06;

import java.util.Random;

/*
 * 클래스 메소드 구현 실습 목적
 */
class Matrix {
	int rows;
	int cols;
	int rawdata[];
	public Matrix(int rows, int cols) {
		this.rows = rows; this.cols = cols;
		rawdata = new int[rows * cols];
	}
	void getData() {
		// 난수로 입력
		Random rand = new Random();
		
		for(int i = 0 ; i < rawdata.length ; i++) {
			int x = rand.nextInt(10)+1;
			rawdata[i] = x;
			}
	}
	
	Matrix addMatrix(Matrix y) {
		
		Matrix m = new Matrix(this.rows, this.cols);
				
		for (int i = 0; i < this.rows*this.cols; i++) {
			m.rawdata[i] = this.rawdata[i] + y.rawdata[i];
        }
		return m;
	}
	
	
	Matrix multiplyMatrix(Matrix z) {
		
		if(this.cols != z.rows) {
			System.out.println("곱셈 불가");
		}
		System.out.println("곱셈 가능");
		
		Matrix m = new Matrix(this.rows, z.cols);
		
		for (int i = 0; i < this.rows; i++) {
			for (int j = 0; j < z.cols; j++) {
				int x = 0;
	            for (int k = 0; k < this.cols; k++) {
	            	x += this.rawdata[i * this.cols + k] * z.rawdata[k * z.cols + j];
	            } 
	            m.rawdata[i * m.cols + j] = x;
	        }
	    }
		return m;
	}
	
	Matrix transposeMatrix() {
		Matrix m = new Matrix(this.cols, this.rows);
		
		for( int i = 0 ; i < this.rows ; i++) {
			for ( int j = 0 ; j < this.cols ; j++) {
				m.rawdata[j*m.cols + i] = this.rawdata[i*this.cols + j];
			}
		}
		return m;
	}
	
	void showMatrix(String str) {
		System.out.println(str);
		//2차원 배열 모양으로 출력하는 코드 작성
		for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(rawdata[i * cols + j] + " ");
            }
            System.out.println();
		}
	}
		
}
	
public class Test_Chap06_행렬클래스 {

	public static void main(String[] args) {
		/*
		 * 난수 생성으로 초기화
		 * A[3][4] = B[3][4] + C[3][4]; D[3][5] = B[3][4] * E[4][5];
		 * F[4][3] = B[3][4]의 전치 행렬
		 */
		Matrix B = new Matrix(3,4);
		Matrix C = new Matrix(3,4);
		Matrix A, D, F;
		Matrix E = new Matrix(4,5);

		System.out.println("06_행렬 더하기: A[3][4] = B[3][4] + C[3][4]");
		B.getData();
		C.getData();
		E.getData();
		
		A = B.addMatrix(C);
		B.showMatrix("B[3][4]");
		C.showMatrix("C[3][4]");
		A.showMatrix("A[3][4]");
		
		System.out.println("06_행렬 곱하기: D[3][5] = B[3][4] * E[4][5]");
		D = B.multiplyMatrix(E);
		B.showMatrix("B[3][4]");
		E.showMatrix("E[4][5]");
		D.showMatrix("D[3][5]");
		
		System.out.println("06_행렬 전치: F[4][3] = B[3][4]의 전치 행렬");
		F = B.transposeMatrix();
		B.showMatrix("B[3][4]"); 
		F.showMatrix("F[4][3]");

		}
	}

