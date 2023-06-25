package _02_Hafta.gun01;

import java.util.Scanner;

public class _06_soru {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // girilen bir sayinin tek sayi olup olmadigini yazdiriniz.

        int n = in.nextInt();
        System.out.println("sayi tek mi = " + (n%2==1));

    }

}
