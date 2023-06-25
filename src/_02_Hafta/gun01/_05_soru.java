package _02_Hafta.gun01;

import java.util.Scanner;

public class _05_soru {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // kullanicinin girecegi 2 sayinin birbirine esit olup olmadigini yazdiriniz

        int n = in.nextInt();
        int m = in.nextInt();

        System.out.println( "esit mi ? "+ (n == m) );
    }
}
