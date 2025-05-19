package com.basic.programs.collections;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
	public static void main(String [] args) {
		LinkedHashSet<String> socialmedia = new LinkedHashSet<>();
		socialmedia.add("LinkedIn");
		socialmedia.add("Instagram");
		socialmedia.add("Youtube");
		socialmedia.add("Facebook");
		System.out.println("Observe the ordered sequence: ");
		socialmedia.forEach(e -> {
			System.out.print(e + " ");
		});
		System.out.println("\n Ignoring duplicate Elements: ");
		socialmedia.add("Facebook");
		socialmedia.add("Twitter");
		for(String l: socialmedia) {
			System.out.print(l + " ");
		}
		System.out.println("\n Checking remove() is able to :"+socialmedia.remove("Facebook1"));
	}

}
