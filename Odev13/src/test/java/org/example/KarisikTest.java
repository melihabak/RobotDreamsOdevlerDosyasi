package org.example;
import org.junit.Test;
import static org.testng.Assert.assertEquals;
public class KarisikTest {
    @Test
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
    @Test
    public void testMaas(){

        personelmaas test = new personelmaas();
        int maas = personelmaas.maashesaplama();
        int CalisilanGunSayisi = 27;
        int GunlukUcret = 1000;
        if (CalisilanGunSayisi<25){
            assertEquals(20000,maas);
        } else if (CalisilanGunSayisi<31) {
            assertEquals(CalisilanGunSayisi*GunlukUcret,maas);
        }
    }
}
