public class BolmeIslemi {
    private int birinciSayi;
    private int ikinciSayi;
    public void bolmeIslemiYap (int birinciSayi, int ikinciSayi){

        try {
            int sonuc = birinciSayi/ikinciSayi;
            System.out.println("Bolme Islemi Sonucu : "+sonuc);
        }
        catch (ArithmeticException e) {
            if (e.toString() == "java.lang.ArithmeticException: / by zero") {
            System.out.println("Sifira bolunme hatasi");
        }
        }
    }
}
