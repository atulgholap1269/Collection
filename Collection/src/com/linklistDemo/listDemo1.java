package com.linklistDemo;

import java.util.*;



public class listDemo1 {
	int id;
	String name;
	int marks;
	
public listDemo1(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

@Override
public String toString() {
	return "listDemo1 [id=" + id + ", name=" + name + ", marks=" + marks + "]";
}

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	ArrayList<listDemo1> li= new ArrayList<>();
	
	for(int i=0;i<3;i++)
	{
		System.out.println("Enter the id");
		int id=sc.nextInt();
		System.out.println("Enter the name");
		String name= sc.next();
		System.out.println("Enter marks");
		int marks=sc.nextInt();
	    li.add(new listDemo1(id, name, marks));
	}
	/*
	 * for(listDemo1 s: li) { System.out.println(s); }
	 */
	Iterator<listDemo1> itr= li.iterator();
	while(itr.hasNext())
	{
		listDemo1 s=itr.next();
		if(s.marks>60)
		{
			System.out.println(s);
		}
	}
}
}
