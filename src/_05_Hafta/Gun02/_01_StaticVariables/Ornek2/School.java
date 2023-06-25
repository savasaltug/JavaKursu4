package _05_Hafta.Gun02._01_StaticVariables.Ornek2;

public class School {
    public static void main(String[] args) {
        Student ogr1 = new Student(1, "Savas Altug");
        Student ogr2 = new Student(2, "Mehmet Yilmaz");
        Student ogr3 = new Student(3, "Beyza Demir");

        // problem: hem id'yi takip etmek zorundayim
        // hem de hata olasiligi yuksek

        Student ogr10 = new Student( "Savas Altug");
        Student ogr11 = new Student( "Mehmet Yilmaz");
        Student ogr12 = new Student( "Beyza Demir");

        System.out.println("ogr10 = " + ogr10);
        System.out.println("ogr11 = " + ogr11);
        System.out.println("ogr12 = " + ogr12);
    }
}
