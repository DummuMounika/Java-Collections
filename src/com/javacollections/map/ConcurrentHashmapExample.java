package com.javacollections.map;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashmapExample {
	public static void main(String[] args) {
		ConcurrentHashMap<Integer, String> chmap = new ConcurrentHashMap<>();
		chmap.put(8, "Third");
		chmap.put(6, "Second");
		chmap.put(4, "First");
		chmap.put(2, "Fifth");
		
		Iterator itr = chmap.entrySet().iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next()); 
			
		}
		
	}

}
