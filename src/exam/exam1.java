//추의 조합

package exam;

import java.util.Scanner;

public class exam1 {

	public static int g (Scanner sc){
		
		int weight;
		do {
			System.out.println("10~100사이의 임의의 값을 입력하시오 : ");		
			
		weight = sc.nextInt();
				} 
		while (weight !=0 && (weight<10 ||100< weight));
		return weight;
		
			
		
				
		for (int x = 1 ; x < weight ; x++) {
			for (int y = 1 ; y < weight ; y++) {
				for (int z = 1; z < weight ; z++) {
					if( weight == 2*x + 3*y + 5*z && (weight - 2*x - 3*y)% 5*z == 0 && (weight - 2*x - 5*z)% 3*y == 0 && (weight - 5*z - 3*y)% 2*x == 0)
									
					System.out.print("("+x+","+y+","+z+")"+"|");
					total = total +1;
											
					}
				}
			}
		System.out.println("총시도횟수:"+ total );
		
	}

}
