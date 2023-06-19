package com.lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class Weekdays {
	public static void main(String[] args) {
		ArrayList<String> weekdays= new ArrayList<>();
		weekdays.add("monday");
		weekdays.add("tuesday");
		weekdays.add("wedensday");
		weekdays.add("thursd");
		weekdays.add("friday");
		weekdays.add("saturday");
		weekdays.add("sunday");
//		for(int i=0;i<weekdays.size();i++)
//		{
//			String s=weekdays.get(i);
//			if(s.length()>7)
//			{
//				weekdays.remove(i);
//				i--;
//			}
//			
//		}
		Iterator<String>itr=weekdays.iterator();
		while(itr.hasNext())
		{
			String s=itr.next();
			if(s.length()>=7)
			{
				itr.remove();
				
			}
			//System.out.println(s);
		}
		System.out.println(weekdays);
		Collections.sort(weekdays);
		Collections.reverse(weekdays);
		System.out.println(weekdays);
	}
}
