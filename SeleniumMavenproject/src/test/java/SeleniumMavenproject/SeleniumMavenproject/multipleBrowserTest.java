package SeleniumMavenproject.SeleniumMavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.WebDriver;

public class multipleBrowserTest {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("www.google.com");
		
		WebDriver driver1 = new FirefoxDriver();
		driver1.get("www.google.com");
		
		
	}

}
