package _01_Hafta.gun07;

public class _01_StringSubstring {
    public static void main(String[] args) {
        // stringin belli bir bolumunu alma islemini yapar.
        //         012345678901234567
        String s1="merhaba arkadaslar";

        String parca1 = s1.substring(3,7); // 3 nolu indexten 7 nolu indexe kadar 7 dahil degil.
        System.out.println("parca1 = " + parca1);

        String parca2= s1.substring(8,15);
        System.out.println("parca2 = " + parca2);

        String parca3 = s1.substring(8); // verilenden baslar sonuna kadar gider.
        System.out.println("parca3 = " + parca3);
    }
}
