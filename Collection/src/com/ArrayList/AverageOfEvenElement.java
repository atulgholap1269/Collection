package com.ArrayList;

import java.util.ArrayList;

public class AverageOfEvenElement {
	public static float averageOfEven(ArrayList<Integer> arr)
	{
		System.out.println("Size of array: "+arr.size());
		int  sum=0;
		int count=0;
		for(int i=0;i<arr.size();i++)
		{
			if(arr.get(i)%2==0)
			{
				System.out.print(arr.get(i)+" ");
				sum+=arr.get(i);
				count++;
			}
		}
		float avg=sum/count;
		return avg;
	}
public static void main(String[] args) {
	ArrayList<Integer> arr= new ArrayList<>();
    for(int i=0;i<10; i++)
    {
    	arr.add(i);
    }
   for(int a:arr)
   {
	   System.out.print(a+" ");
   }
   System.out.println();
   System.out.println("Average of sum element : "+averageOfEven(arr));
}
}
