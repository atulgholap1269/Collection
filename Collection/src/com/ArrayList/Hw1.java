package com.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Depart
{
	int id;
	String name;
	public Depart(int id, String name) {
		
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "id=" + id + ", name=" + name ;
	}
	
}

class Emp 
{
	int eid;
	String ename;
	Depart d;
	public Emp(int eid, String ename, Depart d) {
	
		this.eid = eid;
		this.ename = ename;
		this.d = d;
	}
	@Override
	public String toString() {
		return "eid=" + eid + ", ename=" + ename + ", d=" + d ;
	}
	
}
public class Hw1 {
	
	public static void removeEmp(ArrayList<Emp>list)
	{
//		Iterator<Emp>itr=list.iterator();
//		while(itr.hasNext())
//		{
//			Emp e=itr.next();
//			if(e.d.id==e.eid)
//			{
//				list.remove(e);
//			}
//		}
		for(int i=0;i<list.size();i++)
		{
			Emp a=list.get(i);
			if(a.d.id==a.eid)
			{
				list.remove(a);
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		ArrayList<Emp>list = new ArrayList<>();
//		for(int i=0;i<4;i++)
//		{
//			System.out.println("Enter employee id");
//			int eid=sc.nextInt();
//			System.out.println("Enter employee name");
//			String ename=sc.next();
//			System.out.println("Enter deparment id");
//			int id=sc.nextInt();
//			System.out.println("Enter department name");
//			String name=sc.next();
//			list.add(new Emp(eid, ename, new Depart(id,name)));
//		}
		list.add(new Emp(1, "Atul", new Depart(1,"Sales")));
		list.add(new Emp(5, "Vishal", new Depart(3,"Sales")));
		list.add(new Emp(4, "Vijay", new Depart(4,"Marketing")));
		list.add(new Emp(1, "Abhi", new Depart(3,"Sales")));
		for(Emp e:list)
		{
			System.out.println(e);
		}
		System.out.println("===================================");
		removeEmp(list);
		for(Emp e:list)
		{
			System.out.println(e);
		}
	}

}
