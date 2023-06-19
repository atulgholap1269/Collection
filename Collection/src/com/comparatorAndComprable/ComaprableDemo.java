package com.comparatorAndComprable;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>
{
	int id;
	String name;
	int marks;
	public Student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	@Override
	public int compareTo(Student o) {
//		if(this.id > o.id)//ascending order as per id
//		{
//			return 1;
//		}
//		else if(this.id < o.id)
//		{
//			return -1;
//		}
//		else
//		{
//			return 0;
//		}
		//return this.name.compareTo(o.name);// ascending order
		return o.name.compareTo(this.name);//Descending order
	}
	
}
public class ComaprableDemo {
	public static void main(String[] args) {
	ArrayList<Integer> al= new ArrayList<>();
    al.add(12);
    al.add(67);
    al.add(89);
    al.add(23);
    al.add(64);
	
   ArrayList<Student>list= new ArrayList<>();
   list.add(new Student(1,"atul", 67));
   list.add(new Student(3,"vijay", 56));
   list.add(new Student(2,"vishal", 78));
   
   for(Student s: list)
   {
	   System.out.println(s);
   }
   System.out.println("==============================");
   Collections.sort(list);
   
   for(Student s:list)
   {
	   System.out.println(s);
   }
   
   
   
   
	}  
}
