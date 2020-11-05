package com.revature.sync;

public class SyncDriver {

	public static void main(String[] args) {
//		StringBuilder sharedBuilder = new StringBuilder();
//		StringBuffer sharedBuffer = new StringBuffer();
//
//		Runnable job = new StringRunnable(sharedBuilder, sharedBuffer);
//		
//		Thread t1 = new Thread(job);
//		Thread t2 = new Thread(job);
//		
//		t1.start();
//		t2.start();
//		
//		try {
//			//Waits for t1 to be done executing before resuming main thread
//			t1.join();
//			//Waits for t2 to be done executing before resuming main thread
//			t2.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		System.out.println("StringBuilder result:");
//		System.out.println(sharedBuilder);
//		System.out.println();
//		
//		System.out.println("StringBuffer result:");
//		System.out.println(sharedBuffer);
//		System.out.println();
		
		Counter count = new Counter();
		Runnable countJob = new CounterRunnable(count);
		Thread t1 = new Thread(countJob);
		Thread t2 = new Thread(countJob);
		
		t1.start();
		t2.start();
		System.out.println("t1 state: " + t1.getState());
		System.out.println("t1 state: " + t1.getState());
		System.out.println("t1 state: " + t1.getState());
		System.out.println("t1 state: " + t1.getState());
		System.out.println("t1 state: " + t1.getState());
		System.out.println("t1 state: " + t1.getState());
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Count: " + count.value);
	}

}
