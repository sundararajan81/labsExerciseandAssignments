package com.practise.fundamentals;

public class StringTraining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1=" I have enrolled for Java Training";
		
		for(int i=0;i<s1.length();i++)
		{
			System.out.println(s1.charAt(i));
		}
		
		for(int i=s1.length()-1;i>=0;i--) {
			System.out.println(s1.charAt(i));
		}
	/*System.out.println(s1.split(" "));
		String[] splittedValues =s1.split(" ");
		
		for (int i=0; i<splittedValues.length;i++)
		{
			//System.out.println("splitted values..."+splittedValues[i]);
			System.out.println("Characters are ...."+s1.charAt(i));
		}
		for(String a:splittedValues)
		{
			System.out.println(a);
		}*/
	}

}
