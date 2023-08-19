package com.practise.fundamentals;

import java.util.Scanner;

public class Lab1Unary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(" Please input Integers");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		System.out.println("Enter the input" +input);
		
		int output = -(input+5);
		
		System.out.println("Results of Unary operation"+output);

	}

}
