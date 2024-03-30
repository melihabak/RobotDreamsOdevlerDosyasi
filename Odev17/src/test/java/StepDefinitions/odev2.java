package StepDefinitions;


import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class odev2 {
    WebDriver driver;

    @Given("Open the browser and navigate to the demoqa website now")
    public void openBrowserAndNavigateToDemoqa() throws InterruptedException {
        // WebDriver'ı başlatma
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();

        // Demoqa web sitesine gitme
        driver.get("https://demoqa.com/webtables");
        Thread.sleep(1000);

    }

    @When("Click on the 'Add' button to add a new record")
    public void clickOnAddButtonToAddRecord() throws InterruptedException {
        // 'Add' düğmesine tıklama
        driver.findElement(By.id("addNewRecordButton")).click();
        Thread.sleep(1000);

    }

    @And("Fill in the form fields with the following data")
    public void fillFormFieldsWithData() {

        // Form alanlarını doldurma
        driver.findElement(By.id("firstName")).sendKeys("melih");
        driver.findElement(By.id("lastName")).sendKeys("abak");
        driver.findElement(By.id("userEmail")).sendKeys("msa@gmail.com");
        driver.findElement(By.id("age")).sendKeys("85");
        driver.findElement(By.id("salary")).sendKeys("6");
        driver.findElement(By.id("department")).sendKeys("yun");

    }

    @Then("Verify the name field")
    public void verifyTheName() throws InterruptedException {

        Thread.sleep(1000);
        Boolean okunanIsim =  driver.findElement(By.id("firstName")).isDisplayed();
        assertTrue(okunanIsim);
    }



    @And("Close the browser now")
    public void closeBrowser() {
        // WebDriver'ı kapatma
        driver.quit();
    }
}
