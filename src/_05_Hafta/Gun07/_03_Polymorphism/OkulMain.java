package _05_Hafta.Gun07._03_Polymorphism;

public class OkulMain {
    public static void main(String[] args) {
        Ogrenci ogr= new Ogrenci("savas", "altug", "ogrenci", "11B");
        Calisan cal= new Calisan("ali", "yilmaz","yazilim", "BIM");

        Kisi.kimlikYaz(ogr);
        Kisi.kimlikYaz(cal);
    }
}
