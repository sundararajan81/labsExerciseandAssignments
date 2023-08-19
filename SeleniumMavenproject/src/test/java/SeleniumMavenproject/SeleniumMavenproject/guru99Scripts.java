package SeleniumMavenproject.SeleniumMavenproject;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class guru99Scripts {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demo.guru99.com/insurance/v1/register.php");
		driver.manage().window().maximize();

		
		WebElement titleList = driver.findElement(By.id("user_title"));
		Select titleList1 = new Select(titleList);
		titleList1.selectByVisibleText("Mr");
		
		WebElement firstName = driver.findElement(By.id("user_firstname"));
		firstName.sendKeys("Sundararajan");
		
		WebElement surName =driver.findElement(By.id("user_surname"));
		surName.sendKeys("Thangaraj");
		
		WebElement phoneNumber = driver.findElement(By.id("user_phone"));
		phoneNumber.sendKeys("+18628121950");
		
		WebElement yearToChoose = driver.findElement(By.name("year"));
		Select year = new Select(yearToChoose);
		year.selectByVisibleText("1986");
		
		WebElement monthToChoose = driver.findElement(By.name("month"));
		Select month = new Select(monthToChoose);
		month.selectByVisibleText("May");
		
		WebElement dateToChoose = driver.findElement(By.name("date"));
		Select date = new Select(dateToChoose);
		date.selectByVisibleText("27");
		
		WebElement radioButton=driver.findElement(By.id("licencetype_f"));
		radioButton.click();
		
		WebElement licencePeriod = driver.findElement(By.name("licenceperiod"));
		Select licencePer=new Select(licencePeriod);
		licencePer.selectByVisibleText("9");
		
		WebElement occupationList = driver.findElement(By.name("occupation"));
		Select occupation = new Select(occupationList);
		occupation.selectByVisibleText("Doctor");

		WebElement addressStreet =driver.findElement(By.id("user_address_attributes_street"));
		addressStreet.sendKeys("9301 Spectrurm drive");
		
		WebElement addressCity =driver.findElement(By.id("user_address_attributes_city"));
		addressCity.sendKeys("Austin Texas");
		
		WebElement addressCounty =driver.findElement(By.id("user_address_attributes_county"));
		addressCounty.sendKeys("Williamson County");
		
		WebElement addressPostal =driver.findElement(By.id("user_address_attributes_postcode"));
		addressPostal.sendKeys("78717");
		
		WebElement emailAddress =driver.findElement(By.id("user_user_detail_attributes_email"));
		emailAddress.sendKeys("thang.sun@gmail.com");
		
		WebElement password =driver.findElement(By.id("user_user_detail_attributes_password"));
		password.sendKeys("raj@123");
		
		WebElement passwordConfirm =driver.findElement(By.id("user_user_detail_attributes_password_confirmation"));
		passwordConfirm.sendKeys("raj@123");
		
		WebElement resetButton =driver.findElement(By.id("resetform"));
		resetButton.click();
		
		WebElement createButton = driver.findElement(By.name("submit"));
		createButton.click();

		driver.wait();
		
		driver.quit();
	}

}
