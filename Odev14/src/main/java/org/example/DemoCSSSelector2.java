package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class DemoCSSSelector2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\melih.abak\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/webtables");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#addNewRecordButton")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#firstName")).sendKeys("Melih");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#lastName")).sendKeys("Abak");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#userEmail")).sendKeys("mfascasdcascas@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#age")).sendKeys("15");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#salary")).sendKeys("20");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#department")).sendKeys("ino");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#submit")).click();
        Thread.sleep(5000);
        driver.quit();
    }
}
