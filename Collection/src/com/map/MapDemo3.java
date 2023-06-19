package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapDemo3 {
public static void main(String[] args) {
	HashMap<Integer, String> map= new HashMap<>();
	
	HashMap<Integer, String> map1= new HashMap<>(12, 0.8f); // we can give initial bucket capacity and load factor
	
	//iterator
	Set<Integer> keys= map.keySet();
	Iterator<Integer> itr= keys.iterator();
    while(itr.hasNext())
    {
    	Integer k=itr.next();
    	System.out.println(k+" : "+map.get(k));
    }

}
}
