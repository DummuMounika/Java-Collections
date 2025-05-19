package com.basic.programs.collections;

import java.util.Hashtable;
import java.util.Map;

public class HashTableExample {

	public static void main(String[] args) {
		Hashtable<Integer, String> htable = new Hashtable();
		htable.put(100,"Amit");  
		htable.put(102,"Ravi");  
		htable.put(1087,"Vijay");  
		htable.put(103,"Rahul");  
		htable.put(109, "Monu");
		
		for(Map.Entry m:htable.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		System.out.println("Using getOrDefault() for 1087 key: "+htable.getOrDefault(1087, "Not Found"));  
		System.out.println("Using getOrDefault() for 1987 key: "+htable.getOrDefault(1987, "Not Found"));  
		System.out.println("Before remove: "+ htable); 
		htable.remove(1087);
		System.out.println("After remove: "+ htable); 
		htable.putIfAbsent(1087, "Vijay Thalpati");
		System.out.println("Updated Map: "+htable);  
		
	}

}
