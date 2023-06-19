package com.ArrayList;

import java.util.*;

public class Demo1 {
public static void main(String[] args) {
	//non-generic:we can add any datatype in array.
//	ArrayList list = new ArrayList();//
//	list.add("pune");
//	list.add(45);
//	list.add('p');
//	list.add(89.5);
//	System.out.println(list);
	
	//generic:we can add specific datatype in array
	ArrayList<String> al=new ArrayList<>();//
	al.add("Pune");
	al.add("Mumbai");
	al.add("Goa");
	al.add("Nashik");
	al.add(null);// we can give null object to index of arraylist
	
	System.out.println(al);
	System.out.println("============================");
//	for(int i=0;i<al.size();i++)//retrive data with the help forloop
//	{
//		System.out.println(al.get(i));
//	}
	System.out.println("============================");
//	for(String s:al)//retrive data with the help of enhance for each loop
//	{
//		System.out.println(s);
//	}
	System.out.println("==============================");
	
//	Iterator<String> itr=al.iterator();//  iterator is method of iterable interface which is implemented in ArrayList
//	                                   //retrive element with the help of iterator
//	while(itr.hasNext())//used as cursor start from previous of first two element
//	{
//		System.out.println(itr.next());
//	}
	
	ListIterator<String>ltr = al.listIterator(al.size());
//	while(ltr.hasNext())
//	{
//		ltr.next();
//	}
	while(ltr.hasPrevious())
	{
		System.out.println(ltr.previous());
	}
	
}
}
