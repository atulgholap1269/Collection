package com.lab;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class Items {
	private int id;
	private String name;
	private float prize;

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrize() {
		return prize;
	}

	public void setPrize(float prize) {
		this.prize = prize;
	}

	public Items(int id, String name, float prize) {
		super();
		this.id = id;
		this.name = name;
		this.prize = prize;
	}

	@Override
	public String toString() {
		return "Items [id=" + id + ", name=" + name + ", prize=" + prize + "]";
	}
	public static void displayByPrize(ArrayList<Items> arr)
	{
		for(int i=0;i<arr.size();i++)
		{
			for(int j=i+1;j<arr.size();j++)
			{
				if(arr.get(i).prize==arr.get(j).prize)
				{
					System.out.println(arr.get(i));
					System.out.println(arr.get(j));
				}
			}
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		ArrayList<Items> arr= new ArrayList<>();
		arr.add(new Items(1,"book",30));
		arr.add(new Items(2,"pen",10));
		arr.add(new Items(3,"pencil",10));
		
		displayByPrize(arr);
	}

}
