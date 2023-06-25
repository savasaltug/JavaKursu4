package _02_Hafta.gun03;

import java.util.Scanner;

public class _05_IfElse {
    public static void main(String[] args) {
        // otopar ucretlendirmeleri
        // 3 saate kadar 10 tl, 5 saate kadar 15tl, 5 den buyukse 20 tl'dir.
        // kullanicidan kac saat kaldigini alarak ucreti yazdiriniz.

        Scanner in = new Scanner(System.in);

        double saat = in.nextDouble();

        if (saat <=3){
            System.out.println("ucretiniz 10 TL.");
        } else if (saat <= 5 ) {
            System.out.println("ucretiniz 15TL");

        }else {
            System.out.println("Ucretiniz 20 TL");
        }
    }
}
