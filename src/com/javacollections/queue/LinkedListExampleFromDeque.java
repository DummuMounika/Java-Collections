package com.javacollections.queue;

import java.util.LinkedList;
import java.util.Queue;
/**
 *  contain duplicate elements.
 *  maintains insertion order.
 *  class is non synchronized.
 *   
 */

public class LinkedListExampleFromDeque {
	 public static void main(String[] args) {
	        Queue<String> queue = new LinkedList<>();
	        queue.add("Task 1");
	        queue.add("Task 2");
	        queue.add("Task 3");
	        queue.offer("Task 4");
	        queue.offer("");
	        System.out.println(queue.size());
	        
//	        while (!queue.isEmpty()) {
//	            System.out.println(queue.poll());
//	        }
	        
	        LinkedList<String> queue1 =new LinkedList<>(); 
	        queue1.addAll(queue);
	        System.out.println(queue1);
	        queue1.addFirst("Task 0");
	        queue1.addLast("Task 5");
	        System.out.println(queue1);
	    }
	}

