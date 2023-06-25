package _05_Hafta.Gun07._03_Polymorphism;

public class Kisi {
    private String ad;
    private String soyad;
    private String gorevi;

    public Kisi(String ad, String soyad, String gorevi) {
        setAd(ad);
        setSoyad(soyad);
        setGorevi(gorevi);
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getGorevi() {
        return gorevi;
    }

    public void setGorevi(String gorevi) {
        this.gorevi = gorevi;
    }

    @Override
    public String toString() {
        return "Kisi{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", gorevi='" + gorevi + '\'' +
                '}';
    }
    public static void kimlikYaz(Kisi gelenKisi)
    {
        System.out.println("\n****** Kimlik Belgesi******");
        System.out.println("ad = " + gelenKisi.getAd());
        System.out.println("soyad = " + gelenKisi.getSoyad());
        System.out.println("gorevi = " + gelenKisi.getGorevi());

        if (gelenKisi instanceof Ogrenci)
            System.out.println("subesi: " + ((Ogrenci)gelenKisi).getSube());
        else
        if ((gelenKisi instanceof Calisan))
            System.out.println("departmani: " + ((Calisan)gelenKisi).getDepartman());
    }
}
