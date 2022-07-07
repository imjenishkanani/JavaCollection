package com.collection.map;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {

	public static void main(String[] args) {
		
		ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<Integer, String>();
		
		map.put(0, "Basics");
		map.put(1, "String");
		map.put(0, "Tech");
		
		System.out.println(map);
		
		//map.remove(1);
		
		map.putIfAbsent(0, "Hello");
		map.put(0, "omm");
		System.out.println(map);
		
		map.remove(1, "String");
		System.out.println(map);
		
		map.replace(0, "omm", "Know");
		System.out.println(map);

	}

}
