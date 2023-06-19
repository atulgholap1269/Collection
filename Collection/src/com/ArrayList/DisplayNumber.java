package com.ArrayList;

import java.util.ArrayList;

public class DisplayNumber {
	public static void displayPrime(ArrayList<Integer> arr)
	{
		System.out.print("Prime number is:");
		for(int i=0;i<arr.size();i++)
		{
			boolean check=false;
			Integer num=arr.get(i);
			for(int j=2;j<num;j++)
			{
				if(num%j==0)
				{
					check=true;
				}
			}
			if(check==false)
			{
				System.out.print(num+" ");
			}
		}
		
	}
	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<>();
		for(int i=0;i<10;i++)
		{
			arr.add(i);
		}
		displayPrime(arr);
	}

}
