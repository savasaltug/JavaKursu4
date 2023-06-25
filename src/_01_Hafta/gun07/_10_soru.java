package _01_Hafta.gun07;

import java.util.Scanner;

public class _10_soru {
    public static void main(String[] args) {
        // Grilen bir stringdeki nokta sayisini bulunuz
        // ornegin 01.02.20 bu stringde kac tane nokta vardir?

        Scanner in = new Scanner(System.in);
        System.out.println("lutfen bilgi giriniz=");
        String girilen = in.nextLine();

        int uzunluk1 = girilen.length();
        girilen = girilen.replace(".", "");
        int uzunluk2 = girilen.length();

        int noktaSayisi= uzunluk1-uzunluk2;
        System.out.println("noktaSayisi = " + noktaSayisi);
    }
}
