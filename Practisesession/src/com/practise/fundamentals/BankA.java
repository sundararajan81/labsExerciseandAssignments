package com.practise.fundamentals;

public class BankA {
	static int players = 0;
	
	public void getInterest() {
				
		int x=15;
		int y= 20;
		x=(x<y) ? (y+x) : (y-x);
		int a =-20;
		int b= -3;
		int c= a%b;
		System.out.println("value of c is..."+c);
		
		System.out.println("The Interest rateBank A "+ x);
		
		 	
		 System.out.print("players online:" + players++ +"");

		 System.out.print("The value of players is" + players+""); 
		 System.out.println("The value of players is now"+ ++players);
		 
		 long l = 1L;
		 byte h = (byte) l; 
		 System.out.println("The byte is "+ h);

	
		
	}
	
	public static void main(String args[]) {
		BankA bnka=new BankA();
		bnka.getInterest();
	}

}
