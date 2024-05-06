

public class HRClass {

    public static void main(String args[]) {

        Personel personel1 = new Personel();
        Personel personel2 = new Personel();

        personel1.Isim = "Melih";
        personel1.Soyisim= "Abak";
        personel1.Departman="Inovasyon";
        personel1.CalismaYili=3;

        personel2.Isim = "Ahmet";
        personel2.Soyisim= "Abak";
        personel2.Departman="IT";
        personel2.CalismaYili=12;

        personel1.personelYazdir();
        personel2.personelYazdir();
    }
}

