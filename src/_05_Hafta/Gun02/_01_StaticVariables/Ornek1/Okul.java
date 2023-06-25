package _05_Hafta.Gun02._01_StaticVariables.Ornek1;

public class Okul {
    public static void main(String[] args) {



//        Ogrenci ogri=new Ogrenci("ismet”, Yaldaram Ilkokulu");
//        Ogrenci ogr2=new Ogrenci(*Mehnet' aldiram TLkokutu");
//        Ogrenci ogr3=new Ogrenci(“Ayse", "Yald3z","Y2ldaram Itkokulu");
//
//
//
//
//                Ogrenci ogr499=new Ogrenci(“Ugur", "Colak", “Yaldarzm ILkokutu");
//        Ogrenci ogr500=new Ogrenci(*Tugser”, "Bayrak", "Yaldzram Ilkokulu");
//

        Ogrenci ogr1 = new Ogrenci("savas", "Altug");
        System.out.println("ogr1 = " + ogr1);

        Ogrenci.okulAd="Ataturk Ilk Okulu";
        System.out.println("ogr1  tekrar= " + ogr1);

        // ayni verinin cok kez girisi engellendi
        // Ayni verinin hafizada NESNE sayisi kadar tekrarlanmasi

        Ogrenci ogr2 = new Ogrenci("ali", "yildirim");
        System.out.println("ogr2 = " + ogr2);


    }
}
