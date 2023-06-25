package _03_Hafta.Gun07;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class _01_ArrayList {
    public static void main(String[] args) {
        // dizi, array :  boyut sayisi belli, sonradan degistirilemez
        int[] dizi = new int[5]; // Array 5 elemanli ve boyutu sonradan degistirilemiyor

        // Boyutu dinamik olsun, eleman ekledikce uzasin, sildikce kisalsin
        // Arraylist : boyutunu basta vermene bile gerek yok, boyutu baslangicta 0,
        // eleman ekledikce artar, sildikce kisalir.

        ArrayList<Integer> integerList = new ArrayList<>();
        ArrayList<String> stringList = new ArrayList<>();
        ArrayList<Double> doubleList = new ArrayList<>();

        ArrayList<String> isimler = new ArrayList<>();
        System.out.println("isimler = " + isimler);

        isimler.add("ahmet"); //  uzunluk a
        isimler.add("metin"); // uzunluk 2
        isimler.add("hacer"); //  uzunluk 3
        isimler.add("aynur"); // uzunluk 4

        System.out.println("isimler = " + isimler);
        System.out.println("isimler.size() = " + isimler.size());

        isimler.add(1, "muhammed"); // verilen index'e ekliyor, digerlerini 1 kaydiriyor
        System.out.println("isimler = " + isimler);

        isimler.set(1,"zafer"); // verilen indexdeki elemani degistirir
        System.out.println("isimler = " + isimler);

        boolean varMi = isimler.contains("metin"); // var mi
        System.out.println("varMi = " + varMi); // true

        isimler.remove("metin"); // degere gore siler
        System.out.println("isimler = " + isimler);

        isimler.remove(1); // rakam verildiginde index kabul ediyor ve ona gore siliyor
        System.out.println("isimler = " + isimler);

        int indexOfaynur= isimler.indexOf("aynur");
        System.out.println("indexOfAynur = " + indexOfaynur);

        String ilkEleman = isimler.get(0); // verilen indexdeki degeri verir
        System.out.println("ilkEleman = " + ilkEleman);

        isimler.clear(); // her seyi temizliyor
        System.out.println("isimler = " + isimler);






    }
}
