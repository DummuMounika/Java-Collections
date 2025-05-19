package com.basic.programs.collections;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<>();
		map.put(1,"USA");
		map.put(91, "India");
		map.put(762, "Brazil");
		map.put(41, "pakistan");
		map.put(562, "Europe");
		map.put(988,null);
		
		System.out.println("Printing key-value pair using for iterator");
		Set set = map.entrySet();
		Iterator i = set.iterator();
		while(i.hasNext()) {
			//System.out.println(i.next());
			 Map.Entry entry = (Map.Entry)i.next();
			 System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		map.putIfAbsent(988, "UK");
		System.out.println("Insert if value is absent using putIfAbsent(): \n"+map);
		
		
		System.out.println("Printing key-value pair using for enhaced loop");
		for(Map.Entry m:map.entrySet()) {
			System.out.println(m.getKey() + " "+ m.getValue());
		}
		
		System.out.println("Printing key-value pair using comparingByKey()");
		
		map.entrySet().stream()
		.sorted(Map.Entry.comparingByKey())
		.forEach(System.out::println);
		
		System.out.println("Printing key-value pair using comparingByKey() in descending order: ");
		
		map.entrySet().stream()
		.sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
		.forEach(System.out::println);
		
		System.out.println("Removing key:"+ map.remove(988));
		System.out.println("Checking map after removing: \n"+ map);
		
		System.out.println("Return key set:"+ map.keySet());

		System.out.println("checking it contain key or not: "+map.containsKey(1));
		System.out.println("checking it contain value or not: "+map.containsValue("USA"));
		System.out.println("Returns the object that contains the value :"+map.get(91));
		
		map.put(891, null);
		map.put(55, null);
		System.out.println(map);
		System.out.println(map.getOrDefault(562, null));
		System.out.println(map.getOrDefault(55, null));
		map.replace(55, "Seoul");
		System.out.println("Printing after map replace:\n"+map);
		
	}

}
