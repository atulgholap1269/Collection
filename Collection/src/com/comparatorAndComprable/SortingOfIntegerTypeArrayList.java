package com.comparatorAndComprable;

import java.util.ArrayList;
import java.util.Collections;

public class SortingOfIntegerTypeArrayList {
    public static void main(String[] args) {
	ArrayList<Integer>list = new ArrayList<>();
	list.add(23);
	list.add(45);
	list.add(234);
	list.add(67);
	list.add(678);
	System.out.println(list);
	
	//To sort ArrayList in reverse order way1:
	Collections.sort(list);
	System.out.println("List Sorted in ascending "+list);
	
	//To sort ArrayList in reverse order way2:
	Collections.sort(list, Collections.reverseOrder());
	System.out.println("List Sorted in descending "+list);
	
	//To sort ArrayList in reverse order way3:
	Collections.sort(list);
	Collections.reverse(list);
	System.out.println("List Sorted in descending "+list);
	
	//To sort ArrayList in reverse order way
	 
	
}
}
