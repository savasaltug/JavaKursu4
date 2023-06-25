package _04_Hafta.Gun02;

import java.util.ArrayList;
import java.util.HashSet;

public class _01_Hashset {
    public static void main(String[] args) {
        int sayi = 5; // tek bir rakam tuta bilen bir degisken
        int[] dizi = new int[20]; // 20 adet sayi saklayabilen bir degisken, uzunlugu sabit
        int [][] tablo = new int[3][20]; //hafizada 60 sayi saklayabilen bir degisken,3*20 seklinde: uzunlugu sabit

        // dizi lazim, ama boyutu ekledikce artsin, sildikce azalsin
        ArrayList<Integer> liste = new ArrayList<>(); // istenildigi kadar sayi eklenebilen, uzunlugu degisken
        ArrayList<  ArrayList<Integer>  > listelerinListesi= new ArrayList<>(); // 2 boyutlu,2 boyutu da degisken

        //******************************************************

        // HashSet -> sen ekledikce kendi belirledigi siraya gore elemanlari saklar ve tekrar eden degerleri eklemez
        //TreeSet -> sen ekledikce onlari her zaman SIRALI tutar
        // bunlarin ortak ozelligi HIC TERKRAR DEGER BULUNDURMAZ.


        HashSet<Integer> hs1= new HashSet<>();
        hs1.add(1);
        hs1.add(5);
        hs1.add(10);
        hs1.add(1);
        hs1.add(122);
        boolean eklendiMi= hs1.add(8);
        boolean tekrarEklendiMi= hs1.add(8);
        hs1.add(35);
        hs1.add(122);
        hs1.add(10);
        hs1.add(5);

        System.out.println("eklendiMi = " + eklendiMi);
        System.out.println("tekrarEklendiMi = " + tekrarEklendiMi);
        System.out.println("hs1 = " + hs1);




    }

}
