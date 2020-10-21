package com.revature;

import com.revature.models.Animal;

/*
 * Packages are groups of related classes.
 * 		- helps with organizing your classes in your application and specify how they can access one another
 * 		- packages are declared at the beginning of a java file before import statements
 * 		- Reverse URL format/ reverse Domain Name for naming convention
 * 		- Packages need to be imported in order to use classes from a different package
 * 		- Packages can be organized based on what "problem" they solve
 * 			- a package that holds all classes required to interact with the database
 * 			- a package that holds controllers to interact with incoming Request/Responses
 * 			- a package that holds our models/beans
 * 			- a package that holds our services 
 */

public class Driver {

	public static void main(String[] args) {
		// We did not have to instantiate an object in order to call the static
		// method/variable
		Animal.hello(5);
		
		System.out.println("The current animal counter is: " + Animal.counter);

		Animal a = new Animal();
		Animal b = new Animal();
		System.out.println("The current animal counter is: " + Animal.counter);
		System.out.println("The counter for a: " + a.counter);
		System.out.println("The counter for b: " + b.counter);
		
		System.out.println(a.equals(b));

	}

}
