package _03_Hafta.Gun03;

import java.util.Arrays;

public class _04_JavaArrayMetodlar {
    public static void main(String[] args) {
        // Arrays.toStringdizi)
        String[] isimler = {"ahmet", "melike", "savas", "simiramist","mert"};
        System.out.println("Arrays.toString(isimler) = " + Arrays.toString(isimler));
        //[ahmet, melike, savas, simiramist, mert]

        //Arrays.sort(isimler)
        Arrays.sort(isimler); // siralama islemi yapildi
        System.out.println("isimler = " +Arrays.toString(isimler) );

        //diziler esit mi?  Arrays.equals(dizi1,dizi2)
        int[] a={1,8,3,54};
        int[] b={1,8,3,54};
        int[] c={1,8,2,54};

        System.out.println("Arrays.equals(a,b) = " + Arrays.equals(a,b));
        System.out.println("Arrays.equals(a,b) = " + Arrays.equals(a,c));

        // arrays.fill-> butun lutucuklara 7 atar
        Arrays.fill(c, 7);
        System.out.println("Arrays.toString(c) = " + Arrays.toString(c));

        //Arrays.binarysearch(rakamlar, 5) -> Sirali dizide aranan elemanin indexini verir
        //aranan eleman birden fazla ise herhangi birini verebilir.
        //esas amaci var mi yok mu kontrolu, var ise INDEXINI verir, yok ise sayi dondurur
        int[] rakamlar={2,7,4,6,5};
        System.out.println("Arrays.toString(rakamlar) = " + Arrays.toString(rakamlar));
        Arrays.sort(rakamlar);
        System.out.println("Arrays.toString(rakamlar) = " + Arrays.toString(rakamlar));
        System.out.println("Arrays.binarySearch(rakamlar, 4) = " + Arrays.binarySearch(rakamlar, 4));

    }
}
