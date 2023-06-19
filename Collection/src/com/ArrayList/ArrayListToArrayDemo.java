package com.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListToArrayDemo {
public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 ArrayList<Character> al= new ArrayList<>();
	 System.out.println("Enter size of arralylist");
	 int size = sc.nextInt();
	 for(int i=0;i<size;i++)
	 {
		al.add(sc.next().charAt(0)) ;
	 }
	 
	 //way1 conver arraylist to array
	 Object a[]= al.toArray();// we can store arraylist element in to object type array
	
	 Character ch[]=al.toArray(new Character[al.size()]);// store arraylist element one by one to array
	  for(int i=0;i<ch.length;i++)
	  {
		  System.out.print(ch[i]+" ");
		 // System.out.println();
		  System.out.print(a[i]+" ");
	  }
	  System.out.println();
	  //way2
	  Character ch1[]=new Character[al.size()];
	  for(int i=0;i<ch1.length;i++)
	  {
		 ch1[i]=al.get(i);// store arraylist object one by one to character type array
	  }
	  for(Character cc:ch1)
	  {
		   System.out.print(cc+" ");
	  }
	  
}
}
