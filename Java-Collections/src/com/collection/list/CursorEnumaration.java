package com.collection.list;
import java.util.*;
import java.util.Enumeration;
import java.util.Vector;

public class CursorEnumaration {

	public static void main(String[] args) {
		
		Vector v = new Vector();
		System.out.println("Enter the elements");
		
		for(int i=0; i<8; i++) {
			Scanner sc = new Scanner(System.in);
			
			int data = sc.nextInt();
			v.addElement(data);
		}
		System.out.println("vector is : " + v);
		
		Enumeration e = v.elements();
		
		while(e.hasMoreElements()) {
			int element =(Integer)e.nextElement();
			
			if(element % 3 == 0)
			{
				System.out.println(element);
			}
		}
		

	}

}
