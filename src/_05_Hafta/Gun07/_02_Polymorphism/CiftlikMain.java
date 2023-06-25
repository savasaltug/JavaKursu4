package _05_Hafta.Gun07._02_Polymorphism;

public class CiftlikMain {
    public static void main(String[] args) {
        Kopek kopek1 = new Kopek("karabas");
        kopek1.ses();// havladi
        kopek1.kokladi();// kokladi

        Kedi kedi1 = new Kedi("bulasik");
        kedi1.ses();// miyavladi
        kedi1.tirmaladi();// tirmaladi

        kopekSesi(kopek1);//havladi
        kediSesi(kedi1);// miyavladi

        hayvanSesi(kopek1); // havladi
        hayvanSesi(kedi1); //miyavladi

        /******************************/
        // referans tipi  // nesne tipi
        Hayvan hayvan1=new Hayvan("ornek"); //hayvanlardan 1 hayvan
        Hayvan hayvan2= new Kopek("kangal");// hayvanlardan 1 kopek
        Hayvan hayvan3= new Kedi("boncuk"); // hayvanlardan 1 kedi

        System.out.println("-----------------------------");
        hayvan1.ses();// genel hayvan ses cikardi
        hayvan2.ses();// kopek hayvani havladi
        hayvan3.ses();// kedi hayvani miyavladi
        System.out.println("--------------------------------");

        hayvan2.ses(); // kopek de olsa hayvan Referansi sebebiyle metodlar kisitli
        // peki bu hayvani kopek formuna nasil cikartirim
        // tip donusumu kullanarak
        ((Kopek)hayvan2).kokladi();// artik diger metodlari kullanabilirim.
        // ((int)Math.random()) burdaki gibi, tip donusumu

        // Setlerden HasSet
        // Maplerden HasMap
        // Listlerden ArrayList

        // Polymorphism + cok formluluk - cok cesitlilik
    }
    public static void kopekSesi(Kopek kopek)
    {
        kopek.ses();
    }

    public static void kediSesi(Kedi kedi)
    {
        kedi.ses();
    }
    public static void hayvanSesi(Hayvan hayvan)
    {
        // buraya hem kedi hem kopek geliyor
        hayvan.ses();

        // bir classin aslinda kim oldugunu bulma yontemi
        if (hayvan instanceof Kopek)// hayvan aslinda kopek mi
            ((Kopek)hayvan).kokladi();
        if (hayvan instanceof Kedi); // hayvan aslinda kedi mi
        ((Kedi)hayvan).tirmaladi();
    }

 
}
