package com.collection.list;

import java.util.LinkedList;

public class LinkedListProgram {
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add("jhone");
		l.add(10);
		l.add(null);
		System.out.println(l);
		
		l.set(1, 11);
		System.out.println(l);
		
		l.add(2, "rrr"); // added at index 2 and other ele shifted.
		System.out.println(l);
		
		l.removeLast();
		System.out.println(l);
		
		l.addFirst(1);
		System.out.println(l);
	}
}
