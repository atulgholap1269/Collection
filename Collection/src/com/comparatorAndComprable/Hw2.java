package com.comparatorAndComprable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee1 implements Comparator<Employee1>
{
	int id;
	String name;
	int salary;
	String dName;
	public Employee1(int id, String name, int salary, String dName) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dName = dName;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", dName=" + dName + "]";
	}
	public Employee1()
	{
		
	}
	@Override
	public int compare(Employee1 o1, Employee1 o2) {
	    if(o1.salary==o2.salary)
	    {
	    	if(o1.dName.equalsIgnoreCase(o2.dName))
	    	{
	    		return o1.id-o2.id;
	    	}
	    	else
	    	{
	    		return o1.dName.compareTo(o2.dName);
	    	}
	    }
	    else
	    {
	    	return o1.salary-o2.salary;
	    }
	}
	
}
public class Hw2 {
	public static void main(String[] args) {
		ArrayList<Employee1> list= new ArrayList<>();
		list.add(new Employee1 (1,"Atul",65000, "Developer"));
		list.add(new Employee1 (3,"Atul",55000, "Testing"));
		list.add(new Employee1 (4,"Atul",55000, "testing"));
		list.add(new Employee1 (2,"Atul",85000, "sales"));
		
		for(Employee1 e:list)
		{
			System.out.println(e);
		}
		System.out.println("===============================");
		Collections.sort(list, new Employee1());
		for(Employee1 e:list)
		{
			System.out.println(e);
		}
	}

}
