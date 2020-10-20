package com.revature;

/*
 *  Classes are blueprints for objects, they define their states and behaviors.
 *  	- states refer to the fields
 *  	- behaviors refer to the methods
 *  	- constructors are special methods called when an object is instantiated
 *  		- if none is defined, a no-arg constructor will be provided
 */
public class Animal {

	/*
	 *  Fields:
	 *  Usually follow the following syntax [access modifier] [non-access modifier] [datatype] [variableName];
	 */
	
	int numOfLegs;
	boolean hasTail;
	float weight;
	String name;
	boolean isDead;
	
	// No argument constructor
	public Animal() {
	}
	/*
	 * Overloaded constructor 1
	 * Use "this" keyword to avoid variable shadowing Variable shadowing
	 */
	public Animal(int numOfLegs) {
		this.numOfLegs = numOfLegs;
	}
	
	// Overloaded constructor 2
	public Animal(int numOfLegs, boolean hasTail, float weight, String name, boolean isDead) {
		this.numOfLegs = numOfLegs;
		this.hasTail = hasTail;
		this.weight = weight;
		this.name = name;
		this.isDead = isDead;
	}
	
	
	
	/*
	 * Methods are blocks of reusable logic that can take in arguments and can have a return type
	 * 		- void: no return type
	 * 		- usually follows the following syntax [access modifier] [non-access modifier] [return type] [methodName] ([argument1 type] [argument1],[argument1 type] [argument 2] [...])
	 */
	public void eat(String food) {
		System.out.println("I just ate " + food +".");
	}

	// A method signature refers to the method name and its associated parameters.
	public boolean breathe() {
		
		/* if (true or false condition) {
		 * 
			 code will run if condition is true
			 
		  } else if (true or false condition) {
		  
			 code will run if first "if" is false
			 and "else if" condition is true
			 
		  } else {
		  
			 code will run if both conditions were false
			 
		  }
		  
		  You can have as many 'else if' statements as wanted in an if statement.
		  
		*/
		if(isDead == true) {
			return true;
		} else {
			return false;
		}
	}
}
