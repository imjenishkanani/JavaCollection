package com.collection.set;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		//TreeSet ts = new TreeSet();
		//TreeSet ts1 = new TreeSet(Comparator c); // for customized sorting order use comparator obj.
		//SortedSet s = new TreeSet();
		//TreeSet ts2 = new TreeSet(s);
		
		//HashSet hs = new HashSet();
		//TreeSet ts3 = new TreeSet(hs);

		//TreeSet<Integer> ts4 = new TreeSet<Integer>();
		
		TreeSet<String> al=new TreeSet<String>();  
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ravi");  
		  al.add("Ajay");  
		  
		  //Asscending traverse 
		  Iterator itr=al.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }
		  
		  System.out.println();
		  
		  //Decending travrse
		  Iterator itr1=al.descendingIterator();  
		  while(itr1.hasNext()){  
		   System.out.println(itr1.next());  
		  }
	}

}
