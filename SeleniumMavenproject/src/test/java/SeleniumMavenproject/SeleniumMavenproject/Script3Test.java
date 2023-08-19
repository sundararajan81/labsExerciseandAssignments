package SeleniumMavenproject.SeleniumMavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Script3Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		//driver.navigate().to("https://www.flipkart.com/");
		driver.get("https://www.flipkart.com/");
		System.out.println("Flipkart website launched");
		driver.manage().window().fullscreen();
		System.out.println("Full screen is shown");
		//driver.wait(1000);
		//driver.navigate().back();
		//driver.navigate().forward();
		//driver.close();
	}

}
