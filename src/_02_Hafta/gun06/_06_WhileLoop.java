package _02_Hafta.gun06;

import java.util.Scanner;

public class _06_WhileLoop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // girilen bir sayiya kadar olan sayilarin sadece tek olanlarinin toplamini bulunuz.
        System.out.print("sayiyi giriniz:");
        int sayi = in.nextInt();
        int toplam = 0;
        int sayac = 0;

        while (sayac < sayi){
            if (sayac%2 == 1){
                toplam = toplam+sayac;

            }
            sayac++;
        }
        System.out.println("toplam = " + toplam);
    }
}
