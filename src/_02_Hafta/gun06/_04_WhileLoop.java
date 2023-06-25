package _02_Hafta.gun06;

import java.util.Scanner;

public class _04_WhileLoop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // girilen 5 sayidan sadece pozitif olanlarin toplamini bulunuz.

        int toplam = 0;
        int sayac = 1;

        while (sayac<=5){
            System.out.print(sayac + ". sayiyi girin:");
            int sayi = in.nextInt();
            sayac++;
            if (sayi >= 0){
                toplam= toplam + sayi;

            }
        }
        System.out.println("toplam = " + toplam);

    }
}
