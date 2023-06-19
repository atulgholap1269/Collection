package com.ArrayList;

import java.util.ArrayList;

public class Demo3 {
	public static void main(String[] args) {
		ArrayList<String>al= new ArrayList<>();
		al.add("red");
		al.add("green");
		al.add("black");
		al.add("red");
		System.out.println(al);
		
		ArrayList<String>al2= new ArrayList<>();
		al2.add("black");
		//al.removeAll(al2);// remove all element from al which is in al2
		System.out.println(al);
		System.out.println(al2);
		
		al.retainAll(al2);// remove all uncommon element from al which is not contain in al2
		System.out.println(al);
		al2.addAll(al);// append all the element from other collection at the end of list
		System.out.println(al2);
		al2.add("red");
		System.out.println(al2);
		al2.retainAll(al);//remove all uncommon element from al which is not contain in al2
		System.out.println(al2);
	}

}
