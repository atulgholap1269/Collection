package com.lab;

import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable<Employee>
{
	int id ;
	String name;
	int marks;
	public Employee(int id, String name, int marks) {
	
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	public int compareTo(Employee e)
	{
		if(this.marks<e.marks)
		{
			return 1;
		}
		else if(this.marks>e.marks)
		{
			return -1;
		}
		else
		{
			
			
			if (this.name.equals(e.name))
			{
				if(this.id<e.id)
				{
					return 1;
				}
				else if(this.id>e.id)
				{
					return -1;
				}
				else
				{
					return 0;
				}
			}
			else
			{
				return e.name.compareTo(this.name);
			}
		}
		
	}
}

public class ComparableDemo {
   public static void main(String[] args) {
	   ArrayList<Employee> emp = new ArrayList<>();
	   emp.add(new Employee(1,"Atul",89));
	   emp.add(new Employee(3,"vishal",79));
	   emp.add(new Employee(4,"vishal",79));
	   emp.add(new Employee(2,"Atul",59));
	   
	   System.out.println(emp);
	   System.out.println("==========================================");
	   Collections.sort(emp);
	   System.out.println(emp);
	   
	
}
}
