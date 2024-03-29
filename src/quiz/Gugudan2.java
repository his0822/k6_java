package quiz;

public class Gugudan2 {

	public void printHorizontal() {

		for (int j = 1; j < 10; j++) {
			for (int i = 2; i < 10; i++) {
				int b = i * j;
				if (b < 10) {
					System.out.print(i + "*" + j + "=" + " " + b + "\t");
				} else {
					System.out.print(i + "*" + j + "=" + b + "\t");
				}
			}
			System.out.println();
		}
		System.out.println(("-").repeat(70));
	}

//	public void printColumn(int col)  {
//	
//		for (int n = 0 ; n < 7/col+1 ; n++) {
//			int i = 1;
//			for (int j = 1 ; j < 10 ; j++) {
//				for ( i = n*col + 1 ; i < (n+1)*col + 1 ; i++) {
//					int b = (i+1) * j;
//					if ( i < 9 ) {
//						if (b < 10) {
//							System.out.print((i+1) + "*" + j + "=" + " " + b + "\t");
//						} else {
//							System.out.print((i+1) + "*" + j + "=" + b + "\t");
//						}
//					}else {
//						continue;
//					}
//						
//				}
//				System.out.println();
//				}
//			System.out.println();
//			
//			}System.out.println(("-").repeat(70));
//		}

//	public void printColumn(int col) {
//		for (int j = 1 ; j < 9 ; j++) {
//		for (int i = 1 ; i < 9 ; i++) {
//			
//				int b = i * j;
//				if ( i%col == 0) {
//					System.out.println((i+1) + "*" + j + "=" + b);
//				} else {
//					System.out.print((i+1) + "*" + j + "=" + b + "\t");
//				}
//				
//			}
//			
//			
//		}System.out.println();
//	}

	public void printColumn(int col) {

		int startNum = 2;
		final int finishNum = 9;

		while (true) {
			for (int j = 1; j <= 9; j++) {
				for (int i = startNum; i < startNum + col; i++) {
					if (i > finishNum) {
						break;
					}
					System.out.print(i + "*" + j + "=" + i * j + "\t");
				}
				System.out.println("----------");
			}System.out.println("==========");

			startNum = startNum + col;

			if (startNum > finishNum) {
				break;
			}
			
		}System.out.println("~~~~~~~~~~~~");
	}

	public static void main(String[] args) {

		Gugudan2 ggd = new Gugudan2();
		ggd.printHorizontal();
		System.out.println();
		ggd.printColumn(2);
		ggd.printColumn(3);
		ggd.printColumn(4);
		ggd.printColumn(5);
		ggd.printColumn(6);
		ggd.printColumn(7);
		ggd.printColumn(8);

	}
}
