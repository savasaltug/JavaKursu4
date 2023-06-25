package _01_Hafta.gun07;

import java.util.Scanner;

public class _02_soru {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Girilen bir ad soyadin (tam ad) adini ve soyadini ayri, ayri yazdiriniz.

        System.out.print("Adiniz ve soyadiniz=");
        String tamAd= input.nextLine();

        // ismet temur -. boslugun indexini bulurum buna gore  ayiririm.
        int boslukindex= tamAd.indexOf(" ");
        String ad= tamAd.substring(0,boslukindex);// ismet
        String soyad=tamAd.substring(boslukindex+1); //temur
        System.out.println("ad = " + ad);
        System.out.println("soyad = " + soyad);
    }
}
