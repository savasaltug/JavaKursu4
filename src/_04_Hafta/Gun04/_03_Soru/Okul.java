package _04_Hafta.Gun04._03_Soru;



import java.util.ArrayList;
import java.util.Scanner;

public class Okul {
    public static void main(String[] args) {
        Scanner inInt = new Scanner(System.in);
        Scanner inStr = new Scanner(System.in);
        ArrayList<Ogrenci> snf= new ArrayList<>();

        for (int i = 0; i < 3; i++) {

            Ogrenci ogr1 = new Ogrenci();
            System.out.print("Ogrencinin adi = "); ogr1.adi = inStr.nextLine();
            System.out.print("Ogrencinin Soyadi = "); ogr1.soyadi = inStr.nextLine();
            System.out.print("Ogrencinin sinifi = "); ogr1.sinif = inInt.nextInt();
            System.out.print("Ogrencinin Adresi = "); ogr1.adres = inStr.nextLine();

            snf.add(ogr1);
        }

        for (Ogrenci ogr : snf){
            System.out.println("ogr.adi = " + ogr.adi);
            System.out.println("ogr.soyadi = " + ogr.soyadi);
            System.out.println("ogr.sinif = " + ogr.sinif);
            System.out.println("ogr.adres = " + ogr.adres);
        }
    }

}
