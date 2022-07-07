package com.collection.list;

import java.util.Vector;

public class IteratingVector {
	public static void main(String[] args) {
		Vector<String> v1 = new Vector<>();
		
		v1.add("Ram");
		v1.add("Shyam");
		v1.add(1, "For");
		
		// iterating using for loop
		for(int i=0; i<v1.size(); i++) {
			System.out.println(v1.get(i) + " ");
		}
		
		// iterating using loop
		for(String str : v1) {
			System.out.println(str + " ");
		}
	}
}
