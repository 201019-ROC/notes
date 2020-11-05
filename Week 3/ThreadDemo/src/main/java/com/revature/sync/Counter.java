package com.revature.sync;

public class Counter {
	
	int value;
	
	public synchronized void increment() {
		value ++;
	}
}
