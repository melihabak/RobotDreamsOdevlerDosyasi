package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class DemoCSSSelector {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\melih.abak\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/elements");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#item-4")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/button[1]")).click();
        String okunanMesaj = driver.findElement(By.cssSelector("#dynamicClickMessage")).getText();
        System.out.println(okunanMesaj);
        driver.quit();

    }
}
