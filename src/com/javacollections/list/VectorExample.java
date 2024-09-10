package com.javacollections.list;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/**
 * Vector is Synchnorized list
 * Allow Duplicate elements
 * Allow us to add Null Elements
 * Order of the elements are in Insertion Order
 * Use it when you need synchronized list.
 * 
 */
public class VectorExample {
	public static void main(String[] args) {
		List<String> dishes1 = new Vector<>();
		Vector<String> dishes = new Vector<>();
		dishes.addElement("Paratha");
		dishes.set(0, "Dosa");
		dishes.add(1, null);
		dishes.set(1, "Idli");	
		dishes.addElement(null);
		System.out.println("First element: " + dishes.firstElement());
		System.out.println("Last element: " + dishes.lastElement());
		Iterator<String> i = dishes.iterator();
		while(i.hasNext()) {
			System.out.println("Lists of vector dishes:" + i.next());
		}
		dishes1.addAll(0, dishes);
		dishes1.add(0, "Paratha");
		dishes1.add(1,"Upma");
		System.out.println("printing list of dishes: " + dishes1);
		
	}

}
