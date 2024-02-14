public class Kadin extends Personel{
    public Kadin(String ad, String soyad, int dogumYili) {
        super(ad, soyad, dogumYili);
    }

    @Override
    public boolean sorgulaEmeklilik(){
        if (this.getDogumYili()<1969){
            return true;
        }else {
            return false;
        }
    }
}
