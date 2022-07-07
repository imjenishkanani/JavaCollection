package com.collection.map;

import java.util.*;
import java.util.LinkedHashMap;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
		
		map.put(100, "Amit");
		map.put(101, "Vijay");
		map.put(102, "Rahul");
		
		for(Map.Entry m: map.entrySet()) {
			System.out.println(m.getKey()+ " " + m.getValue());
		}
		
		System.out.println("Keys: "+map.keySet());  
		System.out.println("Values: "+map.values());  
		System.out.println("Key-Value pairs: "+map.entrySet());  
	}
}
