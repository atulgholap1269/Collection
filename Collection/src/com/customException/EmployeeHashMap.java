package com.customException;

import java.util.HashMap;
import java.util.Map;

public class EmployeeHashMap {
public static void main(String[] args) {
	
  HashMap<Integer, Employee>emap=new HashMap<>();
  
  emap.put(101, new Employee(101,"Atul",80000));
  emap.put(102, new Employee(102,"Vishal",90000));
  emap.put(103, new Employee(103,"Amey",60000));
  emap.put(104, new Employee(104,"Rishi",55000));
  
  for(Map.Entry<Integer, Employee> e:emap.entrySet())
  {
	  System.out.println(e.getKey());
	  System.out.println(e.getValue());
  }
  System.out.println("====================================");
  emap.put(102, new Employee(102,"Vijay",80000));
  
  for(Map.Entry<Integer, Employee> e:emap.entrySet())
  {
	  System.out.println(e.getKey());
	  System.out.println(e.getValue());
  }
}
}
