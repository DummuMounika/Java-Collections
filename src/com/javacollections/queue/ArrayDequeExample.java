package com.javacollections.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

/**
 * Double ended Queue
 * contain duplicate elements.
 *  maintains insertion order.
 *  class is non synchronized.
 *  You can use as queue or a stack
 *  Null Elements are not allowed
 *  ArrayDeque has no capacity restrictions.
 *  ArrayDeque is faster than LinkedList and Stack.
 */
public class ArrayDequeExample {
	public static void main(String[] args) {
		Deque<String> name = new ArrayDeque<>();
		name.offerLast("Gorkala");
		name.offer("Monu");
		name.offerFirst("Dummu");
		name.offer("Venu");
		for(String q: name) {
			System.out.println(q);
		}
		
		System.out.println(name.peek());
		System.out.println(name.peekLast());
		
		Iterator i1 = name.iterator();
		while(i1.hasNext()) {
			System.out.println("Insertion order:" + i1.next());
		}
		
		Iterator i = name.descendingIterator();
		while(i.hasNext()) {
			System.out.println("Decending order:" + i.next());
		}
		
	}

}
