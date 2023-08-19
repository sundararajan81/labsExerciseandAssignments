package com.practise.fundamentals;

public class Product {

	  int prodManYear;
	  String manuBy;
	  int cost;
	  int discount;
	
	public void getProductdetails(int ProdManYear, String manuBy,int cost, int discount)
	{
	   this.prodManYear=prodManYear;
	   this.manuBy=manuBy;
	   this.cost=cost;
	   this.discount=discount;	  
	 }
	public void getProductdetails(String manuBy,int ProdManYear,int cost, int discount)
	{
	   this.prodManYear=prodManYear;
	   this.manuBy=manuBy;
	   this.cost=cost;
	   this.discount=discount;	  
	 }
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product prd = new Product();
		prd.getProductdetails(1985, "BMW", 126788, 10);
		prd.getProductdetails("Benz", 2022,7500000, 5);

	}

}
