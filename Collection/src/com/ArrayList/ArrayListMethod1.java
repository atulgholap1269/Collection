package com.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListMethod1 {
	public static void main(String[] args) {
       String s[]= {"rading","dancing","music", "tracking"};
       
       //convert Array to List way1: using Arrays.asList();
       List<String> hobbies= Arrays.asList(s);
       System.out.println("list of hobbies");
       for(String sh: hobbies)
       {
    	   System.out.println(sh);
       }
       
       //convert Array to ArrayList way1: using Arrays.asList();
       ArrayList<String> hobbies1= new ArrayList<>(Arrays.asList(s));
       System.out.println("list of hobbies");
       for(String sh: hobbies)
       {
    	   System.out.println(sh);
       }
       
       //convert Array to ArrayList way2: using Collections.addALl();
       ArrayList<String> hobbies2= new ArrayList<>();
       Collections.addAll(hobbies2, s);
       System.out.println("list of hobbies");
       for(String sh: hobbies2)
       {
    	   System.out.println(sh);
       }
       Collections.addAll(hobbies2,"Swimming", "travelling");//it is faster than Arrays.sort
       System.out.println(hobbies2);
       
       //convert collection to Array way1
       Object[] newHobbies= hobbies2.toArray();
       System.out.println(newHobbies);
       
       //convert collection to Array way2
       String str[] = new String[hobbies.size()];
       hobbies.toArray(str);
       System.out.println("ArrayList converted into array");
        System.out.println(Arrays.toString(str));
        
        
}
}