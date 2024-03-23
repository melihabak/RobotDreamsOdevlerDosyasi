package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoXPathSelector {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\melih.abak\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/elements");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[contains(text(),'Buttons')]")).click();
        //driver.findElement(By.xpath("//button[contains(text(),'Click Me')]")).click(); //bu xpath diger 3 butonu da icerdiginden en basta gordugune tiklar
        driver.findElement(By.xpath("//button[starts-with(text(),'Click Me')]")).click();
        String okunanMesaj = driver.findElement(By.xpath("//p[@id='dynamicClickMessage']")).getText();
        System.out.println(okunanMesaj);
        driver.quit();

    }
}
