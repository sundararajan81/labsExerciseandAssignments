package SeleniumMavenproject.SeleniumMavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Script1 {


    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        // to maximize the browser
        driver.manage().window().maximize();
        driver.navigate().to("https://demo.guru99.com/insurance/v1/register.php");
        System.out.println("title: ---->"+driver.getTitle());
        System.out.println("url: ---->"+driver.getCurrentUrl());
        System.out.println("sessionId: --->"+driver.getWindowHandle());
        WebElement firsNameElement = driver.findElement(By.id("user_firstname"));
        firsNameElement.sendKeys("Tester123");
        WebElement lastNameElement = driver.findElement(By.name("lastname"));
        lastNameElement.sendKeys("QA");
        firsNameElement.clear();
        WebElement provisionBtn = driver.findElement(By.xpath("//label[@for = 'licencetype_f']"));
        provisionBtn.click();
        WebElement loginBtn = driver.findElement(By.xpath("(//a[text()='Login'])[last()]"));
        System.out.println(loginBtn.isEnabled());
    //    loginBtn.click();
        WebElement titleElement = driver.findElement(By.id("user_title"));
        Select select = new Select(titleElement);
    //    select.selectByIndex(4);
        select.selectByVisibleText("Father");
        select.selectByValue("Miss");
        //driver.close();


    }

 

}
