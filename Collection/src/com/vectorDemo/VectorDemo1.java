package com.vectorDemo;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo1 {
   public static void main(String[] args) {
	Vector v= new Vector(5);
	
	v.add(45);
	v.add(34);
	v.add(28);
	v.add(2,"second element");
	System.out.println(v.size());
	v.add(34);
	System.out.println(v);
	
	System.out.println("Add all vector elements to another vector");
	Vector xerox = (Vector)v.clone();
	System.out.println(xerox);
	
	System.out.println("remove all vector elements");
	v.removeAllElements();
	System.out.println(v);
	
	System.out.println("Object found for removal : "+v.removeElement(45));
	v.addAll(xerox);
	System.out.println("Object found for removal : "+v.removeElement(45));
	System.out.println(v);
	
	//to remove element at specific index;
	for(int i=0;i<v.size();i++)
	{
		if(i==3)
		{
			System.out.println("remove elements of : "+v.elementAt(i));
			v.removeElementAt(i);
		}
	}
	System.out.println(v);
	
	System.out.println("Neviagtion vector using Enumeration");
	Enumeration en= v.elements();
	while(en.hasMoreElements())
	{
		System.out.println(en.nextElement());
	}
	
	System.out.println("Neviagtion vector using iteratot");
	Iterator i = v.iterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
	
	
}
}
