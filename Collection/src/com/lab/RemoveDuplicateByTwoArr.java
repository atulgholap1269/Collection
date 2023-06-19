package com.lab;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicateByTwoArr {
	public static void removeDuplicateByTwoArr(ArrayList<String> colours1,ArrayList<String> colours2 )
	{
		
	        colours1.removeAll(colours2);
	        System.out.println(colours1);
		
	}
	public static void removeDuplicateByTwoArrWithoutMethod(ArrayList<String> colours1,ArrayList<String> colours2 )
	{
		for(int i=0;i<colours1.size();i++)
		{
			int flag=0;
			String a=colours1.get(i);
			for(int j=0;j<colours2.size();j++)
			{
				
				String b=colours2.get(j);
				if(a.equals(b))
				{
					flag=1;
				}
		
			}
			if(flag==0)
			{
				System.out.println(a);
			}
		}
	
		for(int i=0;i<colours2.size();i++)
		{
			int flag=0;
			String a=colours2.get(i);
			for(int j=0;j<colours1.size();j++)
			{
				
				String b=colours1.get(j);
				if(a.equals(b))
				{
					flag=1;
				}
		
			}
			if(flag==0)
			{
				System.out.println(a);
			}
		}
	
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	ArrayList<String> colours1= new ArrayList<>();
	System.out.println("Enter array1 object");
	for(int i=0;i<4;i++)
	{
		colours1.add(sc.next());
	}
	ArrayList<String> colours2= new ArrayList<>();
	System.out.println("Enter array1 object");
	for(int i=0;i<4;i++)
	{
		colours2.add(sc.next());
	}
	removeDuplicateByTwoArrWithoutMethod(colours1,colours2 );
}
}
