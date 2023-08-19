package SeleniumMavenproject.SeleniumMavenproject;

import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;

public class firefoxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.setProperty("webdriver.geckodriver.driver", "C:\\geckodriver-v0.33.0-win-aarch64.zip");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.demo.guru99.com/insurance/v1/register.php");
		driver.getCurrentUrl();
		driver.getTitle();	
		driver.close();*/
	  String[] s = {"sundar", "Haresh","Harini"};
	  for(String str : s)
	  {
		  System.out.println("array elements"+str);
	  }
	  ArrayList <Integer> a = new ArrayList <Integer>();
	  a.add(23);
	  a.add(45);
	  a.add(56);
	 // a.remove(1);
	  //a.set(1,59);
	  System.out.println(a.contains(45));
	 System.out.println("size"+ a.size());
	 System.out.println("array 2 element"+ a.get(2));
	 
	 ArrayList <String> str1 = new ArrayList<String>();
	 str1.add("Sundar");
	 str1.add("Java");
	 str1.add("SQL");
	 System.out.println(str1.get(2));
	 String getValue = str1.get(1);
	 System.out.println("Value of Index1...."+getValue);
	 
	 for(int i=0;i<str1.size();i++)
	 {
		 System.out.println(str1.get(i));
		 
	 }
	 if(str1.contains("Java"))
			 {
		 	System.out.println("Array List contains value Java");
			 }
	 else
	 {
		 System.out.println("Arraylist doesnt contain Java");
	 }
	 
	 str1.add(3,"Selenium");
	 System.out.println(str1.size());
	 
	 for(String str2 : str1)
	 {
		 System.out.println(str2);
	 }
	  
	}

}
