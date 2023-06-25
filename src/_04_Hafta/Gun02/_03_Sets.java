package _04_Hafta.Gun02;

import java.util.HashSet;
import java.util.Iterator;

public class _03_Sets {
    public static void main(String[] args) {
        HashSet<String> renkler = new HashSet<>();
        renkler.add("Red");
        renkler.add("Green");
        renkler.add("Blue");
        renkler.add("Red");
        renkler.add("RED");

        // ekrana yazdirma
        System.out.println("renkler = " + renkler);

        //Ekrana tek tek nasil yazdiririm, foreach kullanildi
        for (String eleman:renkler) { // sira garanti degil
            System.out.println("eleman = " + eleman);
        }
//        foreach ile ilgili ornek olsun diye eklendi
//        int[] dizi={34,5,6,7,8,89,899,77};
//        for (int sayi : dizi){
//            System.out.println("sayi = " + sayi);
//        }

        Iterator gosterge = renkler.iterator();
        
        while ( gosterge.hasNext()){
            System.out.println("gosterge.next() = " + gosterge.next());
        }



    }
}
