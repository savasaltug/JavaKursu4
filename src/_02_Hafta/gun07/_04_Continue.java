package _02_Hafta.gun07;

import java.util.Scanner;

public class _04_Continue {
    public static void main(String[] args) {
        // Girilen bir stringin harflerini teker teker ekrana alt alta olacak sekilde yazdiriniz, bosluklari yazmasin.

        Scanner in = new Scanner(System.in);
        System.out.print("bir cumle giriniz: ");
        String text = in.nextLine();
        // text.length -> string uzunlugunu verir
        // text.charAt{5) -> 5 indexli karakteri verir

        for (int i = 0; i < text.length() ; i++) {
            if (text.charAt(i)== ' ') continue; // calistigindaki sonraki satirlar pas gecilir
            System.out.println(text.charAt(i));// index 0 dan baslar
        }

    }
}
