package quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gugudan {

    public void print1(int i) {
        System.out.println(i + "��");

//        List<Integer> a = new ArrayList<>();
//        for (int k = 1; k < 10; k++) {
//            a.add(k);
//        }
//
//        for (int j = 0; j < a.size(); j++) {
//         
//            int x = a.get(j);
//            int b = i*x;
//            System.out.println(i + " * " + x + " = " + b);
//        }
        
        for (int j = 1 ; j < 10 ; j++) {
        	int b = i * j;
        	System.out.println(i + " * " + j + " = " + b);
        }
        
        System.out.println();
    }
    
    public void print2(int x) {
        System.out.println(x + "��");


        
        for (int i = 1 ; i < 10 ; i++) {
        	int a = x * i;
        	System.out.print(x + " * " + i + " = " + a + "   ");   		
        }
        	
        
        
        System.out.println();
    }
    
    
    public void print3(int i) {
        System.out.println(i + "��");

//        List<Integer> a = new ArrayList<>();
//        for (int k = 1; k < 10; k++) {
//            a.add(k);
//        }
//
//        for (int j = 0; j < a.size(); j++) {
//         
//            int x = a.get(j);
//            int b = i*x;
//            System.out.println(i + " * " + x + " = " + b);
//        }
        
        for (int j = 0 ; j < 10 ; j++) {
        	int b = i * j;
        	System.out.println(i + " * " + j + " = " + b);
        }
        
        System.out.println();
    }
    
    
    
    

    public static void main(String[] args) {

        Gugudan ggd = new Gugudan();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("������ ���ڸ� �Է��ϼ��� : ");
        int num = sc.nextInt();
        
        
//        ggd.print(2);
//        System.out.println("-".repeat(15));
//        ggd.print(3);
//        System.out.println("-".repeat(15));
        System.out.println("1�����·� �μ�");
        ggd.print1(num);
        System.out.println("-".repeat(num));
        
        System.out.println("2�����·� �μ�");
        ggd.print2(num);
        System.out.println("-".repeat(num));
        
        System.out.println("3�����·� �μ�");
        ggd.print3(num);
        System.out.println("-".repeat(num));
    }
}
