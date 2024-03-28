package StepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoqa2 {
    WebDriver driver = null;

    @Given("kullanici demoqa sayfasina gider")
    public void kullanici_demoqa_sayfasina_gider() throws InterruptedException {

        System.out.println("Su anda birinci adimdayim");

        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        Thread.sleep(3000);
        driver.manage().window().maximize();
    }
    @When("kullanici add ogesine tiklar")
    public void kullanici_add_ogesine_tiklar() {

        System.out.println("Su anda ikinci adimdayim");


    }
    @When("kullanici kayit sayfasini duzenler")
    public void kullanici_kayit_sayfasini_duzenler() {

        System.out.println("Su anda ucuncu adimdayim");

    }
    @Then("kullanici kayit olustugunu gozlemler")
    public void kullanici_kayit_olustugunu_gozlemler() {

        System.out.println("Su anda dorduncu adimdayim");


    }
}
