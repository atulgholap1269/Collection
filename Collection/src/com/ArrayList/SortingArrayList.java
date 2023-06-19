package com.ArrayList;

import java.util.ArrayList;

public class SortingArrayList {
	public static ArrayList<Integer> display(ArrayList<Integer> arr)
	{
		System.out.println("size of an array: "+arr.size());
		for(int i=0;i<arr.size();i++)
		{
			for(int j=i+1;j<arr.size();j++)
			{
				Integer temp=arr.get(i);
				Integer temp1=arr.get(j);
				if(temp<temp1)
				{
				  arr.set(i, temp1);
				  arr.set(j, temp);
				   
				}
			}
		}
		//System.out.println(arr);
		return arr;
	}
	public static void main(String[] args) {
		ArrayList<Integer> arr= new ArrayList<>();
		for(int i=0;i<10;i++)
		{
			arr.add(i);
		}
		System.out.println(arr);
		System.out.println(display(arr));
	}

}
