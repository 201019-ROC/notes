package com.revature;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Driver {

	//Best practice to have a static logger, since resource intensive
	private static Logger log = LogManager.getRootLogger();
	
	public static void main(String[] args) {
		
		System.out.println("A message");
//		log.trace("Trace");
//		log.debug("Debug");
//		log.info("Info");
		log.warn("Warn");
		log.error("Error");
		log.fatal("Fatal");
		
		
		try {
			add(42,1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			for(int i = 0; i < e.getStackTrace().length; i++) {
				log.error(e.getStackTrace()[i]);
			}
		}
	}

	public static int add(int a, int b) throws Exception {
		
		if(a == 42 ) {
			log.error("we don't like 42");
			throw new Exception("This is my exception");
		}
		
		int result = a + b;
		log.info("add method returned: " + result);
		return result;
	}
}
