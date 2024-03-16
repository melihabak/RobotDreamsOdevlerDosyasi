package org.example;

public class Personel {
    String Isim;
    String Soyisim;
    String Departman;
    int CalismaYili;

    public String getIsim() {
        return Isim;
    }

    public void setIsim(String isim) {
        Isim = isim;
    }

    public String getSoyisim() {
        return Soyisim;
    }

    public void setSoyisim(String soyisim) {
        Soyisim = soyisim;
    }

    public String getDepartman() {
        return Departman;
    }

    public void setDepartman(String departman) {
        Departman = departman;
    }

    public int getCalismaYili() {
        return CalismaYili;
    }

    public void setCalismaYili(int calismaYili) {
        CalismaYili = calismaYili;
    }

    void personelYazdir(){
        System.out.println("*Çalışanın Adı : "+Isim+ "* *Çalışanın Soyadı : "+Soyisim+"* *Çalıştığı Departman : "+Departman+" *Çalışılan YIl : "+CalismaYili+"*");
    }
}
