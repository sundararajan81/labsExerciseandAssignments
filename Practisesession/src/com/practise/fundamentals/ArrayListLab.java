package com.practise.fundamentals;

import java.util.ArrayList;

public class ArrayListLab 
{
	public static void main(String args[]) {
		
		  ArrayList<String> list=new ArrayList<String>();
	      list.add("Sundar");   
	      list.add("1234");    
	      list.add("Geetha");    
	      list.add("Java");    
	   
	      System.out.println(list);  
	      if(list.contains("4567"))
	    		{
	    	  System.out.println("String 1234 is found in the list");
	      }
	      else
	      {
	    	  System.out.println("String is not in the list");
	      }
	 
	}  
}
