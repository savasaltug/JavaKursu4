package _01_Hafta.gun04;

public class _02_NarrowingCasting {
    public static void main(String[] args) {

        double oran = 3.2;
        int sayi = 5;

        sayi = (int)oran;
        System.out.println("sayi = " + sayi); // 3

        long genelToplam = 3705654654654654L;

        sayi = (int)genelToplam;
        System.out.println("sayi = " + sayi);


    }

}
