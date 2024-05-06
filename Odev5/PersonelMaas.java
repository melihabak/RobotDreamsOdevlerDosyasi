import java.util.Scanner;
public class PersonelMaas {
    static void maashesaplama(){
        int maas = 20000 ; //sabit maas
        Scanner input = new Scanner(System.in);
        int a;
        System.out.print("Çalışılan gün sayısını giriniz : ");
        a = input.nextInt();
        if (a<=25){
            System.out.println("Çalışan maaşı : "+maas + " Türk Lirası");
        } else if (a<=31) {
            System.out.println("Çalışan maaşı : "+(maas+(a-25)*1000)+ " Türk Lirası");
        }else {
            System.out.println("Geçersiz Çalışma Gün Sayısı Girişi Yaptınız");
        }
    }
    public static void main(String args[]) {
        maashesaplama();
    }
}
