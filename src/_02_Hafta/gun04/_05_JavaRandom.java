package _02_Hafta.gun04;

import java.util.Scanner;

public class _05_JavaRandom {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("min");
        int min = in.nextInt();

        System.out.println("max");
        int max = in.nextInt();

        int belirli_aralikta_uratilen_sayi = (int) (Math.random() * (max-min)) +min;

        System.out.println("belirli_aralikta_uratilen_sayi = " + belirli_aralikta_uratilen_sayi);
    }
}
