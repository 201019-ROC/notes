package com.revature.models;

import java.io.Serializable;

//Ctrl+shift+O to add imports
public class Caretaker implements Serializable{

	private String name;
	private int age;
	private Animal animal;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Animal getAnimal() {
		return animal;
	}
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	
	
}
