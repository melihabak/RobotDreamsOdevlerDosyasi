package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoXPathSelector2 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\melih.abak\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/webtables");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@id='addNewRecordButton']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Melih");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Abak");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("dakmasldkc@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='age']")).sendKeys("15");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='salary']")).sendKeys("25");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='department']")).sendKeys("ino");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@id='submit']")).click();
        Thread.sleep(5000);
        driver.quit();

    }
}
