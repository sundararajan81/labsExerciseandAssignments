package com.practise.fundamentals;

public class HomeConstructor {
	
	  String ownerName ;
	  int length;
	  int breadth;
	  String address;
	  int cost;
	  int purchasedYear;
	
	HomeConstructor()
	{
	  String ownerName =" Sundar";
	  int length= 1234;
	  int breadth = 234;
	  String address =" 23 Middle street, Chennai";
	  int cost= 7500000;
	  int purchasedYear =2022;
	 }
	
	HomeConstructor(String ownerName, int length, int breadth)
	{
		this.ownerName = ownerName;
		this.length =length;
		this.breadth=breadth;
	}

	HomeConstructor(String OwnerName,int cost, int length, int breadth, int purchasedYear)
	{
		this.ownerName=ownerName;
		this.cost=cost;
		this.length=length;
		this.breadth =breadth;
		this.purchasedYear =purchasedYear;
		int area = length*breadth;
		System.out.println("area......."+area);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      HomeConstructor hme = new HomeConstructor();
      HomeConstructor hme1 = new HomeConstructor("Sundar", 234, 234);
      HomeConstructor hme2= new HomeConstructor("Sundar",9700000,1245,1234,2023);
	}

}
