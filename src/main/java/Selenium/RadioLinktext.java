package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class RadioLinktext {
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
       //customize xpath using
        WebElement oneway=driver.findElement(By.xpath("//input[@value='oneway']"));
        WebElement roundTrip=driver.findElement(By.xpath("//input[@value='roundtrip']"));

       // WebElement oneWay = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td"
              //  + "/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]"));

        //WebElement roundTrip = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr"
               // + "[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[1]"));
        Thread.sleep(5000);
        oneway.click();
        Thread.sleep(5000);
        roundTrip.click();

        ArrayList<WebElement> serviceClasses = new ArrayList<WebElement>();
        serviceClasses.add(driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/"
                + "tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/input")));
        serviceClasses.add(driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody"
                + "/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[1]")));
        serviceClasses.add(driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]"
                + "/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[2]")));

        for (WebElement serviceClass : serviceClasses) {
            serviceClass.click();
            System.out.println(serviceClass.isSelected()); // validation for radiobutton click
            Thread.sleep(3000);


            driver.close();
        }
    }
}