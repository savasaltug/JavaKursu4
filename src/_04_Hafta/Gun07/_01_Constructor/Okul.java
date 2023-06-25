package _04_Hafta.Gun07._01_Constructor;

public class Okul {
    public static void main(String[] args) {
        
        Ogrenci ogr1 =new Ogrenci();
        
        ogr1.id=1;
        ogr1.ad="savas";
        ogr1.soyad="Altug";
        ogr1.sinifi=5;
        System.out.println("ogr1.ad = " + ogr1.ad);
        
        //2.yol
        Ogrenci ogr2=new Ogrenci(2,"mehmet","yilmaz",5);
        System.out.println("ogr2.ad = " + ogr2.ad);

        //3.yol
        Ogrenci ogr3 = new Ogrenci(2,"Ayse","Bayrak");
    }
}
