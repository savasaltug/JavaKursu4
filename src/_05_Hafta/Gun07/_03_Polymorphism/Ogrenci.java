package _05_Hafta.Gun07._03_Polymorphism;

public class Ogrenci extends Kisi{

    private String sube;


    public Ogrenci(String ad, String soyad, String gorevi, String sube) {
        super(ad, soyad, gorevi);
        setSube(sube);
    }

    public String getSube() {
        return sube;
    }

    public void setSube(String sube) {
        this.sube = sube;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "sube='" + sube + '\'' +
                "} " + super.toString();
    }
}
