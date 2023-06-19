package com.linklistDemo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Employee {
   int empId;
   String name;
   int salary;
   String departname;
public Employee(int empId, String name, int salary, String departname) {
	
	this.empId = empId;
	this.name = name;
	this.salary = salary;
	this.departname = departname;
}
@Override
public String toString() {
	return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + ", departname=" + departname + "]";
}
public static void display(LinkedList<Employee> li)
{
	Iterator<Employee> itr= li.iterator();
	while(itr.hasNext())
	{
		Employee e=itr.next();
		if(e.salary>30000)
		{
			System.out.println(e);
		}
	}
}
public static void display1(LinkedList<Employee> li, String departname)
{
	Iterator<Employee> itr= li.iterator();
	while(itr.hasNext())
	{
		Employee e=itr.next();
		if(e.departname.equals(departname))
		{
			System.out.println(e);
		}
	}
}
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	LinkedList<Employee> li= new LinkedList<>();
	for(int i=0;i<3;i++)
	{
		System.out.println("Enter employee id");
		int id = sc.nextInt();
		System.out.println("Enter employee name");
		String name= sc.next();
		System.out.println("Enter salary");
		int salary= sc.nextInt();
		System.out.println("Enetr department name");
		String depaname= sc.next();
		li.add(new Employee(id,name,salary, depaname));
	}
	System.out.println("Employee whoose salary is grater than 30000");
    display(li);
    System.out.println("Employee departname ");
    String dname= sc.next();
    display1(li, dname);
}  
}
