package org.example;

import java.util.Scanner;
public class personelmaas {
    static int maashesaplama(){
        int maas = 20000 ; //sabit maas
        //Scanner input = new Scanner(System.in);
        int a =27;
        System.out.print("Calisilan gun sayisini giriniz : ");
        //a = input.nextInt();
        if (a<=25){
            return (maas);
        } else if (a<=31) {
           return ((a*1000));
        }
        return maas;
    }
    public static void main(String args[]) {
        maashesaplama();
    }
}
