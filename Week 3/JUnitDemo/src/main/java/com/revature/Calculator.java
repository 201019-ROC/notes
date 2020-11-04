package com.revature;

public class Calculator {

	public int add(int a, int b) {
		if(a == 15) {
			throw new ArithmeticException("We don't like 15");
		}
		return a + b;
	}
}
