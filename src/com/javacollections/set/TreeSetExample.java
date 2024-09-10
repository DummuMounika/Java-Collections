package com.javacollections.set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * It contains unique elements only.
 * No null element
 * Duplicate Elements are not allowed
 * Not synchnorized
 * follows ascending order
 * use it when you want only unique elements with order
 */
public class TreeSetExample {
	public static void main(String[] args) {
		Set<Integer> numb = new TreeSet<>();
		numb.add(7);
		numb.add(2);
		numb.add(4);
		System.out.println(numb);
		Iterator<Integer> i = numb.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
