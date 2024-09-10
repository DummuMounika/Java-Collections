package com.javacollections.queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * First In First Out
 * The element with the highest priority (smallest or largest) is served first.
 * Null Elements are not allowed
 * It has duplicate elements
 * It is not synchronized
 * Use it when you want a queue of elements placed in some specific order
 */ 
public class PriorityQueueExample {
	public static void main(String[] args) {
		PriorityQueue <Integer> number = new PriorityQueue<>();
		System.out.println(number.poll());
		number.offer(18);
		number.add(12);
		number.offer(14);
		Iterator<Integer> i = number.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("show the first element:" +number.peek());
		number.remove();
		number.poll();
	}

}
