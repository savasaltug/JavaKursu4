package _04_Hafta.Gun03;

import java.util.HashMap;
import java.util.Map;

public class _02_JavaMap {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1001, "Ismet temur");
        hm.put(1002, "Savas Altug");
        hm.put(2001, "Eyupcan Bilgin");
        hm.put(5001, "Hatice Bayrak");
        hm.put(1002, "Talip Yildiz");
        System.out.println("hm = " + hm);

        System.out.println("hm.keySet() = " + hm.keySet());
        System.out.println("hm.values() = " + hm.values());

        for (Integer oda : hm.keySet()){
            System.out.println("oda = " + oda);
        }
        System.out.println();

        for (String value : hm.values()){
            System.out.println(value+ "\t");
        }
        for (Map.Entry<Integer, String> kv: hm.entrySet()){
            System.out.println(kv.getKey()+ " - " +kv.getValue());
        }


    }
}
