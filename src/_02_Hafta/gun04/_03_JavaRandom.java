package _02_Hafta.gun04;

public class _03_JavaRandom {
    public static void main(String[] args) {
        // soru : o ile 6 (haric) arasinda random sayi ureten programi yazin

        double doubleRandomSayi = Math.random(); // 0.0 - 0.99999 arasi sayi uretiyor.

        // 0 ile 6 arasinda sayi
        int intRandomSayi = (int)( doubleRandomSayi * 6); // 0 - 5.99999 - (int) -> 0-5

        //direkt yontem
        System.out.println((int)(Math.random()*6));
    }
}
