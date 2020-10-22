package com.revature.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class CollectionService {

	public void usingLists() {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		System.out.println(al);
		al.add(2);
		System.out.println(al);
		al.add(0, 3);
		System.out.println(al);
		System.out.println("al contains 2: " + al.contains(2));
		al.remove(0);
		System.out.println(al);
		
		//index OOB
//		al.add(5, 6);
//		System.out.println(al);

		//Bad practice, don't do this
//		ArrayList al1 = new ArrayList();
//		al1.add("Hello");
//		al1.add(new Dinosaur());
//		al1.add(true);
//		System.out.println(al1);
		
		for(Integer i:al) {
			System.out.println(i);
		}
		
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(1);
		ll.add(2);
		System.out.println("The size of ll is: " + ll.size());
		
		for(Integer i:ll) {
			System.out.println(i);
		}
		
		//add all elements from a collection to another.
		al.addAll(ll);
		System.out.println(al);
	}
	
	public void usingSets() {
		List<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(1);
		al.add(5);
		al.add(2);
		al.add(15);
		al.add(-5);
		System.out.println(al);
		
		HashSet<Integer> hs = new HashSet<>();
		hs.addAll(al);
		System.out.println(hs);
		
		for(Integer i: hs) {
			System.out.println(i);
		}
		
		TreeSet<Integer> ts = new TreeSet<>();
		ts.addAll(al);
		System.out.println(ts);
	}
	
	public void usingQueues() {
		Queue<Integer> ll = new LinkedList<>();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		
		System.out.println(ll.peek());
		System.out.println(ll.poll());
		System.out.println(ll.peek());
		
	}
	
	public void usingMaps() {
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(1, "Hello");
		hm.put(2, "World");
		hm.put(3, "!");
		
		System.out.println(hm);
		
		Set<Integer> hs = hm.keySet();
		
		for(Integer i: hs) {
			System.out.println(hm.get(i));
		}
	}
}
