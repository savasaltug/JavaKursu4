package _05_Hafta.Gun02._02_FinalVariables.Ornek2;

import java.util.Scanner;

public class Soru {
//    Sabitler isimli bir Class da sabit bir sekilde
//
//    bir gundeki saat sayisi, bir saatdaki dakika sayisi ve
//    bir dakikadaki saniye sayisini tanimlayiniz.
//
//    mainde kullanicidan gun, saat, dakika alarak toplam
//    saniyeyi bulunuz.

    public static void main(String[] args) {

        int gun=0;
        int saat = 0;
        int dakika=0;

        Scanner oku = new Scanner(System.in);
        System.out.println("Gun= "); gun= oku.nextInt();
        System.out.println("Saat= "); saat= oku.nextInt();
        System.out.println("Dakika= "); dakika= oku.nextInt();

        int toplamSaniye=
                gun*Sabitler.birGundekiSaatSayisi
                *Sabitler.birSaattekiDakikaSayisi
                *Sabitler.birDakikadakiSaniyeSayisi
                +
                saat
                *Sabitler.birSaattekiDakikaSayisi
                *Sabitler.birDakikadakiSaniyeSayisi
                +
                dakika
                *Sabitler.birDakikadakiSaniyeSayisi;

        System.out.println("toplamSaniye = " + toplamSaniye);

        // 2.Yontem
        System.out.println("toplamSaniye = " + Sabitler.hesapla(gun,saat,dakika));

    }

}
