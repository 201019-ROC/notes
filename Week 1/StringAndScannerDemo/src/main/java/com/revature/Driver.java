package com.revature;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		/*
		 * Strings: hold array of characters.
		 * 	- String immutable - location of the String in memory cannot be changed
		 * 	- If declared literally, Strings are stored in the String pool this allows Java to use the same String for repeated Strings
		 * 	- The String pool is located in the Heap
		 * 	- Creating Strings using: String string = "aString"; checks the String Pool, while using the new keyword does not store the String in the String pool.
		 */
		
		// String literal
		String a = "Hello!";
		String b = "Hello!";
		
//		System.out.println(a == b);
//		System.out.println(a.equals(b));
		
		// This string is not stored in the String pool
		String c = new String("Hello!");
		
//		System.out.println(b == c);
//		System.out.println(b.equals(c));
		
		// We are changing the reference of c to point to the String Pool
		c = c.intern();
		
//		System.out.println(b == c);
//		System.out.println(a == c);
//		System.out.println(a == b);
		
		/*
		 * StringBuilder/StringBuffer:
		 *  - mutable alternatives to Strings with methods that allow for manipulation (append, replace...)
		 *  - StringBuilder is not thread-safe - faster
		 *  - StringBuffer is thread-safe - slower
		 */
		
		StringBuilder sb = new StringBuilder(a);
		sb = sb.append(" world!");
		sb = sb.delete(0, 2);
		sb = sb.reverse();
//		System.out.println(sb.charAt(0));
		
		StringBuffer sb1 = new StringBuffer("Hello");
//		System.out.println(sb1);
		
		/*
		 * The Scanner class allows us to take in user input.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Hello, what's your name?");
		String name = scan.nextLine();
		System.out.println("Your name is " + name + ", how old are you?");
		int age = scan.nextInt();
		System.out.println("You are " + age + " years old.");

		scan.close();
	}
}
