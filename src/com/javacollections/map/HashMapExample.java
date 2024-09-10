package com.javacollections.map;

import java.util.HashMap;
import java.util.Map;

/* 
 * Difference between HashSet and HashMap
HashSet contains only values whereas HashMap contains an entry(key and value).
* Only one null key and can have multiple null values
* Duplicate key Elements are not allowed but can have values
* No order
* Not synchnorized
* use it when you want only key value pairs without any order
* 
*/
public class HashMapExample {
	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<>();
		map.put(5, "GooseBerry");
		map.put(1, "Mango");
		map.put(2, "Banana");
		map.put(3, "Apple");
		map.put(1, "Grape");
		map.putIfAbsent(4, "Orange");
		map.putIfAbsent(2, "Berry");
		System.out.println("Iterating hashmap");
		for(Map.Entry<Integer,String> m : map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
	}

}
