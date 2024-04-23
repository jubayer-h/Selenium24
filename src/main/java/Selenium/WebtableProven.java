package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebtableProven {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        //  ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/newtours/");
        System.out.println("Title is : "+driver.getTitle());

       int rows= driver.findElements(By.xpath("//table[@width='270']/tbody/tr")).size();
        System.out.println("Total rows :"+rows);//5 rows
        int cols=driver.findElements(By.xpath("//table[@width='270']/tbody/tr/td")).size();
        System.out.println("Total cols : "+cols);//10 cols
        //retreive specific data -Boston to San Francisco
     String sanfansco= driver.findElement(By.xpath("//table[@width='270']/tbody/tr[2]/td[1]")).getText();
       System.out.println(sanfansco);
       if(sanfansco.equals("Boston to San Francisco")) {
           System.out.println("Test passed");
       }else {
           System.out.println("Fail");
           }
       //Reteive all data from table we need to write loop statement
        for(int r=1; r<=rows; r++)
        {
            for(int c=1; c<=cols; c++)
            {
                String alldata= driver.findElement(By.xpath("//table[@width='270']/tbody/tr["+r+"]/td["+c+"]")).getText();
              // String addl=driver.findElement(By.xpath("//table[@width='270']//tr["+r+"]/td["+c+"]")).getText();
                System.out.println(alldata);
            }
        }




        driver.close();
    }
}
