package com.javacollections.list;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * LinkedList is Not Synchnorized 
 * Allow Duplicate elements
 * Allow us to add Null Elements
 * Order of the elements are in Insertion Order
 * Use it when more insertion and removal are needed frequently
 * 
 */
public class LinkedListExample {
	public static void main(String[] args) {
		LinkedList<Double> temperature  = new LinkedList<> ();
		temperature.offer(76.98);
		temperature.add(56.87);
		temperature.addFirst(89.76);
		temperature.addLast(null);
		temperature.addFirst(null);
		System.out.println("size of the linkedlist: " + temperature.size());
		if(!temperature.contains(99.76)){
			temperature.add(1, 99.87);
		}
		System.out.println(temperature);
		Iterator<Double> i = temperature.descendingIterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		temperature.remove(0);
		System.out.println("Removed 0th element: " + temperature);
		
		
	}

}
