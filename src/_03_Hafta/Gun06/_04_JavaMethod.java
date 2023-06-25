package _03_Hafta.Gun06;

import java.util.Scanner;

public class _04_JavaMethod {
    public static void main(String[] args) {
        // kullanicinin girecegi iki sayinin toplamini bir fonksiyonda bulundurup
        //bunun sonucunu main'de yazdiriniz.

        Scanner in = new Scanner(System.in);

        System.out.print("1. sayiyi giriniz = ");
        int sayi1 = in.nextInt();

        System.out.print("2. sayiyi giriniz = ");
        int sayi2 = in.nextInt();

       int sonuc = toplamBul(sayi1,sayi2);
        System.out.println("sonuc = " + sonuc);
    }
    public static int toplamBul( int sayi1, int sayi2){
        return (sayi1+sayi2);
    }



}
