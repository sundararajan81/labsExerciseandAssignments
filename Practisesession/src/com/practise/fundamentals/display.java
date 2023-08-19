package com.practise.fundamentals;

public class display {
 static int a=5;
 static int b =4;
 static int c = a+b;
 static int d =a/b;
 static int e = a%b;
 static int f = b/a;
 static int g =b%a;
 static void display() {
	 try {
		System.out.println("Value of c is"+"  "+c);
		System.out.println("Value of d is"+" "+d);
		System.out.println("Value of e is"+" "+e);
		System.out.println("Value of f is"+" "+f);
		System.out.println("Value of g is"+" "+g);
		//System.out.println("Value of c is"+""+c);
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println(e);
	}
 }

 public static void main(String args[]){
	 System.out.println("Program to show display");
	 display();
	 
 }
}

