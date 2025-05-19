package com.basic.programs.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<String> activites= new TreeSet<>();
		activites.add("Running");
		activites.add("Jogging");
		activites.add("Gym");
		activites.add("Pilates");
		System.out.println("Traversing elements in ascending order: ");
		Iterator i = activites.iterator();
		while(i.hasNext()) {
			System.out.print(i.next()+ " ");
		}
		
		System.out.println("\n Traversing elements in descending order: ");
		Iterator i1 = activites.descendingIterator();
		while(i1.hasNext()) {
			System.out.print(i1.next()+ " ");
		}
		
		TreeSet <Integer> numb = new TreeSet<Integer>();
		numb.add(1002);
		numb.add(112);
		numb.add(102);
		numb.add(192);
		numb.add(1102);
		
		System.out.println("\n --Returns the closest greatest element: "+numb.higher(1100));
		System.out.println("\n --Returns the closest least element: "+numb.lower(120));
		
		
		System.out.println("\n --Returns the equal or closest greatest element: "+numb.ceiling(1000));
		System.out.println("\n --Returns the equal or closest least element: "+numb.floor(120));
		
		System.out.println("Returns lowest value using first():" +numb.first());
		System.out.println("Returns highest value using last():" +numb.last());
		
		System.out.println("Before using poll method:"+ numb);
		System.out.println("Remove lowest value using pollFirst():" +numb.pollFirst());
		System.out.println("Remove highest value using pollLast():" +numb.pollLast());
		
		System.out.println("After using poll method:");
		for(Integer n : numb) {
			System.out.print(n+ " ");
		}
		
		System.out.println("\n Remove lowest value using pollFirst():" +activites.pollFirst());
		System.out.println(activites);
		
		 TreeSet<String> set=new TreeSet<>();  
         set.add("A");  
         set.add("B");  
         set.add("C");  
         set.add("D");  
         set.add("E");  
         System.out.println("Initial Set: "+set);
         System.out.println("Reverse set: "+ set.descendingSet());
         System.out.println("Head set : used for show until how many elements: \n"+ set.headSet("C"));
         System.out.println("Head set : used for show until how many elements with boolean para: \n"+ set.headSet("C", true));
 		
         System.out.println("Sub set : used for show in between are present: \n"+ set.subSet("B", "D"));
         System.out.println("Sub set : used for show in between are present with boolean param: \n"+ set.subSet("B", true, "D",true));
		 
         System.out.println("Tail set : used for show after how many elements: \n"+ set.tailSet("E"));
         System.out.println("Tail set : used for show after how many elements with boolean para: \n"+ set.tailSet("C", true));
 		
         
		
	}

}
