package com.practise.fundamentals;

public class Switchoperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a=20;
      int b =30;
      int c =a+b;
      char operator ='+';
      switch('+') {
      case '-':
    	  System.out.println("Addition of 2 numbers" + c);
    	  System.out.println("a is not 10");
    	  break;
      case '*':
    	  System.out.println("Addition of 2 numbers" + c);
    	  System.out.println("a is 20");
    	  break;
      case '%':
      System.out.println("Addition of 2 numbers" + c);  
      System.out.println("a is not 20");
    	  break;
      case '+':
          System.out.println("Addition of 2 numbers" + c);  
          System.out.println("a is not 20");
        	  break;
    	  
    default:
    	System.out.println("Couldnt find the number");   	
              }
	}

}
