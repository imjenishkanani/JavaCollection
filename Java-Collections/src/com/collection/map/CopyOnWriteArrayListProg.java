package com.collection.map;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListProg {
	
	public static void main(String[] args) {
		//ArrayList<String> list = new ArrayList<String>();
		CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<String>();
		list.add("Jhon");
		list.add("Rohan");
		list.add("Harry");
		list.add("Patter");
		
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			String name = (String) itr.next();
			if(name.equals("Harry")) {
				itr.remove(); // we can't use remove()
			}
		}
		System.out.println(list);
	}

}
