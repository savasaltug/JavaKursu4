package _05_Hafta.Gun04._02_Encapsulation;

public class ArabaMain {
//    Bir araba nesnesi olusturulmak isteniyor. fields(Renk, Model, MotorHacmi, KapiSayisi)
//    Bu nesnenin verilerini OOP kurallarina uygun olarak verip aliniz.
//    Main de 1 tane nesne olusturup bunu kontrol ediniz.



    public static void main(String[] args) {
        Araba araba1 = new Araba("mavi",2030, 2.0, 5);


        Araba araba2 = new Araba("siyah", 2023, 1.6,3);


        System.out.println("araba1 = " + araba1);
        System.out.println("araba2 = " + araba2);
    }
}
