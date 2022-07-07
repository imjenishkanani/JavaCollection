package com.collection.map;

import java.util.Map;
import java.util.TreeMap;

public class JavaTreeMapDemo {

	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		
		map.put(100, "Amit");
		map.put(102, "Ravi");
		map.put(101, "Vijay");
		map.put(103, "Rahul");
		
		System.out.println("before remove method..");
		for(Map.Entry m:map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
		System.out.println("after remove method..");
		// remove() method.
		map.remove(102); // remove whole object by by passing key.
		
		for(Map.Entry m:map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}

}
