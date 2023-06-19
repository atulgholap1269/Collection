package com.ArrayList;

import java.util.ArrayList;

public class Demo2 {
public static void main(String[] args) {
	ArrayList<String> al= new ArrayList<>();
	System.out.println(al.size());
	System.out.println(al.isEmpty());
	
	al.add("red");
	al.add("green");
	al.add(0, "blue");//if specified index is present then object goes to that index and shift other by object
	System.out.println(al);//blue green red
	al.add("black");// goes to another index
	System.out.println(al);//blue red  green black
	al.set(1, "pink");// removes previous object and place new one.
	System.out.println(al);// blue pink green black
	
	System.out.println(al.get(1));// it retrives the element from specific index
	
	al.remove(0); // remove object from index and shift another object
	System.out.println(al);// pink green black
	
	al.remove("green");// remove object by checking value
	System.out.println(al);// pink black
	
	ArrayList<String> al2= new ArrayList<>();
	al2.add("red");
	al2.add("black");
	System.out.println(al2);
	al2.addAll(al);// add al array-list to al2 array-list
	System.out.println(al);// red black pink  black
	
	al2.addAll(1,al);// add array-list after specific index
	System.out.println(al2);// red pink black black pink black
	ArrayList<String> list1= new ArrayList<>();

	System.out.println(list1.size());
}
}
