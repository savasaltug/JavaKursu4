package _02_Hafta.gun01;

import java.util.Scanner;

public class _07_soru {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // girilen bir cumledeki ilk kelimeyi yazdiriniz

        System.out.println("bir cumle giriniz= ");
        String cumle = in.nextLine();

        int boslukIndex= cumle.indexOf(" ");
        String ilkKelime= cumle.substring(0, boslukIndex);
        System.out.println("ilkKelime = " + ilkKelime);
    }
}
