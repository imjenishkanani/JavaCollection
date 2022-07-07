package com.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapEnviorment extends Thread {
	
	static HashMap<Integer,String> map = new HashMap<Integer,String>();
	
	public static void main(String[] args) {
		ConcurrentHashMapEnviorment tChild = new ConcurrentHashMapEnviorment();
		map.put(1,"John");
		map.put(2,"Rohn");
		map.put(3,"Tom");
		map.put(4,"Shiva");
		tChild.start();
		
		Iterator<Entry<Integer, String>> itr = map.entrySet().iterator();
		
		while(itr.hasNext()) {
			Entry<Integer, String> entry = itr.next();
			System.out.println("Key = "+entry.getKey()+" Value = "+entry.getValue());
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}	
	}
	
	public void run() {
		try {
			Thread.sleep(100);
		} catch (Exception e) {
			e.printStackTrace();
		}
		map.put(5,"Ganesha");
		
	}
}
