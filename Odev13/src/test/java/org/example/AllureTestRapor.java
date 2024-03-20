package org.example;

import io.qameta.allure.Step;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
public class AllureTestRapor {
    @BeforeTest
    public void beforeCall(){
        System.out.println("This is before test method");
    }
    @Step("Test case 001")
    @Test(priority = 1)
    public void testPersonel(){
        Personel test = new Personel();
        test.Isim = "melih";
        test.CalismaYili = 3;
        test.Departman = "Inovasyon";
        test.Soyisim="abak";

        assertEquals("melih",test.getIsim());
        assertEquals("abak",test.getSoyisim());
        assertEquals(3,test.getCalismaYili());
        assertEquals("Inovasyon",test.getDepartman());
    }
    @Step("Test case 002")
    @Test(priority = 2)
    public void testMaas(){
        personelmaas test = new personelmaas();
        int maas = personelmaas.maashesaplama();
        int CalisilanGunSayisi = 27;
        int GunlukUcret = 1000;
        if (CalisilanGunSayisi<=25){
            assertEquals(20000,maas);
        } else if (CalisilanGunSayisi<31) {
            assertEquals(CalisilanGunSayisi*GunlukUcret,maas);
        }
    }

    @AfterTest
    public void tearDown(){
        System.out.println("This is after test method");
    }
}
