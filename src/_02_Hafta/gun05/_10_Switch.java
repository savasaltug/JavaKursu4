package _02_Hafta.gun05;

import java.util.Scanner;

public class _10_Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Girilen bir sayinin onlar basamaginin degerini yazi ile yazdiriniz.
        System.out.print("sayi=");
        int sayi= in.nextInt();
        // 458 -> a bol -. 45 %10 al
        // istedin rakam sonda kalana kadar bol ve her zaman %10 al

        int onlar = (sayi/10)%10;
        switch (onlar){
            case 0: System.out.println("sifir"); break;
            case 1: System.out.println("bir"); break;
            case 2: System.out.println("iki"); break;
            case 3: System.out.println("uc"); break;
            case 4: System.out.println("dort"); break;
            case 5: System.out.println("bes"); break;
            case 6: System.out.println("alti"); break;
            case 7: System.out.println("yedi"); break;
            case 8: System.out.println("sekiz"); break;
            case 9: System.out.println("dokuz"); break;

        }
    }
}
