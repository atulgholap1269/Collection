package com.map;

import java.util.HashMap;
import java.util.Set;

public class DemoMap2 {
public static void main(String[] args) {
	HashMap<Character, String> map = new HashMap<>();
	map.put('a', "apple");
	map.put('b', "Ball");
	map.put('c', "Cat");
	map.put('d', "Dog");
	map.put('e', "elephant");
	map.put('f', "frog");
	System.out.println(map);
	
	System.out.println("return value of a key : "+map.get('a'));
	System.out.println(map.values());
	System.out.println(map.put('b', "Bat"));// if key is present then return same previous value and if key not present return null
	map.put(null,"NA");
	System.out.println(map);
	map.put(null, "Notebook");
	System.out.println(map);
	System.out.println("Get all keys present in map: ");
	Set<Character> sc=map.keySet();
	for(Character c:sc)
	{
		System.out.println(c);
	}
	
	System.out.println("get all values present in map");
	
	
}
}
