package com.collection.list;
import java.util.*;

public class StackExample {
	public static void main(String[] args) {
		Stack s1 = new Stack();
		
		s1.push(43);
		s1.push(55);
		s1.push("om");
		System.out.println(s1);
		
		Object o = s1.pop();
		System.out.println(s1);
		
		// top of stack
		System.out.println(s1.peek());
		// check stack is empty or not
		System.out.println(s1.empty()); // output is in boolean
		// searching in stack
		System.out.println(s1.search(43)); // return position of ele from top of stack is it exists.
		
	}
}
