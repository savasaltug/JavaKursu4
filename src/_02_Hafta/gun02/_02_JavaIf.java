package _02_Hafta.gun02;

import java.util.Scanner;

public class _02_JavaIf {
    public static void main(String[] args) {
        // Girilen bir sayinin negatif mi pozitif mi oldugunu yazdiriniz.
        // sifir ise sifir yazdiriniz.
        Scanner in = new Scanner(System.in);

        System.out.println("Bir sayi giriniz");
        int n = in.nextInt();
        if (n > 0){
            System.out.println("Bu sayi pozitif bir sayidir. ");
        } else if (n<0) {
            System.out.println("bu sayi negatif bir sayidir. ");

        }else
            System.out.println("bu sayi sifirdir");
    }
}
