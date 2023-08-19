package com.practise.fundamentals;

public class Lab2Memberfunction 
{
	int a =10;
	float f = 2.3f;
	String s = " I love learning";
	
     void printMethod()
     {
		System.out.println(" Executing printMethod");
		System.out.println(" Integer value is...."+a);
		System.out.println(" Float value is...."+f);
		System.out.println(" String value is...."+s);	
	 	}
        
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
	Lab2Memberfunction memfun = new Lab2Memberfunction();
	memfun.printMethod();
	System.out.println(" Method executed successfully");
   }
}
