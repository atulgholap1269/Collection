package com.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

class DisplayOddPositionEle {
	public static void displayOddPositionEle(ArrayList<Integer>arr)
	{
		System.out.println("Size of arraylist: "+arr.size());
		System.out.println("Odd position element : ");
		int count=0;
		Iterator<Integer> itr=arr.iterator();
		
		while(itr.hasNext())
		{
			if(count%2!=0)
			{
			System.out.print(itr.next()+" ");
			}
			else
			{
			 itr.next();
			}
			count++;
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
		displayOddPositionEle(arr);
  }
}	
