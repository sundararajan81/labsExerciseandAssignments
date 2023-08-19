package com.practise.fundamentals;

public class PalindromezString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String s ="liril";
 String rev="";

 
 for(int i=0;i<s.length();i++) {
	 rev =rev+s.charAt(i);
	  
 }
 if(s.toLowerCase().equals(rev.toLowerCase())) {
  System.out.println( s + "is a palindrome");
 }
  else
  {
	  System.out.println( s + "is not a palindrome");  
  }
 
 
	}
}
