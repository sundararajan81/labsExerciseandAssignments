package com.practise.fundamentals;

public class BankInterest 
{

	 public static void main(String[] args)
     {
          if ((isItSmall(3)) || (isItSmall(7)))
          { 
               System.out.print("Result is true" +"");
          }
          if ((isItSmall(6)) || (isItSmall(9)))
         {
               System.out.print("Result is true" +"");
          }
      }

public static boolean isItSmall(int i)
{
     if (i < 5)
     {
           System.out.print("i < 5" +""); return true;
      } else
     {
           System.out.print("i >= 5"+""); return false;
     }
}
}