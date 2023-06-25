package _01_Hafta.gun02;

public class _03_EscapeCharacters {
    public static void main(String[] args) {
        // Escape Characters
        // \n -> yeni satir aciyor, alt satira geciyor
        // \t -> tab tusuna basilmis gibi yapiyor
        // \b -> bacspace basilmis etkisi yapar, yani 1 karakter geri siler
        // \" -> cift tirnak yazar (gercegi degil arada kullanmak icin
        // \\ -> \ isaretini yaziyor
        // \r -> satir basina geri gidiyor ve satir basina kadar olan karakterlerin hepsini siliyor
        System.out.println("merhabadunya");
        System.out.println("merhaba\ndunya");
        System.out.println("merhaba\tdunya");
        System.out.println("merhaba\bdunya");
        System.out.println("merhaba\"dunya\"");
        System.out.println("merhaba\\dunya");
        System.out.println("merhaba\rdunya");

    }


}
