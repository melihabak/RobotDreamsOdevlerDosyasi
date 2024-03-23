package org.example;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class SelenideTest {
    public static String denemeTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\melih.abak\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/elements");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#item-4")).click();
        driver.findElement(By.cssSelector("#i6nal")).click();
        String okunanMesaj = driver.findElement(By.cssSelector("#dynamicClickMessage")).getText();
        System.out.println(okunanMesaj);
        driver.quit();
        return okunanMesaj;
    }
    @Test
    public void okunanMesajTestiBir() throws InterruptedException {

        String okunmusDeger = denemeTest();
        String beklenenMesaj = "You have done a dynamic click";
        Assertions.assertThat(okunmusDeger).isEqualTo(beklenenMesaj);
    }
}
