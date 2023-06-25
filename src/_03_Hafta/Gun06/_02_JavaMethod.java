package _03_Hafta.Gun06;

import java.util.Scanner;

public class _02_JavaMethod {
    public static void main(String[] args) {
        //kullanicinin girecegi 2 sayidan buyuk olani bulma islemini bir metodda yaptiktan sonra main'de yazdiriniz.

        Scanner in = new Scanner(System.in);

        System.out.print("1. sayi= ");
        int sayi1 = in.nextInt();

        System.out.print("2. sayi= ");
        int sayi2 = in.nextInt();

        int anb = enbBul(sayi1,sayi2);
        System.out.println("anb = " + anb);
    }

    public static int enbBul(int s1, int s2){
        //1.yontem
        int donecek;
        if (s1 > s2)
            donecek = s1;
        else
            donecek = s2;
        return donecek;

        //2. yontem
        // return s1 > s2 ? s1 : s2;

        //3.yontem
        // if (s1 > s2)
        // return s1;
        //else
        //return s2;
    }
}
