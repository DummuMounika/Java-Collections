package com.basic.programs.collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		TreeMap<Integer,String> map = new TreeMap<>();
		map.put(1092, "Amit Tivari");
		map.put(1900, "Saina Mirza");
		map.put(1001, "Neha");
		map.put(1851, "Virat Kohil");
		map.put(1071, "Sachin Tendulkar");
		
		for(Map.Entry e:map.entrySet()) {
			System.out.println(e.getKey()+ " "+ e.getValue());
		}
        
		System.out.println("Returns the key-value pair having the least key, greater than or equal :\n"+map.ceilingEntry(1870));
		System.out.println("Returns the key having the least key, greater than or equal :\n"+map.ceilingKey(1000));
		
		System.out.println("Using descendingKeySet() to return reverse keys:/n");
		for(Integer me: map.descendingKeySet()) {
			System.out.println(me.intValue());
		}
		System.out.println("Returns the specified key-value pairs in descending order.\n"+map.descendingMap());
		System.out.println(map.navigableKeySet());
		System.out.println("Returns key-value pairs whose keys range from fromKey, inclusive, to toKey, exclusive.: \n"+map.subMap(1000, 1090));
		System.out.println("Returns key-value pairs whose keys are greater than or equal to fromKey: \n"+map.tailMap(1300));
		
	}

}
