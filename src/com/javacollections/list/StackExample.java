package com.javacollections.list;

import java.util.Iterator;
import java.util.Stack;

/**
 * Last In First Out
 * Stack is a class that falls under the Collection framework that extends the Vector class.
 * Stack class is synchronized 
 * Order of the elements are in Insertion Order
 */
public class StackExample {
	public static void main(String[] args) {
		Stack<Integer> numb = new Stack<>();
		numb.add(9);
		numb.add(1, 6);
		numb.add(3);
		System.out.println(numb);
		System.out.println("Checking the top value: " + numb.peek());
		numb.push(7);
		System.out.println("Searching the number:" + numb.search(2));
		System.out.println(numb);
		numb.pop();
		Iterator i = numb.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		
	}
	

}
