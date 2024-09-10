package com.javacollections.list;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * ArrayList is Not Synchnorized 
 * Allow Duplicate elements
 * Allow us to add Null Elements
 * Order of the elements are in Insertion Order
 * Use it when more search operations are needed
 * 
 */
public class ArrayListExample {
	public static void main(String[] args) {
		List<String> cars = new ArrayList<>();
		System.out.println("Check cars list is empty or not! : " + cars.isEmpty());
		System.out.println("Size of the list: " + cars.size());
		cars.add("Volvo");
		cars.add(1,"Audi");
		if(!cars.contains("BMW")) {
			cars.add("BMW");
		}
		System.out.println("Fetching 0th index value: " + cars.get(0));
		cars.set(0, "Benz");
		System.out.println("Check cars list is empty or not! : " + cars.isEmpty());
		System.out.println("Fetching 0th index value again: " + cars.get(0));
		cars.add("Audi");
		cars.add("");
		cars.add("");
		cars.add("");
		System.out.println("Size of the list: " + cars.size());
		
//		Iterator<String> i = cars.iterator();
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
		
		Iterator<String> listI = cars.listIterator(0);
		while(listI.hasNext()) {
			System.out.println(listI.next());
		}
		listI.remove();
		System.out.println("Size of the list: " + cars.size());
		}
	}

