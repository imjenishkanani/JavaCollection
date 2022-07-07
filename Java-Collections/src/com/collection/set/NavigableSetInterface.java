package com.collection.set;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetInterface {

	public static void main(String[] args) {
		NavigableSet<Integer> data = new TreeSet<Integer>();
		
		data.add(1000);
		data.add(3000);
		data.add(13000);
		data.add(40000);
		data.add(54000);
		
		System.out.println("----Treeset-----");
		System.out.println(data);
		System.out.println("----------------");
		
		
		//methods
		System.out.println(data.floor(13550));
		System.out.println(data.lower(14000));
		System.out.println(data.ceiling(2500));
		System.out.println(data.higher(4000));
		System.out.println(data.pollFirst());
		System.out.println(data.pollLast());
		System.out.println(data.descendingSet());
	}

}
