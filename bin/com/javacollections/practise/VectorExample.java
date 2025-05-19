package com.basic.programs.collections;

import java.util.Enumeration;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		v.add("uyyi amma");
		v.addElement("hayyi tho");
		v.add(2, "margayi");
		v.addElement("uyyi amma");
		
		Enumeration e = v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

	}

}
