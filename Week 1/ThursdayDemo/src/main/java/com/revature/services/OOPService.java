package com.revature.services;

import com.revature.interfaces.Flyable;
import com.revature.models.Animal;
import com.revature.models.Dinosaur;

public class OOPService {

	public static void usingEncapsulation(){
		System.out.println("using Encapsulation.");
		
//		Animal a = new Animal();
		// The name field is private and therefore not accessible from a different class.
//		System.out.println(a..name);
//		System.out.println(a.getName());
//		
//		a.setName("Jimmy");
		// When is SYSO, the toString() method is called.
//		System.out.println(a);
//		
//		a.setNumOfLegs(-1);
//		System.out.println(a);
//		
//		a.setNumOfLegs(4);
//		System.out.println(a);
	}
	
	public static void usingInheritance() {
//		System.out.println("using Inheritance");
//		
//		Bird b = new Bird();
//		
//		b.setName("John");
//		b.setNumOfLegs(2);
//		b.setCanFly(false);
//		System.out.println(b);
//		
//		Bird c = new Bird("James", 3, true);
//		System.out.println(c);

	}
	
	public static void usingPolymorphism() {
//		System.out.println("using Polymorphism");
//		Animal a = new Animal();
//		
//		System.out.println(a.talk());
//		System.out.println(a.talk("hi", 5));
		
		//Upcasting
//		Animal b = new Bird();
//		Animal d = new Dinosaur();
//		
//		System.out.println("Animal says: " +a.talk());
//		System.out.println("Bird says: " + b.talk());
//		System.out.println("Dinosaur says: " + d.talk());
		
		// when upcasted can only run methods available in Class that was casted
//		d.rawrLoud();
		
//		Animal[] animals = {a, b, d};
//		for(Animal animal : animals) {
//			System.out.println(animal.talk());
//		}
//		
//		Dinosaur bird = (Dinosaur) d;
//		System.out.println(bird.rawrLoud());
		
		//Downcasting
//		Dinosaur dino = (Dinosaur) a;
//		dino.rawrLoud();
		
	}
	
	public static void usingAbstraction() {
		System.out.println("using Abstraction");
		
		// You cannot instantiate an abstract class
//		Animal a = new Animal();
		
		Animal a = new Dinosaur();
		System.out.println(a.sleep());
		
//		Animal[] animals = {a};
		
		Dinosaur d = new Dinosaur();
		System.out.println(d.fly());
		System.out.println(d.flyFaster());
		
		
		Flyable f = new Dinosaur();
		
		Flyable[] flyables = {d, f};
		
		for(Flyable fly: flyables) {
			System.out.println(fly.fly());
		}
	}
}
