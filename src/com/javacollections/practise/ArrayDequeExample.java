package com.basic.programs.collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeExample {
	public static void main(String[] args) {
		Deque<String> d = new ArrayDeque<>();
		Queue<String> d1 = new PriorityQueue<>();
		d1.add("Maneesh");
		System.out.println("Queue list"+d1);
		d.add("vijaya");
		d.offer("chandra");
		d.offerLast("monu");
		d.offerFirst("venu");
		Iterator i = d.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("Using peek() method:"+ d.peek());
		System.out.println("Using peek() method:"+ d.peek());
		System.out.println("Using peekFirst() method:"+ d.peekFirst());
		System.out.println("Using peekLast() method:"+ d.peekLast());
		
		System.out.println("Using poll() method:"+ d.pollLast());
		
	}

}
