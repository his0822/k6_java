package com.ruby.java.ch04;

import java.util.Random;

class Test_행렬계산{

    public static void main(String[] args) {
        int A[][] = new int[3][4];
        int B[][] = new int[3][4];
        int C[][] = new int[3][4];
        int D[][] = new int[3][5];
        int E[][] = new int[4][5];
        int F[][] = new int[4][3];
        Random rand = new Random();

        // B �뻾�젹 �궃�닔 �엯�젰 諛� 1李⑥썝 諛곗뿴濡� 蹂��솚 異쒕젰
        System.out.println("�뻾�젹 B:");
        printMatrix(B, rand);
        int B1[] = flattenMatrix(B);
        System.out.println("1李⑥썝 諛곗뿴 B1:");
        printArray(B1);

        // C �뻾�젹 �궃�닔 �엯�젰 諛� 1李⑥썝 諛곗뿴濡� 蹂��솚 異쒕젰
        System.out.println("\n�뻾�젹 C:");
        printMatrix(C, rand);
        int C1[] = flattenMatrix(C);
        System.out.println("1李⑥썝 諛곗뿴 C1:");
        printArray(C1);

        // E �뻾�젹 �궃�닔 �엯�젰 諛� 1李⑥썝 諛곗뿴濡� 蹂��솚 異쒕젰
        System.out.println("\n�뻾�젹 E:");
        printMatrix(E, rand);
        int E1[] = flattenMatrix(E);
        System.out.println("1李⑥썝 諛곗뿴 E1:");
        printArray(E1);
    }

    // �뻾�젹 異쒕젰 硫붿냼�뱶
    private static void printMatrix(int[][] matrix, Random rand) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = rand.nextInt(10);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // 1李⑥썝 諛곗뿴 異쒕젰 硫붿냼�뱶
    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // 2李⑥썝 諛곗뿴�쓣 1李⑥썝 諛곗뿴濡� 蹂��솚�븯�뒗 硫붿냼�뱶
    private static int[] flattenMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[] flattened = new int[rows * cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                flattened[i * cols + j] = matrix[i][j];
            }
        }
        return flattened;
    }
}