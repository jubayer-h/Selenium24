package Selenium;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AlertPop {
    public static void main(String[] args) throws InterruptedException {

        ChromeOptions options=new ChromeOptions();
        options.addArguments("--disable-notification");//--disable-notifications
        WebDriver  driver=new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://demo.guru99.com/test/delete_customer.php");

       WebElement textbox= driver.findElement(By.cssSelector("[name='cusid']"));
       textbox.sendKeys("test123");
      WebElement submitbtn= driver.findElement(By.cssSelector("[name='submit']"));
      submitbtn.click();

        // handling alert -> 1. Get txt | 2. Accept | 3. Deny | 4. sendKeys
        String Alter_m1=driver.switchTo().alert().getText();
        System.out.println(Alter_m1);
        driver.switchTo().alert().accept();
        Thread.sleep(1000);
        String Alter_m2=driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        System.out.println(Alter_m2);
        Thread.sleep(1000);
        //-----
        driver.findElement(By.name("cusid")).sendKeys("123Test");
        Thread.sleep(1000);
        WebElement resetBtn = driver.findElement(By.name("res"));
        resetBtn.click();

        driver.findElement(By.name("cusid")).sendKeys("TestingAgain");

//		submitBtn.click(); // StaleElementReferenceException: stale element reference: stale element not found
        driver.findElement(By.name("submit")).click();
        Thread.sleep(1000);
        driver.switchTo().alert().dismiss();

//		driver.switchTo().alert().sendKeys("typing in alert"); -> if alert has txt box

        driver.close();

    }
}
