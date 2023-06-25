package _05_Hafta.Gun04._03_Encapsulation;

import java.util.ArrayList;

public class Okul {
    private String okulAd;
    private  int kontejan;
    private ArrayList<Ogrenci> ogrenciler=new ArrayList<>();

    public Okul(String okulAd, int kontejan) {

        setOkulAd(okulAd);
        setKontejan(kontejan);
    }

    public String getOkulAd() {
        return okulAd;
    }

    public void setOkulAd(String okulAd) {
        this.okulAd = okulAd;
    }

    public int getKontejan() {
        return kontejan;
    }

    public void setKontejan(int kontejan) {
        this.kontejan = kontejan;
    }

    public ArrayList<Ogrenci> getOgrenciler() {
        return ogrenciler;
    }

    public void setOgrenciler(ArrayList<Ogrenci> ogrenciler) {
        this.ogrenciler = ogrenciler;
    }

    @Override
    public String toString() {
        return "Okul{" +
                "okulAd='" + okulAd + '\'' +
                ", kontejan=" + kontejan +
                ", ogrenciler=" + ogrenciler +
                '}';
    }
}
