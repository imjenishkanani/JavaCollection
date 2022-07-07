package com.collection.list;
import java.util.*;

public class VectorDemo {
	public static void main(String[] args) {
		int size = 5;
		
		Vector<Integer> v = new Vector<Integer>(size);
		
		for(int i=0; i<=size; i++) {
			v.add(i);
		
		}
		System.out.println(v);
		
		v.remove(3);
		System.out.println(v);
		
		for(int i=0; i<v.size(); i++) {
			System.out.println(v.get(i) + " ");
		}
	}
}	
