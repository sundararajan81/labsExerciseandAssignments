package com.practise.fundamentals;

import java.util.Scanner;

public class PrimeNumber{


	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting number");
		int start =sc.nextInt();
		System.out.println("Enter the starting number");
		int end = sc.nextInt();
		
        for (int i = start; i <= end; i++)
        {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(i + " is a prime number");
            }
        
        }
	}
}
 
   