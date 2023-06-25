package _02_Hafta.gun06;

import java.util.Scanner;

public class _07_DoWhileLoop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // kullanici 0 degeri girene kadar, girdigi sayilarin toplamini bulunuz.
        int sayi;
        int toplam=0;
        do {
            System.out.print("sayi giriniz=");
            sayi = in.nextInt();
            toplam = toplam +sayi;

        }while (sayi !=0);
        System.out.println("toplam = " + toplam);

    }
}
