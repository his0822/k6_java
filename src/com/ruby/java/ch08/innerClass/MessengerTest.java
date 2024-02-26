package com.ruby.java.ch08.innerClass;

interface Messenger{
	String getMessage();
	void setMessage(String msg);
}

class GalaxyMessenger implements Messenger{
	public String getMessage() {
		return "galaxy";
	}
	public void setMessage(String msg) {
		System.out.println("galaxy에서 메시지를 설정합니다 : " + msg);
	}
	public void chageKeyboard() {
		System.out.println("키보드 아이콘 터치후 키보드를 변경합니다.");
	}
	
	
}

public class MessengerTest {
	public static void main(String[] args) {
		
		Messenger test = new Messenger() {
			
			public void setMessage(String msg) {
				System.out.println("test에서 메시지를 설정합니다 : " + msg);
				
			}
			public String getMessage() {
				return "test";
			}
		}; //
	}
}
