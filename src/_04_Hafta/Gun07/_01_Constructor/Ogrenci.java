package _04_Hafta.Gun07._01_Constructor;

public class Ogrenci {
    int id;
    String ad;
    String soyad;
    int sinifi;

    Ogrenci(){ // yapici metodlar : Constructor metodlar
        System.out.println("nesne olusturuldu");
    }



    Ogrenci(int id, String ad, String soyad, int sinifi){
        this.id=id;
        this.ad=ad;
        this.soyad=soyad;
        this.sinifi=sinifi;

    }
    public Ogrenci(int id, String ad, String soyad){
        this(id,ad,soyad,0);
    }

}
