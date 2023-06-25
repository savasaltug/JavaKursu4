package _03_Hafta.Gun03;

import java.util.Arrays;

public class _05_JavaSplitMetodu {
    public static void main(String[] args) {
        // Splir: bir stringi parcalarina ayirir, verilen kriterlere gore

        String cumle = "Bugun hava oldukca soguk"; // bunu kelimelerine ayirmak istiyoruz
        //Bugun
        // hava
        // oldukca
        // soguk
        String[] kelimeler = cumle.split(" ");
        System.out.println("kelimeler = " + Arrays.toString(kelimeler));

        for (int i = 0; i < kelimeler.length; i++) {
            System.out.println(i+".kelime = " + kelimeler[i]);

            //kisa yazdirma yolu
            //System.out.println("kelimeler = " + Arrays.toString(kelimeler));

        }
    }
}
