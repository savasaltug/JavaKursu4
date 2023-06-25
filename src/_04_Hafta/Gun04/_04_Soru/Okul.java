package _04_Hafta.Gun04._04_Soru;

import java.util.ArrayList;
import java.util.Scanner;

public class Okul {
    public static void main(String[] args) {
        Scanner inStr = new Scanner(System.in);
        Scanner inInt = new Scanner(System.in);

        ArrayList<Ogrenci> snf = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            Ogrenci ogr = new Ogrenci();

            System.out.println("okul No= ");ogr.okluNo=inInt.nextInt();
            System.out.println("Tam Adi= ");ogr.tamAdi=inStr.nextLine();
            System.out.println("Notu= ");ogr.notu=inInt.nextInt();

            snf.add(ogr);
        }
        bilgileriYazdir(snf);
        ortalamaYaz(snf);
        
    }
    public static void bilgileriYazdir( ArrayList<Ogrenci> snf){
        for (Ogrenci ogr : snf){
            System.out.println("ogr.okluNo = " + ogr.okluNo);
            System.out.println("ogr.tamAdi = " + ogr.tamAdi);
            System.out.println("ogr.notu = " + ogr.notu);
        }
    }
    public static void ortalamaYaz( ArrayList<Ogrenci> snf){
        int toplam = 0;
        for (Ogrenci ogr : snf){
            toplam+= ogr.notu;
        }
        System.out.println("ort = " + (toplam/ snf.size()));
    }
}
