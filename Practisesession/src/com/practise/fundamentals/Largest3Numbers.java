package com.practise.fundamentals;

import java.util.Scanner;

public class Largest3Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int a = sc.nextInt();
		System.out.println("Enter the second number");
		int b =sc.nextInt();
		System.out.println("Enter the Third number");
		int c =sc.nextInt();
		if(a>=b && a>=c )
		{	
			System.out.println("a is greater than b and c........ " + a);
		}
		else if (b>=a && b>=c)
		{
			System.out.println("b is greater than a and c......... " + b);
		}
		else
		{
			System.out.println("c is greater than a and b");
		}
		System.out.println(" Executed successfully");
		
	}

}
