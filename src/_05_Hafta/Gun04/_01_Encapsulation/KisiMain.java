package _05_Hafta.Gun04._01_Encapsulation;

public class KisiMain {
    public static void main(String[] args) {
        Kisi kisi1 = new Kisi();
        // kisi1.ad = "savas";
        // kisi1.soyad = "altug";
        // kisi1.yas = /25;

        kisi1.setAd("savas");
        kisi1.setSoyad("altug");
        kisi1.yasAta(-25);

        System.out.println(kisi1.yasVer());

        System.out.println("kisi1 = " + kisi1);

        // degiskene direkt erisimi kapatip
        // bir metod ile korumali veri gonderme ve alma
        // islemine encapsulation denir.
    }

}
