package com.example;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromium {
    WebDriver driver;
    JavascriptExecutor jse;

    public void invokeBrowser(){
        try{
            System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().deleteAllCookies();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    
            driver.get("https://www.google.com");
            searchGoogle();
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }

    public void searchGoogle() {
        WebElement wElement = driver.findElement(By.name("q"));
        wElement.sendKeys("Software Testing");
        wElement.submit();
    }
}
