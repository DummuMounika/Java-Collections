package com.basic.programs.collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		Map<Integer, String> studentMap = new LinkedHashMap<>();  
		studentMap.put(1001, "Mounika Dummu");
		studentMap.put(1002, "Venu Dummu");
		studentMap.put(1003, "Vijaya Dummu");
		studentMap.put(1004, "Chandra Sekhar Dummu");
		
		for(Map.Entry m : studentMap.entrySet()) {
			System.out.println(m.getKey() +" "+m.getValue());
		}
	}

}
