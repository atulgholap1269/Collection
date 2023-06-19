package com.customException;

import java.util.HashMap;
import java.util.Map;

public class EmployeeHaspmap2 {
public static void main(String[] args) {
	HashMap<Employee, String>emap=new HashMap<>();
	  
	  emap.put( new Employee(101,"Atul",80000), "Technical");
	  emap.put( new Employee(102,"Vishal",90000),"HR");
	  emap.put( new Employee(103,"Amey",60000),"Sales");
	  emap.put(new Employee(104,"Rishi",55000),"sales");
	  
	  for(Map.Entry<Employee,String>en:emap.entrySet())
	  {
		   System.out.println(en.getKey());
		   System.out.println(en.getValue());
	  }
	  System.out.println();
	  System.out.println();
	  emap.put(new Employee(104,"Rishi",55000),"Technical");
	  for(Map.Entry<Employee,String>en:emap.entrySet())
	  {
		   System.out.println(en.getKey());
		   System.out.println(en.getValue());
	  }
}
}
