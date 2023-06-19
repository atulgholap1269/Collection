package com.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class IteratingHashMap {
   public static void main(String[] args) {
	HashMap<String, Float> smap= new HashMap<>();
	smap.put("sam", 89.6f);
	smap.put(null, 06f);
	smap.put("vijay", 76.6f);
	smap.put("prjwal", 64.6f);
	
	//way 1
	System.out.println(smap);
	//way 2
	System.out.println("===================================");
	System.out.println("All keys");
	Set<String> keySet = smap.keySet();
	for(String s:keySet)
	{
		System.out.println(s);
	}
	
	System.out.println("All values");
	Collection<Float> marks =smap.values();
	for(float m:marks)
	{
		System.out.println(m);
		
	}
	System.out.println("===================================");
	
	//way 3 key value pair
	for(Map.Entry<String, Float> en:smap.entrySet())
	{
		System.out.println(en.getKey()+" : "+en.getValue());
	}
	System.out.println("===================================");
	smap.put("vishal", 78.5f);
	for(Map.Entry<String, Float> en:smap.entrySet())
	{
		System.out.println(en.getKey()+" : "+en.getValue());
	}
	
	

}
}
