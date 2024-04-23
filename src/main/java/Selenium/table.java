package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class table {
    public static void main(String[] args) throws InterruptedException {

        // Handling notification: 1. ChromeOptions instance 2. addArguments(): --disable-notifications 3. pass ChromeOptions instance into ChromeDriver
        ChromeOptions options = new ChromeOptions();
        //  ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/newtours/");
        System.out.println("Title is : "+driver.getTitle());

        // Handling cookies:
        driver.manage().deleteAllCookies();


Thread.sleep(1000);
        int rows=driver.findElements(By.xpath("(//table[@width='270'])[1]/tbody/tr")).size();
        Thread.sleep(1000);
        int cols=driver.findElements(By.xpath("(//table[@width='270'])[1]/tbody/tr/td")).size();
        System.out.println("table tr=row " +rows);
        System.out.println("Table td=cols "+cols);

        String AtlantaText=driver.findElement(By.xpath("(//table[@width='270'])[1]//tr[1]/td[1]")).getText();
        System.out.println(AtlantaText);

        driver.close();
    }
}
