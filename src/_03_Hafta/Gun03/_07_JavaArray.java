package _03_Hafta.Gun03;

import java.util.Arrays;

public class _07_JavaArray {
    public static void main(String[] args) {
        // 100 elemanli bir diziyi random (0-100 arasi) doldurduktan sonra,
        // sadece tek elemanlari yeni bir diziye atayin.

        int[] dizi = new int[100];

        // random dolduruyoruz.
        // tek elemanlari yeni diziye atayiniz.
        for (int i = 0; i < dizi.length; i++) {
            dizi[i]=(int)(Math.random()*100);

        }
        System.out.println("dizi= " + Arrays.toString(dizi));


        int[] tekler = new int[100];
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i]%2==1){
                tekler[i]=dizi[i];

            }

        }
        System.out.println("tekler= " + Arrays.toString(tekler));
    }
}
