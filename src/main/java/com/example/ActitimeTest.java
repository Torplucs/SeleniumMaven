package com.example;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeTest {

    WebDriver driver;
    JavascriptExecutor jse;

    public void actitime(){
        try {
            System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().deleteAllCookies();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

            driver.get("https://www.actitime.com/");
            driver.findElement(By.linkText("Try Free")).click();
            driver.findElement(By.id("first-name")).click();
            driver.findElement(By.id("first-name")).sendKeys("Xenxol");
            driver.findElement(By.id("last-name")).sendKeys("Xaxol");
            driver.findElement(By.id("email")).click();
            driver.findElement(By.id("email")).sendKeys("xenolo@caxre.gov");
            driver.findElement(By.id("company")).sendKeys("xexez");
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }

}