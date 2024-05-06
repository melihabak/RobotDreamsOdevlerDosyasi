import java.util.Scanner;
public class PersonelMaas {
    static void maashesaplama(){
        int maas = 20000 ; //sabit maas
        Scanner input = new Scanner(System.in);
        int a;
        System.out.print("Calisilan Gun Sayisini Giriniz : ");
        a = input.nextInt();
        if (a<=25){
            System.out.println("Calisan Maasi : "+maas + " Turk Lirasi");
        } else if (a<=31) {
            System.out.println("Calisan Maasi : "+(maas+(a-25)*1000)+ " Turk Lirasi");
        }else {
            System.out.println("Gecersiz Calisma Gun Sayisi Girisi Yaptiniz");
        }
    }
    public static void main(String args[]) {
        maashesaplama();
    }
}
