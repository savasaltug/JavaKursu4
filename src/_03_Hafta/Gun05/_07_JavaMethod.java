package _03_Hafta.Gun05;

import java.util.Scanner;

public class _07_JavaMethod {
    public static void main(String[] args) {
        tekMiCiftMi(55);
        tekMiCiftMi(60);
        // kullanicidan sayi alarak onu tek mi cift mi yazdiralim
        tekMiCiftMiOku();


    }

    public static void tekMiCiftMi(int sayi) {
        if (sayi%2 !=0)
            System.out.println("tek");
        else
            System.out.println("cift");
    }
    public static void tekMiCiftMiOku() {
        Scanner in =new Scanner(System.in);
        System.out.println("sayi giriniz=");
        int sayi = in.nextInt();

        tekMiCiftMi(sayi);
    }


}
