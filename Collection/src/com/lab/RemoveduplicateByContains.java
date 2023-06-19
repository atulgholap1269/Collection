package com.lab;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveduplicateByContains {
public static void main(String[] args) {
	 ArrayList<String> arr=new ArrayList<>();
	 arr.add("sun");
	 arr.add("mon");
	 arr.add("sun");
	 arr.add("tue");
	 arr.add("wed");
	 arr.add("mon");
	 ArrayList<String> arr1=new ArrayList<>();
	System.out.println(arr);
	 for(int i=0;i<arr.size();i++)
	 {
		 
		boolean flag=true;
		 for(int j=i+1;j<arr.size();j++)
		 {
			// String a= arr.get(i);
			 //String b= arr.get(j);
			if(arr.get(i).equals(arr.get(j)))
			{
				//arr.remove(j);
				flag = false;
				
			}
			
		 }
		 if (flag)
		 {
			 arr1.add(arr.get(i));
		 }
		
	 }
	System.out.println(arr1);

}
}
