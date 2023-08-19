package SeleniumMavenproject.SeleniumMavenproject;

import java.awt.Desktop.Action;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CommerceSiteScripts 
{

	public static void main(String[] args) 
	{
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();

		/*WebElement selectCurrencyList = driver.findElement(By.xpath("//select[@id='customerCurrency']"));
		//WebElement selectedCurrency= driver.findElement(By.xpath("//option[contains(text(),'Euro')]"));
		
		Actions action = new Actions(driver);
		WebElement currencyList =driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[1]/div/select/option[2]"));
		action.moveToElement(currencyList).click().perform();
		*/
		
		WebElement search = driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]"));
		search.sendKeys("Build your own computer");
		search.submit();
		
		WebElement price = driver.findElement(By.xpath("//span[contains(text(),'$1,200.00')]"));
		
		System.out.println(price.getText());
		
		WebElement addtoCart =driver.findElement(By.xpath("//button[contains(text(),'Add to cart')]"));
		addtoCart.click();
/*
		WebElement processor =driver.findElement(By.name("product_attribute_1"));
		System.out.println(processor);
		Select processorList= new Select(processor);
		processorList.selectByVisibleText("2.2 GHz Intel Pentium Dual-Core E2200");
		*/
		WebElement ram= driver.findElement(By.id("product_attribute_2"));
		Select ramSize=new Select(ram);
		ramSize.selectByVisibleText("2 GB");
		
		WebElement hdd = driver.findElement(By.id("product_attribute_3_7"));
		hdd.click();
		
		WebElement oss = driver.findElement(By.id("product_attribute_4_9"));
		hdd.click();
	
		WebElement software = driver.findElement(By.id("product_attribute_5_12"));
		software.click();
	
		WebElement totalPrice = driver.findElement(By.id("price-value-1"));
		totalPrice.getText();
		
		WebElement quantity= driver.findElement(By.id("addtocart_1.EnteredQuantity"));
		quantity.getText();
		
		WebElement addToCart2 = driver.findElement(By.id("add-to-cart-button-1"));
		addToCart2.click();
		
			}

}
