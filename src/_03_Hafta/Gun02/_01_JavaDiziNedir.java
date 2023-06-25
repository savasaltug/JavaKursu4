package _03_Hafta.Gun02;

import java.util.Scanner;

public class _01_JavaDiziNedir {
    public static void main(String[] args) {
        // int [] notlar = new int [100] -> 100 tane not girebilecegin int tipindde bir degisken demek

        int not = 0;
        int[] notlar = new int[100];

        notlar[0]=60; // 0. kutudaki deger 60 ogrNot1
        notlar[1]=70; // 1. kutudaki deger 70
        //...
        //...
        notlar[99]=80; // 99. kutudaki deger 80
        System.out.println("notlar[0] = " + notlar[0]);

        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 100; i++) {
            System.out.println("not giriniz = ");
            notlar[i] = in.nextInt();

        }
        for (int i = 0; i < 100; i++) {
            System.out.println(notlar[i]);

        }
    }
}
