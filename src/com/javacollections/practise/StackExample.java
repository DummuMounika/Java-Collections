package com.basic.programs.collections;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack();
		System.out.println("Checking stack is empty or not : "+s.empty());
		s.push(12);
		s.push(34);
		s.push(54);
		s.push(98);
		System.out.println("Elements in Stack: " + s); 
		System.out.println("Element returns the top element using peek(): "+s.peek());
	    s.pop();
	    System.out.println("After popping element in Stack: " + s);  
	    
	    System.out.println("Searching the object using search():"+ s.search(54));
		 
	    System.out.println("stack size: "+s.size());
	}

}
