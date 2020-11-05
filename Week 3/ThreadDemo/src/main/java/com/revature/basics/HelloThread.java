package com.revature.basics;

public class HelloThread extends Thread{

	private Thread t;
	
	public HelloThread(Thread t) {
		this.t = t;
	}
	
	public void run() {
		System.out.println("Hello");
		try {
			Thread.sleep(2000);
			System.out.println("Main Thread state: " + t.getState());
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
