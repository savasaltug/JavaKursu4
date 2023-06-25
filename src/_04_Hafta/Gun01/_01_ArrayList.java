package _04_Hafta.Gun01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class _01_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> sayilar = new ArrayList<>();
        sayilar.add(50);
        sayilar.add(5);
        sayilar.add(15);
        sayilar.add(98);
        sayilar.add(65465);
        sayilar.add(532);

        System.out.println("sayilar = " + sayilar);

        //siralama islemi
        Collections.sort(sayilar);
        System.out.println("sayilar = " + sayilar);

        // Tersine cevir
        Collections.reverse(sayilar);
        System.out.println("sayilar = " + sayilar);

        //Max ve min eleman bulma
        System.out.println("max() = " + Collections.max(sayilar));
        System.out.println("max() = " + Collections.min(sayilar));

        // Butun elemanlari set etme
        Collections.fill(sayilar,0);
        System.out.println("sayilar = " + sayilar);

        // replace
        Collections.replaceAll(sayilar,0,5);

        // tanimlarken deger atama
        int[] dizi={2,3,4,5};
        ArrayList<Integer> liste = new ArrayList<>(Arrays.asList(3,4,5,6));
        System.out.println("liste = " + liste);
        ArrayList<String> strliste = new ArrayList<>(Arrays.asList("ahmet", "mehmet", "busra", "roman"));
        System.out.println("strliste = " + strliste);

        ArrayList<Integer> liste2 = new ArrayList<>();
        Collections.addAll(liste2, 2,3,4,5,6,67);
        System.out.println("liste2 = " + liste2);

        // diziyi direkt Arraylist'e nasil atarim.
        Integer[] dizi2={2,3,4,5};
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(dizi2));
        System.out.println("list3 = " + list3);

    }
}
