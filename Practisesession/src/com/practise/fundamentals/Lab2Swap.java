package com.practise.fundamentals;

import java.util.Scanner;

public class Lab2Swap 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		/*Scanner sc = new Scanner(System.in);
		sc.nextInt();*/
		
		//int num1 = sc.nextInt();
		//int num2 = sc.nextInt();
		
		//System.out.println(num1);
		//System.out.println(num2);
		int num1 = 12;
		int num2=14;
		int temp;
		
		temp = num1; // num1 will be assigned to temp
		num1 =num2;
		num2 = temp;
		
		System.out.println("Value of temp variable is " + temp);
		System.out.println(" Value of num1 after swap"+num1);
		System.out.println(" Value of num2 after swap"+num2);
		
		System.out.println(" Method executed successfully");
		
	}

}
