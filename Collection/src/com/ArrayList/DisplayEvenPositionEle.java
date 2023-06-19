package com.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class DisplayEvenPositionEle {
	public static void displayEvenPositionEle(ArrayList<Integer>arr)
	{
		System.out.println("Size of arraylist: "+arr.size());
		System.out.println("Even position element : ");
		for(int i=0;i<arr.size();i++)
		{
			if(i%2==0)
			{
				System.out.print(arr.get(i)+" ");
			}
		}
	}
public static void main(String[] args) {
	ArrayList<Integer>arr =new ArrayList<>();
	for(int i=0;i<20;i++)
	{
		arr.add(i);
	}
	Iterator<Integer> itr=arr.iterator();
	while(itr.hasNext())
	{
		System.out.print(itr.next()+" ");
	}
	System.out.println("==========================");
	displayEvenPositionEle(arr);
	
}
}
