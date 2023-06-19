package com.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethod {
public static void main(String[] args) {
	 ArrayList<String> list= new ArrayList<>();
	 list.add("Vijay");
	 list.add("Atul");
	 System.out.println(list);
	 
	 ArrayList<String> list1= new ArrayList<>();
	 list1.add("Atul");
	 list1.add("Rishi");
	 
	 //addAll
	 list1.addAll(list);
	 System.out.println(list1);// add all element from list1 in list after previous elements 
	 
	 //adding object to specific index
	 list1.add(2, "Abhi");
	 System.out.println(list1);
	 
	 // adding collection to specific index
	 list1.addAll(1, list);
	 System.out.println(list1);
	 
	 //sublist(startindex, endindex)
	 List<String> l = list1.subList(1, 3);
	 System.out.println(l);
	 
	 //remove first occurance of object
	 if(list1.contains("Abhi"))
	 {
		 boolean result =list1.remove("Vijay");
		 System.out.println(result);
	 }
     System.out.println(list1);
     
     // remove all occurance of object
     String str=null;
//     for(String s:list1)// we cannot do any modification with enhanced for loop
//     {                  // it will throw ConcurrentModificationException
//    	 if(s.equals("Atul"))
//    		str=list. remove(list1.indexOf(s));
//     }
     for(int i=0;i<list1.size();i++)
     {
    	 if(list1.get(i).equals("Atul"))
    	 {
    		// list1.remove(list1.indexOf("Atul"));
    		 list1.remove(i);
    		 i--;
    	 }
     }
     System.out.println("After removing all occurance of Atul "+list1);
      
     //retainAll
     ArrayList<String> l1= new ArrayList<>();
     l1.add("Tushar");
     l1.add("Abhi");
     list1.retainAll(l1);// remove all the elements from list1 which are not in l1
     System.out.println("After retaining only l1 elements in list1 are :");
     System.out.println(list1);
     System.out.println(l1);
     
}
}
