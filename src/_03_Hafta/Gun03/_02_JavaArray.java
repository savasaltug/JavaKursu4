package _03_Hafta.Gun03;

import java.util.Scanner;

public class _02_JavaArray {
    public static void main(String[] args) {
        // 100 elemanli bir diziyi random olarak 100'e kadar olan sayilarla doldurunuz.
        // sonrasinda en buyuk elemani ve indexini bulunuz.

        Scanner in = new Scanner(System.in);

        int[] dizi = new int[100];

        for (int i = 0; i < dizi.length; i++) {
            dizi[i]=(int) (Math.random()*100);

        }
        int enb =0;
        int enbIndex=0;
        for (int i = 0; i < dizi.length; i++) {

            if (dizi[i]>enb) { // dizinin siradaki elemani enb'den buyuk ise enb o olsun
                enb = dizi[i];
                enbIndex = i;
            }


        }
        System.out.println("enb = " + enb);
        System.out.println("enbIndex = " + enbIndex);
    }
}
