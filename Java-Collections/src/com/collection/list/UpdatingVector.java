package com.collection.list;
import java.util.*;

public class UpdatingVector {
	public static void main(String args[])
    {
     
        Vector<Integer> vec = new Vector<Integer>();
 
        // adding
        vec.add(12);
        vec.add(23);
        vec.add(22);
        vec.add(10);
        vec.add(20);
 
        
        System.out.println("Vector: " + vec);
 
        // updating
        System.out.println("The Object that is replaced is: "
                        + vec.set(0, 21));

        System.out.println("The Object that is replaced is: "
                        + vec.set(4, 50));
 
     
        System.out.println("The new Vector is:" + vec);
    }
}
