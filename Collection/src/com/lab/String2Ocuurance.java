package com.lab;

import java.util.ArrayList;
import java.util.Scanner;

public class String2Ocuurance {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String s="Java programming";
	//way1
	System.out.println(s.indexOf('a', (s.indexOf('a'))+1));
	//way2
	char ch[] = s.toCharArray();
	int count=0;
	int i;
	for( i=0;i<ch.length;i++)
	{
		if(ch[i]=='a')
		{
		count++;	
		}
		if(count==2)
		{
			break;
		}
	}
	System.out.println(i);
	
	
}
}
