package _03_Hafta.Gun03;

import java.util.Scanner;

public class _06_JavaSplitMdou {
    public static void main(String[] args) {
        //Kullanicinin girecegi 02/11/2022 seklindeki tarih bilgisini gun ay yil olarak yazdiriniz.

        Scanner in = new Scanner(System.in);
        System.out.print("tarih giriniz: ");
        String tarih = in.nextLine();

        String[] zamanlar=tarih.split("/");

        for (int i = 0; i < zamanlar.length; i++) {
            System.out.println("zamanlar = " + zamanlar[i]);

        }
        System.out.println("Gun = " + zamanlar[0]);
        System.out.println("Ay = " + zamanlar[1]);
        System.out.println("Yil = " + zamanlar[2]);
    }
}
