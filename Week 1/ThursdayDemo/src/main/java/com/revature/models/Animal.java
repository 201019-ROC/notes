package com.revature.models;

import com.revature.exceptions.AnimalException;

public abstract class Animal {

	private String name;
	private int numOfLegs;
	private final String something;
	
	// Example of Constructor overloading.
	public Animal() {
		this.something = "";
	}
	
	public Animal(String name, int numOfLegs) {
		super();
		this.something = "";
		this.name = name;
		this.numOfLegs = numOfLegs;
	}
	
	public abstract String sleep();
	
	public String talk() {
		return "Generic animal noises!";
	}
	
	public String talk(String s, int i) {
		StringBuilder sb = new StringBuilder(s);
		for (int j = 0; j < i; j++) {
			sb.append(s);
		}
		return "Generic animal noises " + sb;
	}
	
	public String flyFaster() {
		return "I'm flying very fast.";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumOfLegs() {
		return numOfLegs;
	}
	public void setNumOfLegs(int numOfLegs) throws AnimalException{
		if(numOfLegs < 0) {
			throw new AnimalException("Animals can't have negative legs!");
		} else{
			this.numOfLegs = numOfLegs;
		}
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", numOfLegs=" + numOfLegs + "]";
	}
	
}
