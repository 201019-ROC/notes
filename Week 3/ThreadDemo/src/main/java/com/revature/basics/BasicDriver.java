package com.revature.basics;

public class BasicDriver {

	public static void main(String[] args) {
		HelloThread t1 = new HelloThread(Thread.currentThread());
		Thread t2 = new Thread(new GoodByeRunnable());

		Runnable job = () -> {
			System.out.println("This is a lamba expression.");
		};

		Thread t3 = new Thread(
			job
		);
//		System.out.println("Thread State t1: " + t1.getState() + " isAlive? "+ t1.isAlive());
		t1.start();
//		System.out.println("Thread State t1: " + t1.getState() + " isAlive? "+ t1.isAlive());
		t2.start();
		t3.start();
//		System.out.println("Thread State t1: " + t1.getState() + " isAlive? "+ t1.isAlive());
//		System.out.println("Thread State t1: " + t1.getState() + " isAlive? "+ t1.isAlive());
//		System.out.println("Thread State t1: " + t1.getState() + " isAlive? "+ t1.isAlive());
//		System.out.println("Thread State t1: " + t1.getState() + " isAlive? "+ t1.isAlive());
//		System.out.println("Thread State t1: " + t1.getState() + " isAlive? "+ t1.isAlive());
//		System.out.println("Thread State t1: " + t1.getState() + " isAlive? "+ t1.isAlive());
//		System.out.println("Thread State t1: " + t1.getState() + " isAlive? "+ t1.isAlive());
//		System.out.println("Thread State t1: " + t1.getState() + " isAlive? "+ t1.isAlive());
//		System.out.println("Thread State t1: " + t1.getState() + " isAlive? "+ t1.isAlive());
//		System.out.println("Thread State t1: " + t1.getState() + " isAlive? "+ t1.isAlive());
//		System.out.println("Thread State t1: " + t1.getState() + " isAlive? "+ t1.isAlive());
		try {
			t1.join();
			System.out.println("T1 has joined.");
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		System.out.println("Thread State t1: " + t1.getState() + " isAlive? "+ t1.isAlive());
//		System.out.println("Thread State t1: " + t1.getState() + " isAlive? "+ t1.isAlive());

	}

}
