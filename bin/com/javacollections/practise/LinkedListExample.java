package com.basic.programs.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
	
	public static void main(String[] args) {
		LinkedList<String> coffeetypes = new LinkedList<>();
		coffeetypes.add("Espersso");
		coffeetypes.add("Americano");
		coffeetypes.add("Latte");
		coffeetypes.add("Cappuccino");
		coffeetypes.add("Mocha");
		
		Iterator list = coffeetypes.iterator();
		while(list.hasNext()) {
			System.out.print(list.next()+ " ");
		}
		
		LinkedList<String> coffeetypes1 = new LinkedList<>();
		coffeetypes1.add("Turkish Coffee");
        coffeetypes1.add("Cold Brew");
        
        coffeetypes.addAll(coffeetypes1);
        System.out.println("\n After invoking addAll() method: \n"+ coffeetypes);
        
		coffeetypes.addFirst("Double Shot Espersso");
		System.out.println("After invoking addFirst(E e) method:\n"+coffeetypes);  
		
		coffeetypes.addLast("Triple Shot Espersso");
		System.out.println("After invoking addLast(E e) method: \n"+coffeetypes);
		
		coffeetypes.remove();
		System.out.println("After using remove() - it removes 0th element: \n"+coffeetypes);
		
		System.out.println("After invoking removeFirst() method- before: "+coffeetypes1);
		//coffeetypes1.removeFirst();
		//System.out.println("After invoking removeFirst() method - after: "+coffeetypes1);  
	
		//coffeetypes1.removeLast();
		//System.out.println("After invoking removeLast() method - after: "+coffeetypes1);  
		
		//coffeetypes1.clear();
		System.out.println(coffeetypes1.isEmpty());
		
		System.out.println("Traversing the list of elements in reverse order:");
		Iterator i = coffeetypes.descendingIterator();
		while(i.hasNext()) {
			System.out.print(i.next() + ",");
		}
		
		LinkedList favCoffee = (LinkedList) coffeetypes.clone();
		System.out.println("\n"+ favCoffee);
		
		System.out.println("Checking element presence: "+ favCoffee.contains("Espersso"));
		
		System.out.println("retrieve the first element of a list: "+favCoffee.element());
		
		System.out.println("return the index in a list: "+favCoffee.lastIndexOf("Latte"));
		
		favCoffee.offer("Filter coffee");
		System.out.println("Added element with offer(): \n"+favCoffee);
		
		favCoffee.offerFirst("Bru coffee");
		System.out.println("Added element with offerFirst(): \n"+favCoffee);
		

		favCoffee.offerLast("Continental coffee");
		System.out.println("Added element with offerLast(): \n"+favCoffee);
		
		System.out.println("Retrieves the first element of a list: "+favCoffee.peek());
		
		System.out.println("Retrieves the first element using peekFirst() : "+favCoffee.peekFirst());
		
		System.out.println("Retrieves the first element using peekLast(): "+favCoffee.peekLast());
		
		System.out.println("Before using poll methods:\n"+ favCoffee);
		
		System.out.println("Retrieves and remove the first element using poll(): "+favCoffee.poll());
		
		System.out.println("Retrieves and remove the first element using pollLast(): "+favCoffee.pollLast());
		
		System.out.println("After using poll methods:\n"+ favCoffee);
		
		System.out.println("Pop element using pop():"+ favCoffee.pop());
		System.out.println("After using pop methods:\n"+ favCoffee);
		favCoffee.push("Espersso");
		System.out.println("After using push():"+ favCoffee);
		favCoffee.add(null);
		System.out.println("After using push():"+ favCoffee);
		
		
	}

}
