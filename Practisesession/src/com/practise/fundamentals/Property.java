package com.practise.fundamentals;

public class Property {

	static int numGears;
	int numSeats;
	String owner;
	int costCar;
	String carName="Mercedes";	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Property mercedes = new Property();
		mercedes.numGears=4;
		mercedes.numSeats=5;
		mercedes.owner = "Sundar";
		mercedes.costCar =1500;
		//mercedes.carName="Mercedes";
		System.out.println("carName is " + mercedes.carName);
	}

}
