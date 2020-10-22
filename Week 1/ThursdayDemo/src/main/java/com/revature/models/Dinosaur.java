package com.revature.models;

/*
 * final, when placed in a class declaration, indicates that this class cannot be extended.
 */
public final class Dinosaur extends Bird {

	@Override
	public String talk() {
		return "Rawr!";
	}

	//Cannot override final method
//	public String moo() {
//		return "caw!";
//	}
	
	public String rawrLoud() {
		return "RAWR!";
	}

	@Override
	public String sleep() {
		return "zzz";
	}

	@Override
	public String fly() {
		return "I'm flying";
	}
}
