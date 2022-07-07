package com.collection.set;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet hs = new HashSet(); // default size : 16
		HashSet hs = new HashSet(100); // load fector 75%
		HashSet hs = new HashSet(100, .80f); // set custom load fector 80%
		ArrayList l = new ArrayList();
		HashSet hs4 = new HashSet(l);
	}

}
