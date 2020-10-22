package com.revature.interfaces;

import java.io.Serializable;

public interface Flyable extends Cloneable, Serializable {

	/*
	 * Final, when used in front of a variable, indicates that the field is either constant or a write once field
	 */
	public static final int SPEED = 100;
	
	//implicitely abstract
	public String fly();
	public default String flyFaster() {
		return "I'm flying very fast: "+SPEED +" mph.";
	}
	
}
