package _02_Hafta.gun05;

import java.util.Scanner;

public class _09_Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
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

        switch (secim.toUpperCase()){
            case "T" :
                System.out.println("Toplam = " + (sayi1+sayi2)); break;
            case "C" :
                System.out.println("Fark = " + (sayi1-sayi2)); break;
            case "P" :
                System.out.println("Carpma = " + (sayi1*sayi2)); break;
            case "B" :
                System.out.println("Bolme = " + (sayi1/sayi2)); break;
            default:
                System.out.println("Hatali secim"); break;
        }
    }
}
