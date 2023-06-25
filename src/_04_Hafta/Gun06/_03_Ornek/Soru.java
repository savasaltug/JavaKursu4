package _04_Hafta.Gun06._03_Ornek;

public class Soru {
    // Bir universitede ogrencilere ders kaydi yapilacaktir.
    //1- Lesson: fields: name, saat(1-10 arasinda deger aliyor).
    //2- Student: fields : name, maxSaat, dersleri adinda derslerini listesini tutacak bir liste.
    //3- 3 adet ders olusturunuz.
    //4- 1 adet ogrenci tanimlayiniz alabilecegini maxCredit(maxSaat) 10 olsun.
    //5- Bu ogrencinin ders listesine acilmis derslerini ekleyiniz.
    //      ders eklerken max alabilecegi Saati doldu seklinde.
    //6- Universite kurallarini yazdiran 2 maddeliik bir not yazdiran metod ekleyiniz.
    //7- Bu kurallari en basta yazdiriniz.

    public static void main(String[] args) {

        Student.universiteKurallari();

        Lesson ders1 = new Lesson();
        ders1.name = "Algoritma";
        ders1.saat=4;

        Lesson ders2=new Lesson();
        ders2.name = "Java";
        ders2.saat = 4;

        Lesson ders3 = new Lesson();
        ders3.name = "Test Tools";
        ders3.saat= 3;

        Student ogr1 = new Student();
        ogr1.name="savas";
        ogr1.maxSaat=10;
        ogr1.dersEkle(ders1);
        ogr1.dersEkle(ders2);
        ogr1.dersEkle(ders3);
        ogr1.dersleriYazdir();


    }

}
