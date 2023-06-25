package _02_Hafta.gun07;

import java.util.Scanner;

public class _01_ForLoop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Girilen bir sayiya(dahil) kadar olan sayilarin carpimini bulunuz.
        // 2.bolum: carpimin degeri 100 u gectiginde islem sonlansin.

        int sayi = in.nextInt();
        int toplam = 1;
        for (int i = 1; i <= sayi; i++) {
            toplam = toplam * i;
            if (toplam > 100){
                System.out.println("break calisti");
                break;
            }

        }
        System.out.println("toplam = " + toplam);
    }
}
