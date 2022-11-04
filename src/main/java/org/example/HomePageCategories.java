package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePageCategories {


    protected static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/test/java/Drivers/chromedriver.exe");

        driver = new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/");

        String catComputers = driver.findElement(By.linkText("Computers")).getText();
        String catElectronics = driver.findElement(By.linkText("Electronics")).getText();
        String catApparel = driver.findElement(By.linkText("Apparel")).getText();
        String catDigitalDownload = driver.findElement(By.partialLinkText("Digital")).getText();
        String catBooks = driver.findElement(By.linkText("Books")).getText();
        String catJewelry = driver.findElement(By.linkText("Jewelry")).getText();
        String catGiftCards = driver.findElement(By.linkText("Gift Cards")).getText();

        System.out.println(catComputers+" "+catElectronics+" "+catApparel+" "+catDigitalDownload+" "+catBooks+" "+catJewelry+" "+catGiftCards);
        driver.quit();


    }

}
