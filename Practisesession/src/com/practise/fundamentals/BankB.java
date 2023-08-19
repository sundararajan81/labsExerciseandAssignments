package com.practise.fundamentals;

public class BankB 
{
 public void getInterest() 
 {
 Long x = 42L;
 Long y = 44L;
 System.out.print(""+7 + 2 +""); 
 System.out.print(dla() + x + 5 + ""); 
 System.out.println(x + y + dla());
 }
 static String dla() 
 { return "dla";
}

public static void main(String args[]) 
{
	BankB bnkb=new BankB();
	bnkb.dla();
	bnkb.getInterest();
}
}
