package com.practise.fundamentals;

public class Arrayaverage 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a[]= {13,23,45,45,56};
		int sum = a[0]+a[1]+a[2]+a[3]+a[4];
		int average = sum/(a.length);
		System.out.println("sum of array elements..."+sum);
		System.out.println("average of array elements..."+average);
		
		// for loop 
		int total=0;
		int sum1=0;
		int average1;
		for(int i=0;i<a.length;i++) 
		{
			 //total += a[i] ;
			 sum1= sum1 +a[i];
			 average =sum1/a.length;	
		}	
		System.out.println("Total of all numbers is ...."+ sum1);
		System.out.println("Total of all numbers is ...."+ average);
		
		String s1="She sells sea shell on the sea shore";
		String s4= "hello world";
		String s2;
		String[] s3;
		s2=s1.trim();
		s3=s1.split(s4, 4);
		System.out.println("Trim of s1"+s2);
		System.out.println("split of s1"+s3);
		
	}
}
