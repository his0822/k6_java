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

	public void printColumn(int col) {

		
		for (int n = 0; n < (7/col)+1; n++) {
			for (int j = 1; j < 10; j++) {
				for (int i = n * col + 1; i < (n + 1) * col + 1; i++) {
					int b = (i + 1) * j;
					if (i < 9) {
						if (b < 10) {
							System.out.print((i + 1) + " * " + j + " = " + " " + b + "\t");
						} else {
							System.out.print((i + 1) + " * " + j + " = " + b + "\t");
						}
					}
				}
				System.out.println();
			}
			System.out.println();
		}
		System.out.println(("-").repeat(col*18));
	}

//	public void printColumn(int col) {
//
//		for(int n = 1; n < 10/col ; n++) {
//		for(int j = 0 ; j < 9 ; j++) {
//		for (int i = 0; i < col*n ; i++) {
//			
//			int b = (i+2) * (j+1);
//			if ((i+1) % col == 0) {
//				System.out.println((i+2) + "*" + (j+1) + "=" + b);
//			} else {
//				System.out.print((i+2) + "*" + (j+1) + "=" + b + "\t");
//			}
//
//		}
//		System.out.println();
//	}
//	}
//	}
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
