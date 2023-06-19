package com.linklistDemo;

import java.util.Collections;
import java.util.LinkedList;

public class SortingOfLinkedList {
   public static void main(String[] args) {
	LinkedList<String> namelist = new LinkedList<>();
	System.out.println();
	namelist.add("Atul");
	namelist.add("Vijay");
	namelist.add("Abhi");
	namelist.add("Vishal");
	System.out.println(namelist);
	
	//way1
	Collections.sort(namelist);
	System.out.println("List Sorted in ascending "+namelist);
	
	//way1:To sort linkedList in reverse order
	Collections.sort(namelist, Collections.reverseOrder());
	System.out.println("List Sorted in descending "+namelist);
	
	//way1:To sort linkedList in reverse order
	Collections.sort(namelist);
	Collections.reverse(namelist);
	System.out.println("List Sorted in descending "+namelist);
	
}
}
