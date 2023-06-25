package _02_Hafta.gun07;

import java.util.Scanner;

public class _03_Continue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // kullanicidan 5 sayi isteyiniz.
        // bu sayilardan 6 ile 10 arasindakiler haric, digerlerini toplasin

        int toplam = 0;

        for (int i = 0; i < 5; i++) {
             int sayi = in.nextInt();
             if (sayi > 6 && sayi <10) {
                 continue;
             }
             toplam= toplam +sayi;


        }
        System.out.println("toplam = " + toplam);
    }
}
