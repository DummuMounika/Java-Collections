package com.basic.programs.collections;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapExample {

	public static void main(String[] args) {
		EnumMap<weekDays,String> map = new EnumMap<>(weekDays.class);
		map.put(weekDays.MONDAY, "1");  
	    map.put(weekDays.TUESDAY, "2");  
	    map.put(weekDays.WEDNESDAY, "3");  
	    map.put(weekDays.THURSDAY, "4");  
	    
	    for(Map.Entry m : map.entrySet()) {
	    	System.out.println(m.getKey()+ "-" +m.getValue());
	    }

	}

}
