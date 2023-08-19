package com.practise.fundamentals;
public class retailmart
{
	public static void main(String args[])
			{
		int invoiceNum = 1234;
		int itemNum=2345;
		float itemPrice = 1234.45f;
		int quaitemPur = 456;
		int discount = 10;
		float totamount = 3456.78f;
		String comments ="products are good quality";
		
		//int itemAprice,itemB,itemC,
		int itemAprice = 200;
		int itemBprice=80;
		int itemCprice=150;
		int quantityA=3;
		int quantityB=4;
		int quantityC=5;
		int totalAmount = ((itemAprice*quantityA)+(itemBprice*quantityB)+(itemCprice*quantityC))*20/100;
		System.out.println(" Total Amount without tax"+totalAmount);
		int finalbill=totalAmount*2/100;
		System.out.println(finalbill);
		
		/*int numCustomer = 13;
		int invoice[]=new int[numCustomer];*/
		
		int marks[]= new int[6];
		marks[0]=45;
		marks[1]=55;
		marks[2]=49;
		marks[3]=95;
		marks[4]=85;
		marks[5]=95;
		
		int average = (marks[0]+marks[1]+marks[2]+marks[3]+marks[4]+marks[5])/6;
		System.out.println(average);
		
		
		
		
		
		
		
		
	}
}
