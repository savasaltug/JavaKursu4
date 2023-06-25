package _01_Hafta.gun06;

import java.util.Scanner;

public class _06_soru {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Adiniz ve Soyadinizi girin");
        String tamAd = input.nextLine();
        char ilkHarf= tamAd.charAt(0);
        int boslukIndex = tamAd.indexOf(" ");
        char soyadIlkHarf = tamAd.charAt(boslukIndex+1);
        System.out.println(ilkHarf+ "."+soyadIlkHarf+".");
    }

}
