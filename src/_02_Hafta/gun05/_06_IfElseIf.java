package _02_Hafta.gun05;

import java.util.Scanner;

public class _06_IfElseIf {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // iki sayi girilsin, toplama icin T, cikarma icin C, bolma icin B, carpma icin P harflerini alarak
        // istege uygun olan islemi yaptirip sonucu yazdiriniz.

        System.out.println("toplama icin 'T' harfine basin ");
        System.out.println(" cikarma icin ' C' harfine basin");
        System.out.println(" carpma icin 'P' harfine basin");
        System.out.println("bolme icin 'B' harfine basin");
        System.out.print("secimin =");
        String secim = in.next();

        System.out.print("1. sayi =");
        int sayi1 = in.nextInt();

        System.out.print("2. sayi =");
        int sayi2 = in.nextInt();

        if (secim.equalsIgnoreCase("T")){
            System.out.println("toplam ="+ (sayi1+sayi2));

        } else if (secim.equalsIgnoreCase("C")) {
            System.out.println("farki ="+ (sayi1-sayi2));

        } else if (secim.equalsIgnoreCase("P")) {
            System.out.println("carpimi =" +(sayi1*sayi2));

        } else if (secim.equalsIgnoreCase("B")) {
            System.out.println("bolumu =" +  (sayi1/sayi2));


        }else {
            System.out.println("hatali secim");
        }
    }
}
