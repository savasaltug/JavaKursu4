package _01_Hafta.gun06;

import java.util.Scanner;

public class _13_soru {
    public static void main(String[] args) {
        // Girilen bir string'de bosluk karakteri olup olmadigini bulunuz.
        Scanner input = new Scanner(System.in);
        System.out.println("bir string giriniz=");
        String girilen = input.nextLine();

        System.out.println("Bosluk karakteri var mi = " + girilen.contains(" "));

    }
}
