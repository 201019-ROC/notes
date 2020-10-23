package com.revature.services;

import com.revature.models.Bird;

public class GenericService {

	/*
	 * Generics are construct to enforce compile time safety using parameterized types
	 * 	- They can be used on a class, on methods parameters, on return types
	 */
	
	// When unsure about the type object being passed in, we can use generics in order to address that
	public static <T> void printMe(T[] arr) {
		for(T t : arr) {
			System.out.println(t);
		}
	}
}
