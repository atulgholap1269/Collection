package com.map;

import java.util.HashMap;

public class DemoMap {
	public static void main(String[] args) {
		
	
	HashMap<Integer, String> map = new HashMap<>();
	map.put(1,"Amey");
	map.put(2, "Vijay");
	
    System.out.println(map.put(1, "Suraj"));// if key is already present return previous value 
    System.out.println(map.put(5, "Atul"));//return null if key is not present and put this key-value to map 
	System.out.println(map);
	
	map.put(null, "NA");
	
	map.put(null, "Suraj");
	System.out.println(map);
	
	System.out.println("Value :"+map.get(2));// get value for given key
	System.out.println("checks 1 "+map.containsKey(1));//check key are present or not
	System.out.println("Check value : "+map.containsValue("Vijay"));//case sensitive: checks value is present or not
	
	map.putIfAbsent(2, "Amey");// add if key is not prsent
	System.out.println(map.putIfAbsent(2, "Amey"));// return previous value of key which in map
	System.out.println(map);
	System.out.println(map.putIfAbsent(4, "Vishal"));// return null if key is not present and put this key-value to map 
	System.out.println(map);
	System.out.println(map.replace(5, "Aksay")); 
	System.out.println(map);
	
	
	
	
	
	
	}
}
