package com.comparatorAndComprable;

import java.util.ArrayList;
import java.util.Collections;

class Course
{
	int cid;
	String cname;
	int fees;
	public Course(int cid, String cname, int fees) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", fees=" + fees + "]";
	}
	
}

class Stud implements Comparable<Stud>
{
      int id;
      String name;
      Course c;
      
	public Stud(int id, String name, Course c) {
		super();
		this.id = id;
		this.name = name;
		this.c = c;
	}

	@Override
	public String toString() {
		return "Stud [id=" + id + ", name=" + name + ", c=" + c + "]";
	}

	@Override
	public int compareTo(Stud o)
	{
		if(this.name.equalsIgnoreCase(o.name))
		{
			if(this.c.fees==o.c.fees)
			{
				return o.c.cname.compareTo(this.c.cname);
			}
			else
			{
				return this.c.fees-o.c.fees;
			}
		}
		else
		{
			return this.name.compareTo(o.name);
		}
		
		
	}
	
}
public class ComparableDemo2Containment {
    public static void main(String[] args) {
    	  ArrayList<Stud> list= new ArrayList<>();
    	  list.add(new Stud(300,"Atul",new Course(10,"Java",75000)));
    	  list.add(new Stud(100,"vijay",new Course(20,"Pythan",55000)));
    	  list.add(new Stud(140,"vijay",new Course(30,"Angular",55000)));
    	  
    	  for(Stud s:list)
    	  {
    		   System.out.println(s);
    	  }
    	  System.out.println("=====================");
    	  Collections.sort(list);
    	  for(Stud s:list)
    	  {
    		   System.out.println(s);
    	  }
    	  
	}
}
