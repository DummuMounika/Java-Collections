package com.basic.programs.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class HashSetExample {
	public static void main (String [] args) {
		HashSet<String> season = new HashSet<>();
		season.add("Summer");
		season.add("Spring");
		season.add("Fall");
		season.add("Rainy");
		System.out.println("Transversing list using iterator"+ "\n" +" Observe the unordered collection");
		Iterator<String> list = season.iterator();
		while(list.hasNext()) {
			System.out.print(list.next() + " ");
		}
		season.add("Spring");
		System.out.println("\n checking duplication: "+season);
		
		season.removeIf(r -> r.contains("Rainy"));
		System.out.println("After invoking removeIf(): "+season);
		
		System.out.println("Addding linkedlist into Hashset:");
		LinkedList<String> coffeetypes = new LinkedList<>();
		coffeetypes.add("Espersso");
		coffeetypes.add("Americano");
		coffeetypes.add("Latte");
		coffeetypes.add("Cappuccino");
		coffeetypes.add("Mocha");
		
		HashSet<String> set = new HashSet(coffeetypes);
		set.add("Mocha");
		set.add("Filter Coffee");
		for(String l: set) {
			System.out.print(l+" ");
		}
		
		
	}

}
