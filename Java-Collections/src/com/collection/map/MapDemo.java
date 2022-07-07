package com.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		
		Map map = new HashMap();
		
		map.put(1, "Aahul");
		map.put(5, "Rahul");
		map.put(2, "jai");
		map.put(6, "Amit");
		
		Set set = map.entrySet();
		Iterator itr = set.iterator();
		
		while(itr.hasNext()) {
			Map.Entry entry = (Map.Entry)itr.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
}
