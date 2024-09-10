package com.javacollections.set;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Difference between List and Set
 * A list can contain duplicate elements whereas Set contains unique elements only.
 * 
 * It contains unique elements only.
 * Maximum one null element
 * Duplicate Elements are not allowed
 * Not synchnorized
 * use it when you want only unique elements without any order
 * 
 */
public class HashSetExample {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("monu");
		set.add("venu");
		set.add("monu");
		set.add("Monu");
		set.add("Akhi");
		
		System.out.println(set.size());
		set.removeIf(str->str.contains("Monu"));    
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}

}
