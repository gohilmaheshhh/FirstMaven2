package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Products {
    protected static WebDriver driver;

    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "src/test/java/Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.nopcommerce.com/");
        driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li/a[@href=\"/computers\"]")).click();
        driver.findElement(By.xpath("//div[@class=\"category-grid sub-category-grid\"]//img[@alt=\"Picture for category Desktops\"]")).click();
        String regMsg = driver.findElement(By.xpath("//div[@class=\"details\"]/h2/a[@href=\"/build-your-own-computer\"]")).getText();
        String regMsg1 = driver.findElement(By.xpath("//div[@class=\"details\"]/h2/a[@href=\"/digital-storm-vanquish-3-custom-performance-pc\"]")).getText();
        String regMsg2 = driver.findElement(By.xpath("//div[@class=\"details\"]/h2/a[@href=\"/lenovo-ideacentre-600-all-in-one-pc\"]")).getText();
        System.out.println(regMsg);
        System.out.println(regMsg1);
        System.out.println(regMsg2);
        driver.quit();

    }
}
