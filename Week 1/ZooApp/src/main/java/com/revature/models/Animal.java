package com.revature.models;

import java.io.Serializable;

/*
 * Classes are blueprints for objects, they define their states and behaviors.
 * Class declaration:
 * 		- [access modifier] [non-access modifier] class [ClassName] {}
 * Members of a class:
 * 		- Variable and methods of that class
 * 			- Object specific
 * 				- Instance variables
 * 				- Instance methods
 * 			- Belong to the class, they don't belong to a specific object
 * 				- Static variables
 * 				- Static methods
 * 
 * Scopes of a variable:
 * 	- Class/Static scope: The largest scope that is available. Variables in the class scope exist for the lifetime of the class and within the class itself.
 * 	- Object/Instance scope: The object's fields/state variable exist for the lifetime of the object itself and exist within the object. 
 * 	- Method/Local scope - Parameter and any variable declared at the method level. These variable only exist within the lifetime of the method call.  
 *  - Loop/Block scope - any variable declared within curly braces {}
 * 	- Static and Instance scoped variables get assigned default values, however Method and Block scoped variables do not. 
 * 
 * Encapsulation
 * 	- Encapsulation is one of the pillars of OOP (Object-Oriented Programming)
 * 	- Encapsulation is the process of restricting access to fields of an object through the use of getters and setters in order to increase control over how an object is used
 * 	- Encapsulation is achieved through access modifiers
 * 
 * POJO, Java Bean
 * 	- POJO: Plain Old Java Object - Any Java object
 *  - Java Bean: 
 *  	- A no-args constructor
 *  	- All private fields
 *  	- Public getters and setters for each fields
 *  	- implements Serializable
 */

public class Animal implements Serializable {
	
	/*
	 * Access modifiers:
	 * 	- Specifies which classes have access to reading a variable or modifying a class/field/method
	 * 	- public - Least restrictive access modifier, all of the classes within the entire application have access.
	 * 	- protected - All of classes within the same package as well as any subclasses/child classes would have access.
	 * 	- "default" - The 'default' keyword is used for another purpose, the default access modifier is illustrated by not including one. All of the classes within the same package have access.
	 *  - private - the most restrictive access modifier, only the class itself has access.
	 * 
	 * Fields:
	 * 	- Usually follow the following syntax:
	 * 	[access modifier] [non-access modifier] [datatype] [variableName];
	 */
	private String name;
	private int age;
	private double weight;
	
	/*
	 * static is a reserved keyword java that makes something (ie: field or a method) associated directly with the class. Meaning that we do not need an object to be instantiated in order to use that static field or method.
	 * All of the objects of the class would have access to the SAME variable or method.
	 * static fields and methods can be accessed using the following syntax: *if the access modifier allows it
	 * 		- ClassName.fieldname
	 * 		- ClassName.methodName()
	 * They can also be accessed via objects: *if the access modifier allows it
	 * 		- objectName.fieldName
	 * 		- objectName.methodName()
	 */
	public static int counter = 0; 
	
	/*
	 * Getter: method used to return field value
	 */
	public String getName() {
		return name;
	}
	
	/*
	 * Setter: method used to set a field's value
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age<0) {
			System.out.println("Invalid value");
		}else {
			this.age = age;
		}
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public Animal() {	
		counter++;
	}
	
	/*
	 * Methods are blocks of reusable code with some functionality that can take inputs and return an output.
	 * [access modifier] [non-access modifier] [returnType] [methodName] ([argument dataType] [argument], [argument datatype1] [argument1], [...]){[method implementation]} 
	 */
	public String talk(String word) {
		return word;
	}
	
	public static void hello(int i) {
		for(int j = 0; j < i; j++) {
			System.out.println("hello");
		}
	}
	
	protected void finalize() {
		System.out.println("I have been garbage collected.");
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + ", weight=" + weight + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(weight);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Animal other = (Animal) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(other.weight))
			return false;
		return true;
	}

	public Animal(String name, int age, double weight) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
		counter++;
	}
	
	
	
}
