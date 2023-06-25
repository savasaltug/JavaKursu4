package _03_Hafta.Gun06;

public class _06_JavaMethod {
    public static void main(String[] args) {
        int s1=4;
        int s2=12;
        int s3=32;
        int s4 = 23;


        int sonuc1=toplambul("savas",5,6);
        int sonuc2=toplambul("yagmur", s1,s2,s3);
        int sonuc3=toplambul("nur", s1,s2,s3,s4);

        //parametreler ayni tip sadece miktari farkli
        //bu tip durumlar icin bir kolaylik saglamis.
        // ... ile ilgili 2 kural var
        // 1- Bir metodda parametre olarak sadece 1 tane olabilir.
        // 2- Her zaman son parametre olmali
        // gelen kac sayi olursa olsun hepsini al dizi metodda al

        System.out.println("sonuc1 = " + sonuc1);
        System.out.println("sonuc2 = " + sonuc2);
        System.out.println("sonuc3 = " + sonuc3);


    }

    public static int toplambul(String isim, int... sayilar){
        int toplam=0;
        System.out.println("isim = " + isim);
        for (int i = 0; i < sayilar.length; i++) {
            toplam += sayilar[i];


        }
        return toplam;
    }
//    public static int toplambul(int s1, int s2) {
//        return s1 + s2 ;
//    }
//
//    public static int toplambul(int s1, int s2, int s3) {
//        return s1 + s2 + s3;
//    }
//
//    public static int toplambul(int s1, int s2, int s3, int s4) {
//        return s1 + s2 + s3 + s4;
//    }
}
