abstract class Personel {

    private String ad;
    private String soyad;
    private int dogumYili;

    public Personel(String ad, String soyad, int dogumYili) {
        this.ad = ad;
        this.soyad = soyad;
        this.dogumYili = dogumYili;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getDogumYili() {
        return dogumYili;
    }

    public void setDogumYili(int dogumYili) {
        this.dogumYili = dogumYili;
    }

    public boolean sorgulaEmeklilik(){
        return false;
    }

}
