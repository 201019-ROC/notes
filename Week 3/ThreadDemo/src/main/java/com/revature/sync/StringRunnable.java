package com.revature.sync;

public class StringRunnable implements Runnable {
	
	StringBuilder sBuilder = new StringBuilder();
	StringBuffer sBuffer = new StringBuffer();
	 
	public StringRunnable(StringBuilder sBuilder, StringBuffer sBuffer) {
		super();
		this.sBuilder = sBuilder;
		this.sBuffer = sBuffer;
	}

	public StringRunnable() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			sBuilder.append("~");
			sBuffer.append("~");
		}
		
	}
	
	
}
