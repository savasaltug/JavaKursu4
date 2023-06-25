package _03_Hafta.Gun03;

public class _03_JavaArray {
    public static void main(String[] args) {
        // 100 Elemanli bir diziyi random olarak 100e kadar olan sayilarla doldurunuz.
        // sonrasinda tek ve cift eleman sayilarini bulunuz.

        int[] dizi = new int[100];

        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = (int) (Math.random()*100);

        }
        int tekSayi=0;
        int ciftSayi=0;
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i]%2==1){
                tekSayi++;
            }
            else {
                ciftSayi++;
            }


        }
        System.out.println("tekSayi = " + tekSayi);
        System.out.println("ciftSayi = " + ciftSayi);
    }
}
