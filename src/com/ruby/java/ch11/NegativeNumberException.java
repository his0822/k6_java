package com.ruby.java.ch11;

public class NegativeNumberException extends Exception {
	public NegativeNumberException() {
		super("������ ������� �ʽ��ϴ�.");
	}
	public NegativeNumberException (String msg) {
		super(msg);
	}
}
