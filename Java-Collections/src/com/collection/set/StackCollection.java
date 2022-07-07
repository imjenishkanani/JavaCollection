package com.collection.set;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class StackCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q1 = new LinkedList();
		
		for(int i=0; i<5; i++) {
			q1.add(i);
		}
		System.out.println(q1);
		
		//size method
		System.out.println("size : " + q1.size());
		
		//remove method
		int removeItem = q1.remove();
		System.out.println("removable item is : " + removeItem);
		
		//iterating queue.
		Iterator i1 = q1.iterator();
		
		while(i1.hasNext()) {
			System.out.println(i1.next() + " ");
		}
		
	}

}
