package _03_Hafta.Gun05;

import java.util.Arrays;
import java.util.Scanner;

public class _09_JavaMethod {
    public static void main(String[] args) {
        // kullanicidan 5 elemanli bir diziyi doldurduktan sonra,
        // dizinin en kucuk, en buyuk ve ortalamasini ayri fonsiyonlarda bulup yazdiriniz

        Scanner in = new Scanner(System.in);
        int dizi[]= new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println(i+ ".sayi = ");
            dizi[i]= in.nextInt();

        }
        System.out.println(Arrays.toString(dizi));
        enKcukYaz(dizi);
        enBuyukYaz(dizi);
        ortalamaYaz(dizi);
    }

    public static void enKcukYaz(int[] sayilar){
        Arrays.sort(sayilar);
        System.out.println("en kucuk sayi = " + sayilar[0]);
    }
    public static void enBuyukYaz(int[] sayilar){
        Arrays.sort(sayilar);
        System.out.println("en buyuk sayi = " + sayilar[sayilar.length-1]);
    }
    public static void ortalamaYaz(int[] sayilar){

        int toplam = 0;

        for (int i = 0; i < sayilar.length ; i++) {

            toplam = toplam +i;


        }
        int ortalama = toplam/ (sayilar.length+1);
        System.out.println("ortalama = " + ortalama);
    }
}
