package _02_Hafta.gun04;

import java.util.Scanner;

public class _04_JavaRandom {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("uretilecek sayi siniri =");
        int sinir = in.nextInt();
        int tutulanSayi = (int)(Math.random()*(sinir+1));

        System.out.print("tahmininiz =");
        int tahmin = in.nextInt();

        /*if (tutulanSayi == tahmin){
            System.out.println("tebrikler bildiniz");

        }
        else{
            System.out.println("bilemediniz");*/

            System.out.println((tutulanSayi == tahmin) ? "tebrikler bildiniz" : "Bilemediniz");

            System.out.println("tutulanSayi = " + tutulanSayi);


    }
}
