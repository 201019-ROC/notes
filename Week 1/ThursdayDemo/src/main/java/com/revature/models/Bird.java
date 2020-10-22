package com.revature.models;

import com.revature.interfaces.Flyable;

public abstract class Bird extends Animal implements Flyable {

	private boolean canFly;

	public Bird() {
		super();
	}
	
	public Bird(String name, int numOfLegs, boolean canFly) {
		super(name, numOfLegs);
		this.canFly = canFly;
	}

	public Bird(String name, int numOfLegs) {
		super(name, numOfLegs);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String talk() {
		return "Chirp!";
	}
	
	/*
	 * The final keyword, when placed in a method declaration, prevents method overriding.
	 */
	public final String moo() {
		return "moo!";
	}
	
	
	public boolean isCanFly() {
		return canFly;
	}

	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}

	@Override
	public String toString() {
		return "Bird [name =" + this.getName() + " , numOfLegs=" + this.getNumOfLegs()+ ", canFly=" + canFly + "]";
	}
	
}
