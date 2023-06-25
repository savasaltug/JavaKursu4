package _02_Hafta.gun01;

import java.util.Scanner;

public class _02_soru {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
// girilen 3 basamakli bir sayiyinin basamak degerlerini gosterin

        System.out.println("3 basamakli bir sayi giriniz = ");
        int sayi= in.nextInt();
        // 524 -> 5  2  4  ayri auri atayabileyim

        int birlerBasamagi = sayi%10;
        int onlarBasamagi = (sayi%100)/10;
        int yuzlerBasamagi = sayi /100;

        System.out.println("birlerBasamagi = " + birlerBasamagi);
        System.out.println("onlarBasamagi = " + onlarBasamagi);
        System.out.println("yuzlerBasamagi = " + yuzlerBasamagi);
    }
}
