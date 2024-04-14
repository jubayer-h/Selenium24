package Selenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingCooking {
    //Cookies :A cookie is a small piece of data sent from a website and stored on the user's computer
    //Cookies are small files of information that a web server generates and sends to a web browser.
    public static void main(String[] args) throws InterruptedException {
        // Handling notification: 1. ChromeOptions instance 2. addArguments(): --disable-notifications 3. pass ChromeOptions instance into ChromeDriver
        ChromeOptions options = new ChromeOptions();
        //  ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
        System.out.println("Title is : "+driver.getTitle());

        // Handling cookies:
         driver.manage().deleteAllCookies();
         driver.close();

    }
}