package com.revature.driver;

import com.revature.exceptions.AnimalException;
import com.revature.services.CollectionService;
import com.revature.services.ExceptionService;

public class Driver {

	static CollectionService cs = new CollectionService();
	static ExceptionService es = new ExceptionService();
	
	public static void main(String[] args) {
//		OOPService.usingEncapsulation();
//		OOPService.usingInheritance();
//		OOPService.usingPolymorphism();
//		OOPService.usingAbstraction();
//		cs.usingLists();
//		cs.usingSets();
//		cs.usingQueues();
//		cs.usingMaps();
//		cs.rawTypes();
//		Integer[] ia = {1,2,3};
//		String[] sa = {"Hello", "World","!"}
//		GenericService.printMe(ia);
//		GenericService.printMe(sa);
		
		es.usingException2();
		
		
//		Dinosaur a = new Dinosaur();
//		Dinosaur b = new Dinosaur();
//		Dinosaur c = new Dinosaur();
//		
//		a.setName("Di");
//		b.setName("No");
//		c.setName("Saur");
//		
//		Dinosaur[] dinosaurs = {a, b, c};
//		
//		for(Dinosaur d : dinosaurs) {
//			System.out.println("Dinosaur name is: " + d.getName());
//		}
//		
	}

}
