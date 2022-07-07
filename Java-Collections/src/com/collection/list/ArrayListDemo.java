package com.collection.list;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		ArrayList alist = new ArrayList(30);
		
		al.add("jhon");
		al.add(true);
		al.add(19);
		
		System.out.println(al);
		
		// we can remove element by passing index and object itself.
		al.remove(1); // remove by index e.g : 1 is index
		al.remove(new Integer(19)); // remove by value itself
		System.out.println(al);	
		
		System.out.println(al.get(1	));	
	}

}
