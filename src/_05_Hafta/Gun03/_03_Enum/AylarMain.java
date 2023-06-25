package _05_Hafta.Gun03._03_Enum;

public class AylarMain {
    public static void main(String[] args) {
        // AYIN KAC GUN SURDUGUNU METOD GEREKIYOR
        // ayin turkce yazilisi metad gerekiyor
        // ayin gercek sira nosu metod gerekiyor

        // java diyor ki bu sekilde tek bir kelime veya
        // sayi olan degerleri olacaksa, sana bir kolaylik var

        Aylar ay = Aylar.AGUSTOS;
        System.out.println("ay = " + ay);
        System.out.println("ay.ayNo = " + ay.ayNo);
        System.out.println("ay.gunMiktar = " + ay.gunMiktar);
        System.out.println("ay.ayAd = " + ay.ayAd);

        for (Aylar a : Aylar.values()){
            System.out.println(a.ayNo+" - "+a.gunMiktar+" - "+a.ayAd);
        }
    }

}
