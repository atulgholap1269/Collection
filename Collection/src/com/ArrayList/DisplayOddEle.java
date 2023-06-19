package com.ArrayList;

import java.util.ArrayList;

public class DisplayOddEle {
	public static void displayOdd(ArrayList<Integer> arr)
	{
		System.out.println("Size of array: "+arr.size());
		for(int i=0;i<arr.size();i++)
		{
			int num=arr.get(i);
			//System.out.println(num);
			if((num%2)!=0)
			{
				System.out.print(arr.get(i)+" ");
			}
		}
	}
			
	public static void main(String[] args) {
		ArrayList<Integer> arr= new ArrayList<>();
	    for(int i=0;i<10; i++)
	    {
	    	arr.add(i);
	    }
	    for(int i=0;i<10; i++)
	    {
	    	System.out.print(arr.get(i)+" ");
	    	
	    }
	    System.out.println();
	    displayOdd(arr) ;
		
	}

}
