package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Set;

public class Windowhandl {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        //  ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/popup.php");
        System.out.println("Title is : "+driver.getTitle());

       WebElement clickWindow= driver.findElement(By.linkText("Click Here"));
        clickWindow.click();
       String parentwind= driver.getWindowHandle();
        System.out.println(parentwind);
        //click three time window
        for(int i=1; i<=3; i++)
        {
            clickWindow.click();
        }
        System.out.println(driver.getWindowHandle());
        Set<String> Handles=driver.getWindowHandles();

        for(String handle:Handles){
            driver.switchTo().window(handle);
            driver.close();
        }

        driver.close();//
        driver.quit();//all window close
    }
}
