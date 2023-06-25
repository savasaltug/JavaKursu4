package _03_Hafta.Gun06;

import java.util.Scanner;

public class _03_JavaMethod {
    public static void main(String[] args) {
        // kullanicinin girecegi bir sayiya kadar olan sayilarin carpimini (faktoriyel)
        // bir fonksiyonda buldurup, bunun sonucunu mainde tek mi cift mi oldugunu yazdiriniz.

        Scanner in = new Scanner(System.in);

        System.out.print("bir sayi giriniz = ");
        int sayi = in.nextInt();

        int carpim = faktoriyel(sayi);
        System.out.println("carpim = " + carpim);

        if (carpim%2 == 0)
            System.out.println("cift");

        else
            System.out.println("tek");
    }
    public static int faktoriyel(int sayi){
        int carpim =1;
        for (int i = 1; i < sayi; i++) {
            carpim = carpim*i;

        }
        return carpim;
    }

}
