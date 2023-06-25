package _05_Hafta.Gun04._03_Encapsulation;

import java.util.Scanner;

public class OkulMain {
    public static void main(String[] args) {
        Scanner inInt = new Scanner(System.in);
        Scanner inStr = new Scanner(System.in);


        Okul yeniOkul = new Okul("kabatas Okulu",3);

        do{
            System.out.print("Ogrenci Adi= "); String ad=inStr.nextLine();
            System.out.print("Ogrenci Soyadi= "); String soyad=inStr.nextLine();
            System.out.print("Ogrenci Yasi= " );int yas = inInt.nextInt();

            if (yas < 15)
            {
                Ogrenci ogr = new Ogrenci(ad,soyad,yas);
                yeniOkul.getOgrenciler().add(ogr);
            }
            else
            {
                System.out.println("Ogrenci yasi okul icin uygun degil");
            }

        }while(yeniOkul.getOgrenciler().size()< yeniOkul.getKontejan());
        System.out.println("Ogrenciler = " + yeniOkul.getOgrenciler());





    }
}
