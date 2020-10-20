package com.revature; // First uncommented line of code

/*
 * Class declaration:
 * [access modifier] class [classname] {}
 * 		- Java class files can only have 1 public class.
 * 		- The name of the public class needs to match the name of the file.
 */
public class HelloWorld {

	// Main method is the entry point of JVM - Where the execution of the application starts from.
	public static void main(String[] args) {

		// This is the syntax for a single line comment
		
		/*
		 * This is the syntax for a multi-line comment 
		 * As 
		 * many 
		 * lines 
		 * as 
		 * you 
		 * want.
		 */	

		
		int int1; // Variable declaration - defining a variable type/name
		int1 = 1; // Variable initialization - assigning a value to a variable
		
		/*
		 * Java data types: Objects and Primitives 
		 */
		
		// Primitive datatypes
		
		// Whole numbers
		byte b = 1; // 1 byte
		short s = 10; // 2 bytes
		int i = -54; // 4 bytes
		long l = 1234L; // 8 bytes

		// Accommodates for decimals
		float f = 12.3F; // 4 bytes
		double d = 32.6458; // 8 bytes

		char c = 'A'; // 2 bytes
		boolean bool = true; // JVM dependent - true/false

		/*
		 *  Object/Reference types: (from https://docs.oracle.com/javase/tutorial/java/javaOO/objectcreation.html)
		 *  	- The new operator instantiates a class by allocating memory for a new object and returning a reference to that memory. The new operator also invokes the object constructor.
		 *  	- The new operator returns a reference to the object it created. This reference is usually assigned to a variable of the appropriate type.
		 */
		Object o = new Object();
		
		
		/*
		 * Wrapper classes - Classes of objects which hold primitive values to treat primitives like objects
		 * 		- Autoboxing: Automatic conversion of a primitive variable to its wrapper class
		 * 		- Autounboxing: Automatic conversion of a wrapper class into a primitive
		 */
		
		Integer int2 = 1; // Autoboxing
		int int3 = int2; // Autounboxing
		
		Byte objB = 1; // 16bytes
		Short objS = 2; // 16bytes
		Character objC = c; // 16 bytes
		Float objF = f; // 16 bytes 
		Double objD = d; // 24 bytes
		Boolean objBool = bool; // JVM dependent.
		Long objLong = l; // 24 bytes

		/*
		 * Strings are objects which represent sequences of characters.
		 * 		- Strings can be created via String literals and or using the new keyword
		 */
		String string = "Hello"; // String literal
		String string2 = "Hello"; // String literal
		String str = new String("Hello"); // Using new keyword

		/*
		 * Instantiating a class userdefined class
		 */
		Animal a = new Animal();
		/*
		 * Instance and class variables don't need to be initialized, once declared they are provided with default values:
		 * 	- boolean: false
		 * 	- byte, short, int, long: 0
		 * 	- float, double: 0.0
		 * 	- char: '\u0000'
		 * 	- reference type: null
		 */
		System.out.println("These are the default values: numOfLegs " + a.numOfLegs + ", hasTail " + a.hasTail
				+ ", weight is " + a.weight + ", name is " + a.name);
		
		// When accessible, instance variable can be altered using the following syntax [reference].[property]
		a.hasTail = true;
		
		System.out.println("Hastail: " + a.hasTail);

		/*
		 *  = : assignment operator 
		 *  == : comparison operator
		 */
		Animal llama = new Animal();
		llama.numOfLegs = 4;
		llama.hasTail = true;
		llama.weight = 10;
		llama.name = "llama";

		Animal dog = new Animal(4, true, 10F, "dog", false);

		// Methods can be called upon object using the following syntax [reference].[property]([arguments if any])
		dog.eat("bones");

		/*
		 * Arrays are groups of elements of the same datatype, they can be either primitives or objects.
		 * 		- Arrays are contiguous blocks in memory and as such the size of the array must be specified when initialized
		 * 		- Elements in an array can be selected using their index. The index in an array starts at 0.
		 */
		
		Animal[] animalArray = { a, llama, dog }; // Animal array of size 3
		Animal[] animalArray2 = new Animal[5]; // Animal array of size 5
		

		
		/*
		 * Control flow statements break the traditional top to bottom flow of execution of an application by incorporating decision making, looping, and the like.
		 * 		- if/else if/else
		 * 		- for
		 * 		- while
		 * 		- do/while
		 * 		- switch
		 */
		
		
		/*
		 * for and enhanced for loops are best when the number of iterations is known
		 */
		// A typical for loop follows the following syntax: for (initialization; termination; increment){statements}
		for(int j = 0; j < animalArray.length; j++) {
			System.out.println(animalArray[j].breathe());
		}
		for (Animal z : animalArray) {
			// This block of code will execute for each element of the animalArray
			z.breathe();
		}
		
		int e = 2;
	
		/*
		 * While and do/while loops are best when the number of iterations is unknown
		 */
		while(e < animalArray.length) {
			System.out.println(animalArray[e].breathe());
			e++;
		}

		int g = 2;
		do {
			System.out.println(animalArray[g].breathe());
		} while (e > animalArray.length);



		/*
		 * Switch statements work with byte, short, char, and int and their associated wrapper classes. They also work with enums and Strings.
		 * 		- A switch statement evaluates an expression to execute the statements that match the a specific case
		 * 		- Not including a break statement causes the logic to "fall through"
		 * 		- switch(expression to be evaluated){
		 * 				case 1: 
		 * 					[statement]
		 * 					break;
		 * 				case 2: 
		 * 					[statement]
		 * 					break;
		 * 				[...]
		 * 				case [x]  
		 * 					[statement]
		 * 					break;
		 * 				default:
		 * 					[statement]
		 * 					break; (not necessary but good practice)
		 * 			}
		 */
		
		c = 'B';
		switch (c) {
		case 'A':
			System.out.println("The letter is A.");
			break;
		case 'B':
			System.out.println("The letter is B.");
			break;
		case 'C':
			System.out.println("The letter is C.");
			break;
		default:
			System.out.println("Letter was not found");
			break;
		}
	}

}
