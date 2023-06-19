package com.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicate {
	public static void removeDuplicate(ArrayList<Integer> arr)
	{
		for(int i=0;i<arr.size();i++)
		{
			for(int j=i+1;j<arr.size();j++)
			{
				Integer temp=arr.get(i);
				Integer temp1=arr.get(j);
				if(temp==temp1)
				{
					arr.remove(j);
				}
			}
		}
	}
	public static void main(String[] args) {
		
	
	Scanner sc= new Scanner(System.in);
	ArrayList<Integer> arr=new ArrayList<>();
	System.out.println("Enter array object");
	for(int i=0;i<10;i++)
	{
		arr.add(sc.nextInt());
	}
	System.out.println("==============Print original array=====================");
	System.out.println();
	for(int i=0;i<arr.size();i++)
	{
		System.out.print(arr.get(i)+" ");
	}
	System.out.println();
	System.out.println("==============remove duplicate element=====================");
	System.out.println();
	removeDuplicate(arr);
	for(int i=0;i<arr.size();i++)
	{
		System.out.print(arr.get(i)+" ");
	}
}
}
