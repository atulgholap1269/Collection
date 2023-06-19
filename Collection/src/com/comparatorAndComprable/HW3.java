package com.comparatorAndComprable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Departmen
{
	int did;
	String dname;
	String location;
	public Departmen(int did, String dname, String location) {
		super();
		this.did = did;
		this.dname = dname;
		this.location = location;
	}
	@Override
	public String toString() {
		return "Departmen [did=" + did + ", dname=" + dname + ", location=" + location + "]";
	}
	
}
class Emp
{
	int id; 
	String name;
	int salary;
	Departmen o;
	public Emp(int id, String name, int salary, Departmen o) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.o = o;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", salary=" + salary + ", o=" + o + "]";
	}
	
}
class MySalComparator1 implements Comparator<Emp>
{

	@Override
	public int compare(Emp o1, Emp o2) {
		if(o1.salary==o2.salary)
		{
			if(o1.o.location.equalsIgnoreCase(o2.o.location))
			{
               if(o1.o.dname.equalsIgnoreCase(o2.o.dname))
               {
            	   return o1.id-o2.id;
               }
               else
               {
            	   return o1.o.dname.compareTo(o2.o.dname);
               }
			}
			else
			{
				return o1.o.location.compareTo(o2.o.location);
			}
		}
		else
		{
			return o1.salary-o2.salary;
		}
	}

	
	
}
public class HW3 {
	public static void main(String[] args) {
		ArrayList<Emp> list = new ArrayList<>();
		list.add(new Emp(4,"Atul",66000, new Departmen(12, "Testing", "Mumbai")));
		list.add(new Emp(2,"vijay",56000, new Departmen(12, "Developer", "Pune")));
		list.add(new Emp(1,"Atul",56000, new Departmen(11, "Developer", "Gujrat")));
		list.add(new Emp(3,"Atul",76000, new Departmen(14, "Marketing", "Pune")));
		
		for(Emp e:list)
		{
			 System.out.println(e);
		}
		System.out.println("===================================");
		Collections.sort(list, new MySalComparator1());
		for(Emp e:list)
		{
			 System.out.println(e);
		}
	}

}
