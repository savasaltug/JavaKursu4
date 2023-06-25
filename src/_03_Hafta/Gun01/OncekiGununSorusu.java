package _03_Hafta.Gun01;

public class OncekiGununSorusu {
    public static void main(String[] args) {
        // 0-255 e kadar harflerin, sayi ve harf degerini ekrana yazdiriniz.
        // A-> 65, B -> karakter tablosu -> ascii tablosu
        // 65 sayi olarak yazdirirsam 65, karaktere cevirirsen (char)65 -> tablodaki karsiligi yazar

        for (int i = 0; i <= 255; i++) {
            char harf = (char)i; // karakter tablosundaki karsiligi

            System.out.println(i+ " harf = " + harf);

        }
    }
}
