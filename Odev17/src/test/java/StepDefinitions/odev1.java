package StepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertEquals;

public class odev1 {
    WebDriver driver;

    @Given("Open the browser and navigate to the demoqa website")
    public void openBrowserAndNavigateToDemoqa() throws InterruptedException {
        // WebDriver'ı başlatma
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();


        // Demoqa web sitesine gitme
        driver.get("https://demoqa.com/elements");
        Thread.sleep(1000);
        System.out.println("Birinci kismi gectim");
    }

    @When("Click on the 'Buttons' element")
    public void clickOnButtonsElement() throws InterruptedException {
        // 'Buttons' ögesine tıklama
        driver.findElement(By.xpath("//span[contains(text(),'Buttons')]")).click();
        Thread.sleep(1000);
        System.out.println("Ikinci kismi gectim");

    }

    @And("Click on the 'Click Me' button")
    public void clickOnClickMeButton() throws InterruptedException {
        // 'Click Me' düğmesine tıklama
        driver.findElement(By.xpath("//button[starts-with(text(),'Click Me')]")).click();
        Thread.sleep(1000);
        System.out.println("Ucuncu kismi gectim");

    }

    @Then("Verify the displayed message")
    public void verifyDisplayedMessage() {
        // Mesajın doğru şekilde göründüğünü doğrulama
        String okunanMesaj = driver.findElement(By.cssSelector("#dynamicClickMessage")).getText();
        System.out.println(okunanMesaj);
        assertEquals("You have done a dynamic click", okunanMesaj);
    }

    @And("Close the browser")
    public void closeBrowser() {
        // WebDriver'ı kapatma
        driver.quit();
    }
}
