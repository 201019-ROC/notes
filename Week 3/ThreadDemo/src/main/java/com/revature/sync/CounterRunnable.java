package com.revature.sync;

public class CounterRunnable implements Runnable{

	Counter c;

	public CounterRunnable() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CounterRunnable(Counter c) {
		super();
		this.c = c;
	}

	@Override
	public void run() {
		System.out.println("Thread " + Thread.currentThread().getName() + " started executing.");
		for (int i = 0; i < 50000; i++) {
			c.increment();
		}
		System.out.println("Thread " + Thread.currentThread().getName() + " is done executing.");
	}
	
	
}
