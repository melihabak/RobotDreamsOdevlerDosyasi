import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class OdevAlgoritma {
    public static void main(String[] args) {

        String[] arr = { "The", "lazy",  "quick", "brown", "fox", "jumps", "over", "the",  "lazy", "fox",  "dog" };

        String s = Arrays.toString(arr);
        System.out.println(s); //girilen dizi elemanlarının ekrana bastırılması

        //secilecek iki anahtar kelime belirtilmesi
        String key1 ="fox";
        String key2 ="lazy";

        boolean flag = false;
        ArrayList<String> arananKelimelerDizisi = new ArrayList<String>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key1 || arr[i] == key2) {
                System.out.println("Available at index " + i + " : " + arr[i]); //secili kelimelerin hangi indekste ve kac tane varsa ekrana bastırılması
                arananKelimelerDizisi.add(arr[i]);
                flag = true;
            }
        }
        if (flag == false) {
            System.out.println("Not found");
        }
        System.out.println("Anahtar kelimeler dizisi : "+arananKelimelerDizisi); //sadece anahtar kelimelerşn oldugu dizi olusturulup bastırılması
        ArrayList<String> yazdirilacakKelimeDizisi = new ArrayList<String>();

        //anahtar kelimelerin birden fazla oluşumunu engellemek için yazılan for döngüsü
        for (int i=1 ; i<arananKelimelerDizisi.size();i++){
            yazdirilacakKelimeDizisi.add(arananKelimelerDizisi.get(0));
            if (arananKelimelerDizisi.get(i) != arananKelimelerDizisi.get(i - 1)){
                yazdirilacakKelimeDizisi.add(arananKelimelerDizisi.get(i));
                break;
            }
        }
        System.out.println("Yeni kelime olusumu icin ulasilan dizi : "+yazdirilacakKelimeDizisi); //yeni kelime oluşumunda kullanılacak iki kelimeyi içeren dizinin yazdırılması
        Collections.sort(yazdirilacakKelimeDizisi);// oluşan dizinin hedef kelime için sort edilmesi
        String yeniKelime = yazdirilacakKelimeDizisi.get(1) + yazdirilacakKelimeDizisi.get(0); //yeni eşsiz kelimenin tanımlanarak bir önceki dizi vasıtasıyla oluşturulması
        System.out.println("*******************************");
        System.out.println(" Olusan Yeni Kelime : "+ yeniKelime); // olusan yeni eşsiz kelimenin ekrana bastırılması
        System.out.println("*******************************");
    }
}
