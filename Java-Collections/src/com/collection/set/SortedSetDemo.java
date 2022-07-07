package com.collection.set;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {

	public static void main(String[] args) {
		SortedSet s = new TreeSet();
		
		s.add(5);
		s.add(10);
		s.add(2);
		s.add(22);
		s.add(1);
		s.add(1);
		
		System.out.println(s);
		
		// Object first()
		System.out.println(s.first());

		// Object last()
		System.out.println(s.last());
		
		// it return hashset befor given value.
		// SortedSet headSet(Object o)
		System.out.println(s.headSet(22));
		
		// it return hashset after given value including value it self.
		// Sortedset tailSet(Object o)
		System.out.println(s.tailSet(22));
		
		// SortedSet subSet(Object o, Object p)
		System.out.println(s.subSet(1, 3)); // last index is not included
		
		// comparator() is return order of sorted set.
		System.out.println(s.comparator());
	}

}
