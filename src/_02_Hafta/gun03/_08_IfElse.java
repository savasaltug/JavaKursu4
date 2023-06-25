package _02_Hafta.gun03;

import java.util.Scanner;

public class _08_IfElse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // girilen bir sayinin sifir mi, negatif mi, pozitif mi oldugunu Ternary operator ile yazdiriniz.

        System.out.println("sayi giriniz.");
        int sayi = in.nextInt();

        System.out.println(  ( sayi == 0) ? "sifir"  : (sayi > 0 ? "pazitif" : "negatif"));
    }
}
