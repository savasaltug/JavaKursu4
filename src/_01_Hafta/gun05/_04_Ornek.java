package _01_Hafta.gun05;

import java.util.Scanner;

public class _04_Ornek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Bir karenin kenarini kullanicidan isteyip cevresini ve alanini bulunuz ve yazdiriniz.
        // cevre = a+a+a+a      ala = a*a

        System.out.println("kenar=");
        int kenar = input.nextInt();
        int alan = kenar*kenar;
        int cevre = kenar+kenar+kenar+kenar;

        System.out.println(kenar*kenar);
        System.out.println(cevre);

        System.out.println("Cevre = " + cevre);
        System.out.println("Alan = " + alan);
        System.out.println("alan=" +((kenar*kenar)));
        System.out.println("cevre="+(4*kenar));
    }
}
