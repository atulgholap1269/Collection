package com.comparatorAndComprable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class Employee
{
	int id;
	String name;
	int salary;
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
class MyIdComoarator implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		//return o1.id-o2.id;//ascending order
		return o2.id-o1.id;//descending order
	}

}
class MySalComparator implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
	
		return o2.salary-o1.salary;//descending order
		//return o1.salary-o2.salary;//ascending order
	}
	
}
public class ComparatorDemo {
	public static void main(String[] args) {
		ArrayList<Employee>list= new ArrayList<>();
		list.add(new Employee(200, "Atul", 86000));
		list.add(new Employee(101, "vijay", 66000));
		list.add(new Employee(150, "abhi", 76000));
		
		for(Employee e:list)
		{
			 System.out.println(e);
		}
		System.out.println("==============================");
		Collections.sort(list, new MyIdComoarator());
		
		for(Employee e:list)
		{
			 System.out.println(e);
		}
	}

}

