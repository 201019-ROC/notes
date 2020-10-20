package com.revature;

public class Driver {

		public static void main(String[] args) {
			/*
			 * '=' is referred to as the assignment operator, it assigns the value on its right to the operand on its left.
			 * We can use it to assign object references
			 */
			
			int a = 1;
			Object o = new Object();
			
			/*
			 * Arithmetic operators:
			 * 	- '+' - Additive Operator
			 * 	- '-' - Subtraction Operator
			 * 	- '*' - Multiplication Operator
			 * 	- '/' - Division Operator
			 * 	- '%' - Modulo Operator/ Remainder Operator
			 */
			
			int b = 1;
			int c = 2;
			
			// Beware string concatenation
			System.out.println("1 + 2 = " + (b + c));
			System.out.println("1 - 2 = " + (b - c));
			System.out.println("1 * 2 = " + b * c); 
			System.out.println("1 / 2 = " + b / c); 
			System.out.println("1 % 2 = " + b % c); 
			
			//We can combine arithmetic operators with the assignment operator
			b += 2;
			System.out.println("b is now equal to " + b);
			
			/*
			 * Unary operators:
			 * 	- '+' - Indicates a positive value (not necessary)
			 *  - '-' - Indicates a negative value
			 *  - '++' - Increment Operator
			 *  - '--' - Decrement Operator
			 *  - '!' - Logical Complement Operator - Switches boolean value
			 *  
			 *  prefix: the in/decrement is evaluated before the expression
			 *  postfix: the in/decrement is evaluated after the expression 
			 */
			
			boolean bool = true;
			System.out.println("The expression is evaluated at " + c); // 2
			System.out.println("The expression is evaluated at " + c++); 
			System.out.println("The expression is evaluated at " + ++c); // 4
			// c = 4
			System.out.println("The expression is evaluated at " + c--); // Print out: 4, then c - 1
			// c = 3 
			System.out.println("The expression is evaluated at " + --c); // c - 1, c = 2, Print out 2
			// c = 2
			
			System.out.println(!bool);
			
			/*
			 * Equality and Relational Operators
			 * 	- '==' - Equals to
			 * 		- Is mainly used in order to evaluate primitive values
			 * 		- When used on objects, it compares the memory addresses
			 * 	- '!=' - Not equal to
			 *  - '>' - greater than
			 *  - '<' - less than
			 *  - '>=' - greater than or equal to
			 *  - '<=' - less than or equal to
			 */
			
			/*
			 * Conditional Operators:
			 * 	- '&', '|' - bitwise operator evaluates both side of the expression
			 *  - '&&', '||' - short circuit operators, evaluates the second side only if needed.
			 */
			
			boolean bool1 = true;
			boolean bool2 = false;
			
			// false & true - &
			// false - && 
			if(bool2 && bool1) {
				System.out.println("Evaluated as true.");
			} else {
				System.out.println("Evaluated as false");
			}
			
			/*
			 * Ternary Operator:
			 * 	- Can be thought shorthand version of an if-else statement
			 * 	- [statementToBeEvaluated] ? [ifTrue] : [ifFalse];
			 */
			
			System.out.println( 1 > 4 ? "It's true" : "It's false");
			
			/*
			 * Operator Precedence: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html
			 */
		}
}
