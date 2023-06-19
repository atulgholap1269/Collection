package com.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayToArraylistDemo {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String []city={"pune","mumbai","nashik"};
	//way1 to add element in arraylist
	ArrayList<String> arr = new ArrayList<>(Arrays.asList(city));// add all array element to arraylist
	System.out.println(arr);
	
	//way2 to add element in arraylist
	ArrayList<String> al2= new ArrayList<>();
	Collections.addAll(al2, city);
	System.out.println(al2);
	
	//way3 to add element in arraylist
	ArrayList<String> al3 = new ArrayList<>();
	for(int i=0;i<city.length;i++)
	{
		al3.add(city[i]);
	}
	System.out.println(al3);
	
	//way4 to add element in arraylist
	System.out.println("enter size of arraylist");
	int size=sc.nextInt();
	ArrayList<Integer> al4 = new ArrayList<>();
	System.out.println("Add arraylist element");
	for(int i=0;i<size;i++)
	{
		al4.add(sc.nextInt());
	}
	System.out.println(al4);
	
	
}
}
