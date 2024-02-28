package quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gugudan {

    public void print1(int i) {
        System.out.println("<"+i + "단>");

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
        	System.out.println(i + "*" + j + "=" + b);
        }
     }
    
    public void print2(int x) {
        System.out.println("<"+x + "단>");


        
        for (int i = 1 ; i < 10 ; i++) {
        	int a = x * i;
        	System.out.print(x + "*" + i + "=" + a + "  ");   		
        }
        	
        
        
        System.out.println();
    }
    
    
//    public void print3(int i) {
//        System.out.println("<"+i + "단>");
//
////        List<Integer> a = new ArrayList<>();
////        for (int k = 1; k < 10; k++) {
////            a.add(k);
////        }
////
////        for (int j = 0; j < a.size(); j++) {
////         
////            int x = a.get(j);
////            int b = i*x;
////            System.out.println(i + " * " + x + " = " + b);
////        }
//        
//        for (int j = 0 ; j < 10 ; j++) {
//        	int b = i * j;
//        	System.out.println(i + "*" + j + "=" + b);
//        }
//        
//        System.out.println();
//    }
    
    public void printHorizontal() {

		for (int j = 1; j < 10; j++) {
			
			for (int i = 2; i < 10; i++) {
				int b = i * j;
				if ( b <10 ) {
					System.out.print(i + "*" + j + "=" +" "+ b + "\t");
				} else {
					System.out.print(i + "*" + j + "=" + b + "\t");
				}
			}System.out.println();
		}
	}
    
    

    public static void main(String[] args) {

        Gugudan ggd = new Gugudan();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("구구단 숫자를 입력하세요 : ");
        int num = sc.nextInt();
        
        
//        ggd.print(2);
//        System.out.println("-".repeat(15));
//        ggd.print(3);
//        System.out.println("-".repeat(15));
        
        
        System.out.println("[세로 인쇄]");
        ggd.print1(num);
        System.out.println("-".repeat(70));
        
        System.out.println("[가로 인쇄]");
        ggd.print2(num);
        
        
        System.out.println("=".repeat(70));
        System.out.println("[구구단 전체]");
        ggd.printHorizontal();
        System.out.println("=".repeat(70));
        
        
    }
}
