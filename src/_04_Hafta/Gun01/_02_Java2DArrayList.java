package _04_Hafta.Gun01;

import java.util.ArrayList;

public class _02_Java2DArrayList {
    public static void main(String[] args) {

        int sayi = 5; // tek bir rakam tuta bilen bir degisken
        int[] dizi = new int[20]; // 20 adet sayi saklayabilen bir degisken, uzunlugu sabit
        int [][] tablo = new int[20][2]; //20*2'lik sayi saklayabilen bir degisken, uzunlugu sabit


        ArrayList<Integer> liste = new ArrayList<>(); // istenildigi kadar sayi eklenebilen, uzunlugu degisken
        // *******************************************

        // bir sinif bu sinifta 20 kisi var ve bunlarin 3 dersi olsun. ogrencilerin bu 3 derse ait notlarini
        // nasil bir degiskende saklayabilirim?
        ArrayList<Integer> matNotlari = new ArrayList<>();
        ArrayList<Integer> fizNotlari = new ArrayList<>();
        ArrayList<Integer> kimNotlari = new ArrayList<>();

        matNotlari.add(50);
        matNotlari.add(70);
        matNotlari.add(80);

        fizNotlari.add(30);
        fizNotlari.add(40);

        kimNotlari.add(60);
        kimNotlari.add(70);
        kimNotlari.add(80);
        kimNotlari.add(90);

        // Arraylist'in Arraylisti'ini yaparim
        ArrayList<  ArrayList<Integer>  > notlarListesi= new ArrayList<>(); // listelerin listesi
        notlarListesi.add(matNotlari);
        notlarListesi.add(fizNotlari);
        notlarListesi.add(kimNotlari);

        notlarListesi.get(0); // -> matNotlari
        int matBirinciNot = notlarListesi.get(0).get(0); // mat notlarinin olkini aldim

        System.out.println("matBirinciNot = " + matBirinciNot);
        System.out.println("notlarListesi.get(0) = " + notlarListesi.get(0));
        System.out.println("notlarListesi.get(1) = " + notlarListesi.get(1));
        System.out.println("notlarListesi.get(2) = " + notlarListesi.get(2));

        // yukaridakinin yerine bir for dongusu nasil kullaniriz
        for (int i = 0; i < notlarListesi.size(); i++) {
            System.out.println("notlarListesi.get("+i+") = " + notlarListesi.get(i));

        }
        // ******* satir sutun yazdirma ********
        for (int i = 0; i < notlarListesi.size(); i++) {

            for (int j = 0; j < notlarListesi.get(i).size(); j++) { // notlar[i].length
                System.out.print(notlarListesi.get(i).get(j)+"\t"); // notlar[i][j]

            }
            System.out.println();

        }




    }
}
