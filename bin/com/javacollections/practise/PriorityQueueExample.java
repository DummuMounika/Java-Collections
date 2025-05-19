package com.basic.programs.collections;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		Queue<String> queue = new PriorityQueue<>();
		queue.add("Niti");
		queue.add("Samatha");
		queue.add("Rashmika");
		queue.add("Sara Ali Khan");
		queue.add("Alia Bhatt");
		queue.offer("Pooja hedge");
		
		Iterator itr = queue.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(" Retrieves the head of the queue using element() :\n"+queue.element());
		System.out.println(" Retrieves the head of the queue using peek() :\n"+queue.peek());
		System.out.println(" Retrieves and remove the head of the queue using poll() :\n"+queue.poll());
		System.out.println(" Queue list:\n"+queue);
		
		
		

	}

}
