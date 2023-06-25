package _02_Hafta.gun06;

import java.util.Scanner;

public class _03_WhileLoop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //girilen 20 sayinin toplaminin sonucunu yazdiriniz

        int sayi = in.nextInt();
        int DonguSayisi = 1;
        int toplam = 0;
        while (DonguSayisi<=20){
            toplam = toplam +sayi;
            System.out.println("girilen sayi miktari " + DonguSayisi);
            sayi = in.nextInt();
            DonguSayisi++;


        }
        System.out.println("toplam = " + toplam);

    }
}
