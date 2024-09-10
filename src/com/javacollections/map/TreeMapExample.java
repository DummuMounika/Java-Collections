package com.javacollections.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/* 
* Only one null key and can have multiple null values
* Duplicate key Elements are not allowed but can have values
* follows ascending order
* Not synchnorized
* use it when you want only key value pairs with order

*/
public class TreeMapExample {
	public static void main(String[] args) {
		Map<Integer,String> map=new TreeMap<>();
		map.put(2,"Monu");
		map.put(3, null);
		map.put(4, null);
		map.put(5, "Venu");
		System.out.println(map.keySet());
		System.out.println(map.values());
	}

}
