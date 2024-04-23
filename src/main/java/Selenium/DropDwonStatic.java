package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDwonStatic {

    public static void main(String[] args) throws InterruptedException {


        ChromeOptions options = new ChromeOptions();
        //  ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/newtours/");
        System.out.println("Title is : " + driver.getTitle());

        driver.findElement(By.linkText("Flights")).click();
        System.out.println("Current title :" + driver.getCurrentUrl());

        // Handling Drop Down: 1. Static drop down: click to visualize options - Select class	| 2. Dynamic drop down: hover mouse to visualize options - Actions class

        Select select=new Select(driver.findElement(By.name("passCount")));
        //Select select = new Select(driver.findElement(By.name("passCount")));
        // selecting -> 1. index | 2. value | 3. txt
        select.selectByIndex(3);
        Thread.sleep(5000);
        select.selectByValue("3");
        Thread.sleep(5000);
        select.selectByVisibleText("2");

        Select select1 = new Select(driver.findElement(By.name("airline")));
        List<WebElement> airlinePreferences = select1.getOptions();

        for(WebElement preference: airlinePreferences) {
            System.out.println("Option Selected: "+preference.getText());
            preference.click();
            Thread.sleep(3000);
        }

        // Using TagName: img-images | a-links | dropDown-select ....input/a/td/tr..
        List<WebElement> links = driver.findElements(By.tagName("a")); // findElements() -> all the elements satisfying locator
        System.out.println("Total number of links in flight finder page: "+links.size());
        for(int i=0; i<links.size(); i++) {
            WebElement link = links.get(i);
            System.out.println(link.getText());
        }

        List<WebElement> images = driver.findElements(By.tagName("img"));
        System.out.println("Total number of images in flight finder page: "+images.size());
        for(int i=0; i<images.size(); i++) {
            WebElement image = images.get(i);
            System.out.println(image.getAttribute("src")); // getAttribute() -> te get attribute value
        }

        Thread.sleep(5000);
        driver.close();
    }

}


