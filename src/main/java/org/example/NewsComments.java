package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewsComments {
    protected static WebDriver driver;
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/test/java/Drivers/chromedriver.exe");

        driver = new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/");

        driver.findElement(By.partialLinkText("release")).click();

        driver.findElement(By.id("AddNewComment_CommentTitle")).sendKeys("Joe Bloggs");
        driver.findElement(By.id("AddNewComment_CommentText")).sendKeys("This is a demo website for test engineers");

        driver.findElement(By.name("add-comment")).click();

        String commentmessage = driver.findElement(By.xpath("//div[@class=\"fieldset new-comment\"]/div[2]/div[@class=\"result\"]")).getText();

        System.out.println(commentmessage);

        driver.quit();

    }

}
