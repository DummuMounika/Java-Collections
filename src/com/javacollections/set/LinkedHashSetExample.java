package com.javacollections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * It contains unique elements only.
 * Maximum one null element
 * Duplicate Elements are not allowed
 * Not synchnorized
 * follows insertion order
 * use it when you want only unique elements with insertion order
 */
public class LinkedHashSetExample {
	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<>();
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
