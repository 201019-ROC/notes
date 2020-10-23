package com.revature.services;

import java.util.Scanner;

import com.revature.exceptions.AnimalException;
import com.revature.models.Dinosaur;

public class ExceptionService {

	public void usingException() {

		// ArithmeticException - Runtime/Unchecked exception
		try {

			int x = 1 / 0;
			// Throwing an exception: throw new [ExceptionConstructor]();
//		throw new NullPointerException();

		} catch (ArithmeticException e1) {
			// in order to catch multiple exception, they should be siblings
			System.out.println("This is an Arithmetic or a NullPointer exception.");

		} catch (Exception e) {
			// Catchblocks should be ordered from most specific to least specific.
			System.out.println("This is an Exception");

		} finally {
			System.out.println("This is a finally block.");
		}

		Dinosaur d = new Dinosaur();
		System.out.println(d.getNumOfLegs());
		try {

			d.setNumOfLegs(-1);

		} catch (AnimalException e) {
			// Exception handler, where we specify how to handle that exception.
			try {
				d.setNumOfLegs(4);
			} catch (AnimalException e1) {
				e1.printStackTrace();
			}

		}
		System.out.println(d.getNumOfLegs());

		// in order to use try with resources, the resource needs to implement the Autoclosable interface.
		try (Scanner sc = new Scanner(System.in)) {

			throw new Exception();

		} catch (Exception e) {
			e.printStackTrace();
		}
		
//		Scanner sc = new Scanner(System.in);
//		try  {
//
//			throw new Exception();
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			sc.close();
//		}

		System.out.println("End of the method.");
	}
}
