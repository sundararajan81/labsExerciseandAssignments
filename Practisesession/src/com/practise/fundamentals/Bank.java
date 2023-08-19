package com.practise.fundamentals;

public interface Bank  
{
	void getInterest(); 
}
class Bank1 implements Bank
{

	@Override
	public void getInterest() {
		// TODO Auto-generated method stub
		System.out.println("Bank1 implements Bank");
	}
	}
class Bank2 implements Bank
{

	@Override
	public void getInterest() {
		// TODO Auto-generated method stub
		System.out.println("Bank2 implements Bank");
	}
	
}

