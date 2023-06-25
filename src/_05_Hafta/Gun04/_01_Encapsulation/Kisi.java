package _05_Hafta.Gun04._01_Encapsulation;

public class Kisi {
    private String ad; // max 25 karakter olsun
    private String soyad;
    private int yas; // korumaya aldim

    void yasAta(int yas) {
        if (yas > 0 && yas < 150)
            this.yas = yas;
        else
            System.out.println("hatali yas");
    }

    int yasVer() {

        return this.yas;
    }
    void setSoyad(String soyad)
    {
        if (soyad.length() <25)
            this.soyad=soyad;
        else
            System.out.println("hatali soyad");
    }
    String getSoyad()
    {
        return this.soyad;
    }
    void setAd(String ad)
    {
        if (ad.length()<25)
            this.ad=ad;
        else
            System.out.println("hatali ad");
    }
    String getAd()
    {
        return this.ad;
    }

    @Override
    public String toString() {
        return "Kisi{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", yas=" + yas +
                '}';
    }
}
