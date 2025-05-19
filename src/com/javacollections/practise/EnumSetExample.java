package com.basic.programs.collections;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Spliterator;

public class EnumSetExample {
	public static void main(String[] args) {
		Set<weekDays> set = EnumSet.of(weekDays.FRIDAY,weekDays.SUNDAY);
	    System.out.println("Traversing elements: ");
	    Iterator it = set.iterator();
	    while(it.hasNext()) {
	    	System.out.println(it.next());
	    }
	    
		Set<weekDays> set1 = EnumSet.of(weekDays.valueOf("SUNDAY"));
	    System.out.println("Traversing elements for 2nd time: ");
	    System.out.println("Retrieving only 1 value: "+set1);
	    
		Set<weekDays> set2 = EnumSet.allOf(weekDays.class);
	    System.out.println("Traversing elements for 3rd time: ");
	    Spliterator<weekDays> itr = set2.spliterator();
	    itr.forEachRemaining(System.out::println);
	    
	    Set<weekDays> set3 = EnumSet.noneOf(weekDays.class);
	    
	    System.out.println(set3);
	  
	  
	}

}
