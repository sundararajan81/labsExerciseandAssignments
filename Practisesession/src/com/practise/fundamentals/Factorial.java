package com.practise.fundamentals;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner sc = new Scanner(System.in);

	    System.out.println("Enter input number : ");
        int input = sc.nextInt();
        int fact = 1;
        do {
            fact = fact * input;
            input--;
        }while(input>1);
        System.out.println("Factorial of number : "+ fact);
		
		/*int i;
		int fact=1;
		int number = 23;
		for(i=1;i<=number;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial of"+number+" " + fact);*/
		
    }
		
		
	}

