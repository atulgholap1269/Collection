package com.lab;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class RemoveDuplicate {
	public static void removeDupli(ArrayList<String> colours)
	{
		for(int i=0;i<colours.size();i++)
		{
			for(int j=i+1;j<colours.size();j++)
			{
				String a=colours.get(i);
				String b=colours.get(j);
				if(a.equals(b))
				{
					colours.remove(j);
					colours.remove(i);
				}
				
			}
		}
	}

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	ArrayList<String> colours= new ArrayList<>();
	System.out.println("Enter array object");
	for(int i=0;i<4;i++)
	{
		colours.add(sc.next());
	}
	removeDupli(colours);
	System.out.println("remove duplicate element");
	
	/*
	 * for(int i=0;i<colours.size();i++) { System.out.println(colours.get(i)); }
	 */
	Iterator<String>itr=colours.iterator();
	while(itr.hasNext())
	{
		
		System.out.println(itr.next());
	}
 }
}
