package _02_Hafta.gun03;

import java.util.Scanner;

public class _07_IfElse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("sayi giriniz.");
        int sayi = in.nextInt();

        System.out.println(  (sayi > 50) ? "1" : "0");
    }
}
