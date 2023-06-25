package _02_Hafta.gun06;

import java.util.Scanner;

public class _05_WhileLoop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // girilen bir sayiya kadar (girilen sayi dahil) olan sayilarin toplamini bularak yazdiriniz.

        System.out.print("sayi giriniz=");
        int sayi = in.nextInt();
        int toplam = 0;
        int sayac = 0;

        while (sayac<= sayi){
            toplam = toplam+sayac;
            sayac++;
        }
        System.out.println("toplam = " + toplam);
    }
}
