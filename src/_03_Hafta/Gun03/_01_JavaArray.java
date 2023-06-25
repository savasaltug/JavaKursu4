package _03_Hafta.Gun03;

import java.util.Scanner;

public class _01_JavaArray {
    public static void main(String[] args) {
        // 50 elemanli bir dizi tanimlayiniz, 10 a kadar olan sayilardan random atayarak doldurunuz.
        // sonrasinda ayri bir dongu ile tek olanlara1, cift olanlara 2 atayiniz yazdiriniz.

        Scanner in = new Scanner(System.in);
        int[] dizi = new int[50];

        for (int i = 0; i < dizi.length; i++) { // 0-49 dahil arasi
            dizi[i]=(int)(Math.random()*10); // 10'a kadar olan sayilardan random atayarak doldurunuz
        }
        for (int i = 0; i < dizi.length; i++) { // kontrol icin yazdik
            System.out.println(i+".kutu= "+dizi[i]);

        }
        for (int i = 0; i < dizi.length; i++) { // sonrasinda ayri bir dongu
            if (dizi[i]%2==1)
                dizi[i] = 1; // tek olanlara 1
            else dizi[i]=2; //cift olanlara 2

        }
        System.out.println("*************************************");
        for (int i = 0; i < dizi.length; i++) { // kontrol icin yazdik
            System.out.println(i+".sati= "+dizi[i]);

        }
    }
}
