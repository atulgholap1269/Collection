package com.comparatorAndComprable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Train implements Comparator<Train>
{
	int id;
	String name;
	int seat;
	public Train(int id, String name, int seat) {
		super();
		this.id = id;
		this.name = name;
		this.seat = seat;
	}
	@Override
	public String toString() {
		return "Train [id=" + id + ", name=" + name + ", seat=" + seat + "]";
	}
	@Override
	public int compare(Train o1, Train o2) {
		return o1.seat-o2.seat;
	}
	public Train()
	{
		
	}
}
public class Hw1 {
public static void main(String[] args) {
	ArrayList<Train> list = new ArrayList<>();
	list.add(new Train(1,"pune", 300));
	list.add(new Train(2,"mumbai", 400));
	list.add(new Train(3,"delhi", 250));
	
	for(Train t:list)
	{
		System.out.println(t);
	}
	System.out.println("==============================");
	Collections.sort(list, new Train());
	for(Train t:list)
	{
		System.out.println(t);
	}
	
}
}
