package quiz;

public class LeafYear {

	public LeafYear() {
		// TODO Auto-generated constructor stub
	}

	private void LeafYear(int x) {

		
		
		if ( x%4 == 0 && x%100 != 0 || x%400 == 0) {
			System.out.println("����");
		} else {
			System.out.println("���");
		}
	}

	public static void main(String[] args) {
		LeafYear a = new LeafYear();

		a.LeafYear(1900);

	}
}
