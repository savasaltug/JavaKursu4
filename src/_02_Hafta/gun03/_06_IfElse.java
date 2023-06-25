package _02_Hafta.gun03;

import java.util.Scanner;

public class _06_IfElse {
    public static void main(String[] args) {
        // kullanicinin girecegi sayinin tek mi cift mi oldugunu yazdiriniz.

        Scanner in = new Scanner(System.in);

        System.out.println("sayi giriniz.");
        int sayi = in.nextInt();
        if (sayi % 2 == 0){
            System.out.println("cift");

        }else{
            System.out.println("tek");
        }

        // tek satirda yazma yontemi
        String sonuc = (sayi % 2 == 0) ? "cift" : "tek"; // sart dogru ise ilk bolum degilse ikinci bolum yazilir.
        System.out.println("sonuc = " + sonuc);
    }
}
