package SeleniumMavenproject.SeleniumMavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Script2 {
	
	public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        // to maximize the browser
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/select-menu");
        /*String s =driver.getTitle();
        System.out.println("Title"+s);
        String t=driver.getPageSource();
        System.out.println("pagesource"+t);
       String u= driver.getCurrentUrl();
        System.out.println("url" +u);*/
        WebElement carElement = driver.findElement(By.id("cars"));
        Select select = new Select(carElement);
        System.out.println(select.isMultiple());
        select.selectByValue("volvo");
        select.selectByValue("saab");
        select.selectByValue("audi");
        select.deselectByValue("saab");
        select.deselectAll();
        driver.switchTo();
        driver.close();
    }

}
