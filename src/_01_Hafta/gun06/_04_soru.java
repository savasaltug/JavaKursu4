package _01_Hafta.gun06;

import java.util.Scanner;

public class _04_soru {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Girilen bir stringin sadece son harfini yazdiriniz.

        String cumle = input.nextLine();
        int uzunluk = cumle.length();
        char sonHarf = cumle.charAt(uzunluk-1);
        System.out.println("sonHarf = " + sonHarf);
        System.out.println("sonHarf="+ cumle.charAt(cumle.length()-1));
    }
}
