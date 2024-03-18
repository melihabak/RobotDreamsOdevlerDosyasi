package org.example;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.codeborne.selenide.Selenide.$;
public class SelenideTest2 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\melih.abak\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //driver.get("https://demoqa.com/webtables");
        Configuration.holdBrowserOpen = true;
        Selenide.open("https://demoqa.com/webtables");
        Thread.sleep(1000);
        SelenideElement addButton = $("#addNewRecordButton");
        addButton.click();
        Thread.sleep(1000);
        SelenideElement usernameInput = $("#firstName");
        usernameInput.setValue("Melih");
        Thread.sleep(1000);
        SelenideElement lastnameInput = $("#lastName");
        lastnameInput.setValue("Abak");
        Thread.sleep(1000);
        SelenideElement emailInput = $("#userEmail");
        emailInput.setValue("sjdnsdnldsvmsm@gmail.com");
        Thread.sleep(1000);
        SelenideElement ageInput = $("#age");
        ageInput.setValue("15");
        Thread.sleep(1000);
        SelenideElement salaryInput = $("#salary");
        salaryInput.setValue("15");
        Thread.sleep(1000);
        SelenideElement departmentInput = $("#department");
        departmentInput.setValue("ino");
        Thread.sleep(1000);
        SelenideElement submitButton = $("#submit");
        submitButton.click();
        Thread.sleep(5000);
        driver.quit();
    }
}
