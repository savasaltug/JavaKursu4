package _04_Hafta.Gun03;

import java.util.HashMap;
import java.util.HashSet;

public class _01_JavaMap {
    public static void main(String[] args) {
        // Set -> HashSet, LinkedHashset, TreeSet
        // Map -> HashMap, LinkedHashMap, TreeMap
        // Map = Anahtar + Set -> Anahtarli set

        // anahtar tipi integer, degerinin tipi String olsun
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1001, "Ismet temur");
        hm.put(1002, "Savas Altug");
        hm.put(2001, "Eyupcan Bilgin");
        hm.put(5001, "Hatice Bayrak");
        hm.put(1002, "Talip Yildiz");


        System.out.println("hm = " + hm);
        System.out.println("hm.get(2001) = " + hm.get(2001));

        System.out.println("hm.containsKey(2001) = " + hm.containsKey(2001));
        System.out.println("hm.containsKey(12) = " + hm.containsKey(12));
        System.out.println("hm.containsValue(\"Talip Yildiz\") = " + hm.containsValue("Talip Yildiz"));

        System.out.println("hm.keySet() = " + hm.keySet());
        System.out.println("hm.values() = " + hm.values());

        hm.remove(5001);
        System.out.println("hm = " + hm);

        System.out.println("hm.size() = " + hm.size());

        hm.clear();
        System.out.println("hm = " + hm);
    }
}
