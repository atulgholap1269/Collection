package com.mapLabSession;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Student {
   int id;
   String name;
   int per;
public Student(int id, String name, int per) {
	super();
	this.id = id;
	this.name = name;
	this.per = per;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", per=" + per + "]";
}
   
   public static void main(String[] args) {
	   String s="";
	HashMap<String, String> map= new HashMap<>();
	ArrayList<Student> list= new ArrayList<>();
	list.add(new Student(1,"Atul",56));
	list.add(new Student(2,"Vishal",66));
	list.add(new Student(3,"Vijay",46));
	list.add(new Student(4,"Amey",76));
	list.add(new Student(5,"Abhi",86));
	
	Iterator<Student> itr= list.iterator();
	while(itr.hasNext())
	{
		Student st=itr.next();
		int perc=st.per;
		if(perc>50)
		{
			s="pass";
			map.put(st.name,s);
		}
		else
		{
			s="fail";
			map.put(st.name,s);
		}
	}
	System.out.println(map);
}
}
