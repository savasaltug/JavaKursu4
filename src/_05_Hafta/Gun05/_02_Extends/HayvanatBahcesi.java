package _05_Hafta.Gun05._02_Extends;

public class HayvanatBahcesi {
//    Bir hayvanat bahgesi icin bir program yazilmak isteniyor.
//    Kediler icin (renk, kilo, cinsi)
//
//    kopekler icin (renk,kilo, cinsi) I
//
//    y1lanlar igin renk, kilo, cinsi, uzunluk)
//
//    ordek icin (renk, kilo, cinsi, kanatAcikligi)
//
//    butun hayvanlarin konustu metodu vardir.(ses cikardi)
    public static void main(String[] args) {
        Kopek kopek1 = new Kopek("beyaz", 50,"kangal");

        System.out.println("kopek1 = " + kopek1);
        kopek1.konustu();

        Kedi kedi1 = new Kedi("siyah", 5,"tekir");
        System.out.println("kedi1 = " + kedi1);
        kedi1.konustu();


        Ordek ordek1 = new Ordek("siyah", 3, "pekin", 80);
        System.out.println("ordek1 = " + ordek1);
        ordek1.konustu();
        Yilan yilan1 = new Yilan("yesil", 15, "cengerekli", 3);
        System.out.println("yilan1 = " + yilan1);
        yilan1.konustu();

    }

}
