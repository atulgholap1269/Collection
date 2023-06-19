package com.lab;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Supplier {
	int sId;
	String sname;
	Item1 i;

	public Supplier(int sId, String sname, Item1 i) {
		super();
		this.sId = sId;
		this.sname = sname;
		this.i = i;
	}

	@Override
	public String toString() {
		return "Supplier [sId=" + sId + ", sname=" + sname + ", i=" + i + "]";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Supplier> arr = new ArrayList<>();

		for (int i = 0; i < 2; i++) {
			System.out.println("enter supplier id");
			int id = sc.nextInt();
			System.out.println("Enter supplier name");
			String name = sc.next();
			System.out.println("enter item id");
			int itemId = sc.nextInt();
			System.out.println("Enter item name");
			String iname = sc.next();
			System.out.println("enter item price");
			int price = sc.nextInt();

			Item1 it = new Item1();
			
			  it.setId(itemId); 
			  it.setItem_name(iname);
			  it.setiPrice(price);
			  
			 
			Supplier obj = new Supplier(id, name, it);
			arr.add(obj);
		}
		System.out.println("supplier name whoose item price more than 100");
		Iterator<Supplier>itr= arr.iterator();
		while(itr.hasNext())
		{
			Supplier s=itr.next();
			if(s.i.getiPrice()>100)
			{
				System.out.println(s.sname);
			}
		}
	}
}
