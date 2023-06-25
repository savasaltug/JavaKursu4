package _01_Hafta.gun05;

import java.util.Scanner;

public class _03_Ornek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("adinizi girin:");

        String ad = input.next();

        System.out.println("soyadinizi girin:");
        String soyad= input.next();

        System.out.println("Adiniz " + ad + " Soyadiniz " + soyad);
    }
}
