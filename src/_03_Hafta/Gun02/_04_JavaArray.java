package _03_Hafta.Gun02;

import java.util.Scanner;

public class _04_JavaArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 5 kisilik bir sinifin notlarini giriniz ve ortalamadan buyuk
        // kac not oldugunu bulunuz ve bunlari yazdiriniz.

        int[] notlar = new int[5];
        int ortalama =0;
        int toplam = 0;

        for (int i = 0; i < notlar.length; i++) {
            System.out.print("notu giriniz: ");
            notlar[i]= in.nextInt();
            toplam = toplam + notlar[i];





            }
        int gecenSayisi=0;
        ortalama = toplam / notlar.length;
        for (int j = 0; j < notlar.length; j++) {
            if (notlar[j] > ortalama){
                System.out.println(notlar[j]);
                gecenSayisi++;

            }
        }
        System.out.println("ortalama = " + ortalama);
        System.out.println("gecenSayisi = " + gecenSayisi);

    }
}
