package _04_Hafta.Gun05._01_Ornek;

public class Kampus {
    public static void main(String[] args) {

        // Bir kampus icin asagidaki ozellikte bilgilerin
        // kaydedilecegi classlari yazdiriniz.
        // Okul: adi, mudurAdi, ucreti(double) -> tip
        // Ogrenci : okulNo, TamAd, okulu -> tip

        // bu sekilde 1 ogrenci tanimlayip butun bilgileri kendiniz
        // atayip yazdiriniz.

        Ogrenci ogr = new Ogrenci();
        ogr.okulNo = 1;
        ogr.tamAd = "savas altug";

        // 1. yontem
        ogr.okulu = new Okul();
        ogr.okulu.adi = "Mehmet Akif Ersoy okulu";
        ogr.okulu.mudurAdi ="Ismet Temur";
        ogr.okulu.ucreti = 50000;

        //2.Yontem
        Okul ok = new Okul();
        ok.adi="Mehmet Akif Ersoy Okulu";
        ok.mudurAdi = "Ismet Temur";
        ok.ucreti = 50000;
        ogr.okulu= ok;

        System.out.println("ogr.okulNo = " + ogr.okulNo);
        System.out.println("ogr.tamAd = " + ogr.tamAd);
        System.out.println("okul adi = " + ogr.okulu.adi);
        System.out.println("mudur adi = " + ogr.okulu.mudurAdi);
        System.out.println("ucreti = " + ogr.okulu.ucreti);
    }
}
