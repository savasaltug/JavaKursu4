package _05_Hafta.Gun04._03_Encapsulation;

public class Ogrenci {
    private  int ID;
    private String ad;
    private String soyAd;
    private int yas;

    static int sayacID=1;

    public Ogrenci( String ad, String soyAd, int yas) {
        setID(sayacID++);
        setAd(ad);
        setSoyAd(soyAd);
        setYas(yas);
    }



    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyAd() {
        return soyAd;
    }

    public void setSoyAd(String soyAd) {
        this.soyAd = soyAd;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        if (yas <=15)
            this.yas = yas;
        else
            System.out.println("hatali yas");

    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "ID=" + ID +
                ", ad='" + ad + '\'' +
                ", soyAd='" + soyAd + '\'' +
                ", yas=" + yas +
                '}';
    }
}
