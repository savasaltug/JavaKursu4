package _04_Hafta.Gun03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class _03_JavaMap {
    public static void main(String[] args) {
        // bir kartvizit uygulamasini 2 kisi icin yapiniz

        HashMap<String, String> uKartVizit = new HashMap<>();
        uKartVizit.put("isim", "Ugur Yilmaz");
        uKartVizit.put("email", "ugur@gmail.com");
        uKartVizit.put("adres", "cekmekoy/Istanbul");
        uKartVizit.put("telefon", "05447153215");

        System.out.println("uKartVizit.get(isim) = " + uKartVizit.get("isim"));
        System.out.println("uKartVizit.get(telefon) = " + uKartVizit.get("telefon"));

        HashMap<String, String> aKartVizit = new HashMap<>();
        aKartVizit.put("isim", "Ayse Bayrak");
        aKartVizit.put("email", "ayse@gmail.com");
        aKartVizit.put("adres", "sisli/Istanbul");
        aKartVizit.put("telefon", "05354567812");

        HashMap<String, HashMap<String, String>> kartvizitler = new HashMap<>();

        kartvizitler.put("Ugur", uKartVizit);
        kartvizitler.put("Ayse", aKartVizit);

        System.out.println("kartvizitler.get(ugur) = " + kartvizitler.get("Ugur"));
        System.out.println("kartvizitler.get(ayse) = " + kartvizitler.get("Ayse"));

        System.out.println("Aysenin adresi = " + kartvizitler.get("Ayse").get("adres"));


        for (Map.Entry<String, HashMap<String, String>> kv: kartvizitler.entrySet()){
            System.out.println("emailler = " + kv.getValue().get("email"));
        }
    }
}
