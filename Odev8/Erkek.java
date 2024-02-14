public class Erkek extends Personel {

    public Erkek(String ad, String soyad, int dogumYili) {
        super(ad, soyad, dogumYili);
    }

    @Override
    public boolean sorgulaEmeklilik(){
        if (this.getDogumYili()<1964){
            return true;
        }else {
            return false;
        }
    }


}
