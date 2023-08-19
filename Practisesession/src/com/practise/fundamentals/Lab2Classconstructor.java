package com.practise.fundamentals;

public class Lab2Classconstructor 
{

	//class, objects, constructors , attributes and member function 
	
	int studentID;
	String studentName;
	int mark1;
	int mark2;
	int mark3;
	int mark4;
	int avgMarks;
	int totalMarks;
	char grade;
	
	public void getStudentmarks(int mark1, int mark2, int mark3, int mark4)
	{
		System.out.println("Method execution getStudentmarks");
		totalMarks = mark1+mark2+mark3+mark4;
		avgMarks = (totalMarks)/4;
		System.out.println("Total of 4 marks ......"+ totalMarks);	
		System.out.println("Avegerage of 4 marks ......"+ avgMarks);	
		
	}
	Lab2Classconstructor()
	{
		System.out.println(" inside constructor");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Lab2Classconstructor lb2 = new Lab2Classconstructor();
		lb2.getStudentmarks(96, 99, 93, 98);

	}

}
