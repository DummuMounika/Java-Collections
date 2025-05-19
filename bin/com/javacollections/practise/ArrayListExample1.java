package com.basic.programs.collections;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

import com.basic.programs.codingpractise.Info;

public class ArrayListExample1 {
	public static void main (String args[]) {
		ArrayList<String> al1 = new ArrayList<>();
		al1.add("Mounika");
		al1.add("Venu");
		System.out.println("Before using add(element) :"+ al1);
		al1.add(0,"Vijaya");
		al1.add(1,"Sekhar");
		System.out.println("After using add(index, ele) : "+ al1);
		ArrayList<String> al2 = (ArrayList<String>) al1.clone();
		System.out.println("Checking al1 equal or not with al2: "+al2.equals(al1));
		System.out.println("checking element presence: "+ al1.contains("Mounika1"));
		System.out.println("Returning element: "+ al1.get(1));
		System.out.println("Returning classname: "+ al2.getClass());
		System.out.println("Checking empty or not: "+al1.isEmpty());
		System.out.println("Added al2 in al1: "+ al1.addAll(al2));
		
		//Traversing list through iterator
		Iterator itr = al1.iterator();
		System.out.println("Duplication is allowed in list");
		while(itr.hasNext()) {
			System.out.print("Iteration list: "+ itr.next()+ " ");
		}
		System.out.println();
		al1.set(4, null);
		System.out.println("set element: "+ al1);
		al1.set(4, "Akhi");
		System.out.println("set element after: "+ al1);
		Collections.sort(al1);
		System.out.println("sorted element:");
		for(String names : al1) {
			System.out.print(names + " ");
		}
		System.out.println();
		ArrayList<Integer> countrycode = new ArrayList<>();
		countrycode.add(1);
		countrycode.add(91);
		countrycode.add(673);
		countrycode.add(357);
		
		System.out.println("Traversing list through List Iterator in reverse order:");  
		ListIterator<Integer> li = countrycode.listIterator(countrycode.size());
		while(li.hasPrevious()) {
			System.out.print(li.previous() + " ");
		}
		
		System.out.println("\n" +"Traversing list through forEach() method using lambda exp:");  
		countrycode.forEach(c -> {
			System.out.print(c + " ");
		});
		
		String s = "Mounika Dummu";
		Info detail = new Info();
		System.out.println("\n using user-defined class object: " + detail.Info(s));
		System.out.println(detail.getClass());
		
		System.out.println("Serialization");
		File file = new File("C:\\Users\\mouni\\Desktop\\javaFiles\\ArrayTestout.txt");
		try(FileOutputStream fos = new FileOutputStream(file)) {
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(al1); // Write the ArrayList object to the file  
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("De-Serialization");
		try(FileInputStream fis = new FileInputStream(file)){
			ObjectInputStream ois = new ObjectInputStream(fis);
			 ArrayList names = (ArrayList) ois.readObject();
			 System.out.println("Reading from the created file");
			 System.out.println(names);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//Adding second list elements to the first list at specific position
		System.out.println("Before: "+ al2);
		al2.addAll(2,al1);
		System.out.println("After: " +al2);
		al2.remove(4);
		System.out.println("After invoking remove(index) method: \n "+al2);  
		al2.remove("Mounika");
		System.out.println("After invoking remove(object) method: \n"+al2);   
		//al2.removeAll(al1);
		//System.out.println("After invoking removeAll() method: \n"+al1);   
		 System.out.println("Printing al1"+ al1);
		 System.out.println("Printing al2"+ al2);
		System.out.println("Retain only the elements that are present in both al1 and al2 ");
		al2.retainAll(al1);
	    System.out.println(al1);
	
	}

}
