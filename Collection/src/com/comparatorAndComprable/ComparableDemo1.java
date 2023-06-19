package com.comparatorAndComprable;

import java.util.Collections;
import java.util.LinkedList;

class Car implements Comparable<Car>
{
	int model;
	String name;
	int price;
	public Car(int model, String name, int price) {
		super();
		this.model = model;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [model=" + model + ", name=" + name + ", price=" + price + "]";
	}
//	public int compareTo(Object o) {
//		Car c=(Car)o;
//		return 0;
//	}
	@Override
	public int compareTo(Car o)
	{
		if(this.name.equalsIgnoreCase(o.name))
		{
			return o.price-this.price;//reverse order
		}
		else
		{
			return this.name.compareTo(o.name);//ascending order
		}
	}
	
}
public class ComparableDemo1 {
	public static void main(String[] args) {
		LinkedList<Car> al= new LinkedList<>();
		al.add(new Car(1032, "Tata Nexon", 1100000));
		al.add(new Car(1807, "Mahindra Thar", 1300000));
		al.add(new Car(8632, "Scorpio", 1050000));
		al.add(new Car(8302, "Scorpio", 1150000));
		for(Car c:al)
		{
			System.out.println(c);
		}
		System.out.println("=============================");
		Collections.sort(al);
		for(Car c:al)
		{
			System.out.println(c);
		}
	}

}
