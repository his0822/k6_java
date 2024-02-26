package com.ruby.java.ch11;

public class Test05 {
	
	int battery = 0;
	
	public void charge(int time) throws Exception {
		
		if(time < 0 ) {
			time = 0;
//			try {
				throw new NegativeNumberException("���̳ʽ��� �Ӵ�");
//			} catch(NegativeNumberException e) {
//				e.printStackTrace();
//			}
		}
		battery += time;
		System.out.println("���� ���͸� : " + battery);
	}
	
	public static void main(String[] args) {
		
		Test05 test = new Test05();
		try {
			test.charge(30);
			test.charge(20);
			test.charge(-10);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}

}
