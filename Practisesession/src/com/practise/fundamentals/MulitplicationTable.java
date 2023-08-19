package com.practise.fundamentals;

import java.util.Scanner;

public class MulitplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Multiplication table");
		int mulTable = sc.nextInt();
		for(int i =0;i<=10;i++) {
			int j =i *mulTable;
			
			System.out.println(mulTable+"*"+i+"="+j);
		}
		

	}

}
