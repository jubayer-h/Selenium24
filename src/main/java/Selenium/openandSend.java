package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class openandSend {
    public static void main(String[] args) throws InterruptedException {
        //create instance of driver to specific to browser -polymer
        WebDriver driver=new ChromeDriver();
        //maximaize the window
        driver.manage().window().maximize();
        //load application
        Thread.sleep(1000);
        driver.get("http://www.amazon.com");
        System.out.println("This is title : "+driver.getTitle());

        Thread.sleep(2000);
       WebElement serachtextBox=driver.findElement(By.id("twotabsearchtextbox"));
       serachtextBox.sendKeys("apple");

       String appleurl="https://www.amazon.com/s?k=apple&crid=2ODRINAJUQUUM&sprefix=apple%2Caps%2C423&ref=nb_sb_noss_1;" ;
       String apple="amazon.com:apple";


       String actulPageURl=driver.getCurrentUrl();
       String actulpageURltitle= driver.getTitle();

       if(actulPageURl.equals(actulpageURltitle)){
           System.out.println("Test passed");
       }else {
           System.err.println(" Test Failed");
       }
        System.out.println("Fisished is here");
        System.out.println("for send comitt test");
        System.out.println("for test 3rd commit");



        //close the application
        //driver.close();

    }
}
