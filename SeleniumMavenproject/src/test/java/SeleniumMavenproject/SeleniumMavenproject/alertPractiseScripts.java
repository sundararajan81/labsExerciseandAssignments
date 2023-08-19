package SeleniumMavenproject.SeleniumMavenproject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class alertPractiseScripts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/alerts");
	driver.manage().window().maximize();
	/*WebElement elementAlert = driver.findElement(By.id("alertButton"));
	elementAlert.click();
	Alert alert=driver.switchTo().alert();
	System.out.println(alert.getText());
	alert.accept();
	
	WebElement elementAlert1 = driver.findElement(By.id("timerAlertButton"));
	elementAlert1.click();
	Alert alert1=driver.switchTo().alert();
	System.out.println(alert1.getText());
	alert1.accept();
	*/
	
	/*WebElement elementAlert2 = driver.findElement(By.id("confirmButton"));
	elementAlert2.click();
	Alert alert2=driver.switchTo().alert();
	System.out.println(alert2.getText());
	alert2.dismiss();
	*/
	
	WebElement elementAlert3 = driver.findElement(By.id("promtButton"));
	elementAlert3.click();
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click()", elementAlert3);
	
	Alert alert3=driver.switchTo().alert();
	alert3.sendKeys("I love you");
	System.out.println(alert3.getText());
	alert3.accept();
	
	
	/*[11:19 AM] DevLabs Trainer

https://www.atlassian.com/git/glossary

Basic Git Commands | Atlassian Git Tutorial

These are the basic commands you need to get started with Git. Learn the most commonly used commands, then start using Git with our step-by-step tutorials.

[11:22 AM] DevLabs Trainer

https://github.com/bashaonlinetraining/DevLabsFramework.git
location	C:\Users\sunda\eclipse\jee-2023-06\eclipse\SDETWorkshop\Practisesession
*
*/

	
	}

}
