package _03_Hafta.Gun02;

import java.util.Scanner;
// kullanicidan alacaginiz 7 sayiyi aldiktan sonra
// kac tanesinin ortalamadan buyuk ve tek oldugunu bulunuz
public class _05_JavaArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] notlar = new int[7];
        int ortalama = 0;
        int toplam = 0;

        for (int i = 0; i < notlar.length; i++) {
            System.out.print("notu giriniz: ");
            notlar[i] = in.nextInt();
            toplam = toplam + notlar[i];


        }
        int istenenSayi=0;
        ortalama = toplam / notlar.length;
        for (int j = 0; j < notlar.length; j++) {
            if (notlar[j] > ortalama && notlar[j]%2!=0){
                System.out.println(notlar[j]);
                istenenSayi++;

            }
        }
        System.out.println("ortalama = " + ortalama);
        System.out.println("istenenSayi = " + istenenSayi);
    }
}