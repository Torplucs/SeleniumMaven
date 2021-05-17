package com.example;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AdLibris {
    WebDriver driver;
    JavascriptExecutor jse;

    public void adLibris() {
        try {
            System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().deleteAllCookies();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

            driver.get("https://www.adlibris.com/se");
            {
              WebElement element = driver.findElement(By.cssSelector(".container-1"));
              Actions builder = new Actions(driver);
              builder.moveToElement(element).perform();
            }
            {
              WebElement element = driver.findElement(By.tagName("body"));
              Actions builder = new Actions(driver);
              builder.moveToElement(element, 0, 0).perform();
            }
            driver.findElement(By.id("q")).click();
            driver.findElement(By.id("q")).sendKeys("praktisk mjukvarutestning");
            driver.findElement(By.id("q")).sendKeys(Keys.ENTER);
            driver.findElement(By.cssSelector(".purchase__wrapper .price > span")).click();
            driver.findElement(By.cssSelector(".material-icons__shopping_cart:nth-child(2)")).click();
            driver.findElement(By.linkText("Till kassan")).click();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    
    }
}
