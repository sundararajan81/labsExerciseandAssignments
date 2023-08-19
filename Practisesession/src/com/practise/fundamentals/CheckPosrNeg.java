package com.practise.fundamentals;

import java.util.Scanner;

public class CheckPosrNeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int pnCheck = sc.nextInt();
		if(pnCheck>0)
		{
			System.out.println("Entered number..."+""+pnCheck+""+"is a Positive number");
		}
		else if(pnCheck==0)
		{
			System.out.println("Entered number..."+""+pnCheck+""+"is a Zero number");
		}
		else
		{
			System.out.println("Entered number..."+""+pnCheck+""+"is a negative number");
		}

	}

}
