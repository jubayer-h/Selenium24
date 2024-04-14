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
        //		driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[1]/div[2]/a/div/div")).click();

        // Handling radio buttons:
//		WebElement roundTrip = driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/"
//				+ "div[3]/div[2]/div[2]/div/div[2]/div[2]/div/div[2]/div[1]/svg/circle"));
//		WebElement oneWay = driver.findElement(By.cssSelector("#main-container > div > div.css-1dbjc4n.r-14lw9ot > "
//				+ "div.css-1dbjc4n.r-14lw9ot.r-z2wwpe.r-vgw6uq.r-156q2ks.r-11ict49.r-8uuktl.r-136ojw6 > "
//				+ "div.css-1dbjc4n.r-1pcd2l5.r-1uwte3a.r-m611by.r-bnwqim > div:nth-child(2) > div > "
//				+ "div.css-1dbjc4n.r-1d09ksm.r-1inuy60.r-1qxgc49 > div:nth-child(2) > div > div:nth-child(1) > "
//				+ "div.css-1dbjc4n.r-zso239 > svg > g > circle:nth-child(1)"));
//		Thread.sleep(5000);
//		roundTrip.click();
//		Thread.sleep(5000);
//		oneWay.click();
         driver.close();

    }
}