package com.linklistDemo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Demo1 {
   public static void main(String[] args) {
	LinkedList<String> ls= new LinkedList<>();
	ls.add("java");
	ls.add("c++");
	ls.add("python");
	ls.add("c");
	System.out.println(ls);
	ls.addFirst("Angualr");
	ls.addLast("last Element");
	ls.add(2, "firstlast");
	System.out.println(ls); 
	ls.removeFirst();
	ls.removeLast();
	System.out.println(ls);
	
	//to get first element from linkedlist
	String firstElement = ls.element();//get first element
	System.out.println("First Element : "+firstElement);//get first element
	System.out.println("First Element :"+ls.getFirst());
	System.out.println("Last Element :"+ls.getLast());
	System.out.println("First element with get(0) : "+ls.get(0));
	System.out.println("First element with get(3) : "+ls.get(3));
	
	System.out.println("add collection in collection");
	//way1
	LinkedList<String> ls1= new LinkedList<>();
	//System.out.println(ls1);
	//way2
	ls1.addAll(ls);
	System.out.println(ls1);
	
	System.out.println("=========Iteration using iterator: ============");
	Iterator<String>itr= ls.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
	System.out.println("=========Iteration using desecndingIterator: ============");
	itr=ls.descendingIterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
	System.out.println("=========Iteration using ListIterator: ============");
	ListIterator litr= ls.listIterator();
	while(litr.hasNext())
	{
		System.out.println(litr.next());
	}
	
	System.out.println("=========ReverseIteration using iterator: ============");
	litr=ls.listIterator(ls.size());
	while(litr.hasPrevious())
	{
		System.out.println(litr.previous());
	}
	

	 
}
}
