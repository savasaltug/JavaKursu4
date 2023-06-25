package _04_Hafta.Gun02;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class _5_Soru {
    public static void main(String[] args) {
        // 10 elemanli bir diziyi random ( 10 dahil ) doldurunuz
        // doldurduktan sonra tekrarli degerleri almayacak sekilde yeni bir diziye atiniz.

        Integer[] dizi = new Integer[10];
        for (int i = 0; i < dizi.length; i++) {
            dizi[i]= (int) (Math.random()*11);
        }
        System.out.println("dizi = " + Arrays.toString(dizi));

        //1. Yontem
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < dizi.length; i++) {
            hs.add(dizi[i]);
        }
        System.out.println("hs = " + hs);

        //2.Yontem
        HashSet<Integer> hs2 = new HashSet<>( Arrays.asList(dizi));
        System.out.println("hs2 = " + hs2);

        //3. yontem
        HashSet<Integer> hs3 = new HashSet<>();
        Collections.addAll(hs3,dizi);
        System.out.println("hs3 = " + hs3);
    }
}
