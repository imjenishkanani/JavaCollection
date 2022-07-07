package com.collection.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class CursorListIterator {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		
		al.add("raj");
		al.add("ramesh");
		al.add("max");
		al.add("jay");
		
		System.out.println(al);
		
		ListIterator li = al.listIterator();
		
		while(li.hasNext()) {
			String item = (String)li.next();
			
			if(item.equals("jay")) {
				li.add("veeru");
			}
			if(item.equals("raj")) { // remove and shift other ele.
				li.remove();
			}
			if(item.equals("max")) { // replace max -> maxx
				li.set("maxx");
			}
		}
		System.out.println(al);
	}
}
