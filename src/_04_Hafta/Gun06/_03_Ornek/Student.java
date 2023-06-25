package _04_Hafta.Gun06._03_Ornek;

import java.util.ArrayList;

public class Student {
    String name;
    int maxSaat;
    ArrayList<Lesson> dersleri = new ArrayList<>();


    public void dersEkle(Lesson ders){
        int suAnToplamSaat=0;
        for (Lesson d : dersleri)
            suAnToplamSaat+= d.saat;

        if (suAnToplamSaat+ders.saat <= maxSaat)
            dersleri.add(ders);
        else System.out.println(ders.name+": Kredi siniri asildi");
    }

    public void dersleriYazdir(){
        System.out.println("\n**** Transkript ****");
        System.out.println("Sayin "+name);
        System.out.println("Aldiginiz dersler asagidadir.");
        for (Lesson d: dersleri)
            System.out.println(d.name+ " "+d.saat);
    }

    public static void universiteKurallari(){
        System.out.println("uykunu mutlaka al, saglik en onemlisi");
        System.out.println("Her zaman dinc ve dinamik ol ve pozitif ol");
    }
}
