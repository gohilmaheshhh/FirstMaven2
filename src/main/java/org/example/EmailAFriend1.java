package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.text.SimpleDateFormat;

public class EmailAFriend1 {
    static protected WebDriver driver;
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "src/test/java/Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        String timeStamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date());
        System.out.println(timeStamp);
        driver.manage().window().maximize();
        driver.get("http://demo.nopcommerce.com/");
        driver.findElement(By.xpath("//h2[@class=\"product-title\"]//a[@href=\"/apple-macbook-pro-13-inch\"]")).click();
        driver.findElement(By.xpath("//div[@class=\"email-a-friend\"]")).click();
        driver.findElement(By.id("FriendEmail")).sendKeys("mahesh12"+timeStamp+"@gmail.com");
        driver.findElement(By.className("your-email")).sendKeys("mahesh123"+timeStamp+"@gmail.com");
        driver.findElement(By.id("PersonalMessage")).sendKeys("what u doing?");
        driver.findElement(By.name("send-email")).click();
        String regMsg = driver.findElement(By.xpath("//div[@class=\"message-error validation-summary-errors\"]/ul/li")).getText();
        System.out.println(regMsg);
        driver.quit();

    }
}
