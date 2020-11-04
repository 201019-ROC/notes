package com.revature.models;

import java.io.Serializable;

public class Fruit implements Serializable, Cloneable {

	private int numOfSeeds;
	private String name;

	public Fruit() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Fruit(int numOfSeeds, String name) {
		super();
		this.numOfSeeds = numOfSeeds;
		this.name = name;
	}

	public int getNumOfSeeds() {
		return numOfSeeds;
	}

	public void setNumOfSeeds(int numOfSeeds) {
		this.numOfSeeds = numOfSeeds;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + numOfSeeds;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fruit other = (Fruit) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (numOfSeeds != other.numOfSeeds)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Fruit [numOfSeeds=" + numOfSeeds + ", name=" + name + "]";
	}

}
