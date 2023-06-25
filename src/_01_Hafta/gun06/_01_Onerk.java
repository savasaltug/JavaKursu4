package _01_Hafta.gun06;

import java.util.Scanner;

public class _01_Onerk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Kullanicidan Cadde, Sokak, PostaKdou(int) ve ulke seklinde adres bilgisi alarak yazdiriniz,

        System.out.println("cadde=");
        String cadde = input.nextLine();
        System.out.println("sokak=");
        String sokak = input.nextLine();

        Scanner inputInt = new Scanner(System.in);
        System.out.println("posta kodu=");
        int postaKodu = inputInt.nextInt();
        System.out.println("ulke=");
        String ulke = input.nextLine();


        System.out.println("cadde = " + cadde);
        System.out.println("sokak = " + sokak);
        System.out.println("postaKodu = " + postaKodu);
        System.out.println("ulke = " + ulke);
    }
}
