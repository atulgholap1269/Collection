package com.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class DemoIteratingListUsingIterator {
     public static void main(String[] args) {
		ArrayList<String> custlist= new ArrayList<>();
		custlist.add("Atul Gholap");
		custlist.add("Manoj Tiwari");
		custlist.add("kshitij Mandale");
		custlist.add("Kishor Tandale");
		custlist.add("Rishikesh Jadhav");
		
		//Iterating list using Iterator
//		Iterator<String> itr= cuslist.iterator();
//		while(itr.hasNext())
//		{
//			String name=itr.next();
//			System.out.println(name); 
//		}
		
		//removing underlying collection object while iterating
		System.out.println("Using Iterator");
		Iterator<String> itr = custlist.iterator();
		while(itr.hasNext())
			{
				String name=itr.next();
				if(name.equals("Kishor Tandale"))
				{
					itr.remove();
					System.out.println("Object removed");
				}
			}
		System.out.println(custlist);
		
		//Iterating list using ListIterator
		System.out.println("Using ListIterator");
		ListIterator<String> litr;
		for(litr=custlist.listIterator(); litr.hasNext(); )
		{
			String name=litr.next();
			if(name.equals("Manoj Tiwari"))
				litr.add("Pankaj Tripathi");
			    System.out.println(name);
		}
		System.out.println(custlist);
		//Iterating list in reverse using ListIterator
		System.out.println("list in reverse using ListIterator : ");
		ListIterator<String> litr1=custlist.listIterator(custlist.size());
		while(litr1.hasPrevious())
		{
			String name1= litr1.previous();
			System.out.println(name1);
		}
		
	}
}
