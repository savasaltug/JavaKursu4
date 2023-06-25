package _01_Hafta.gun07;

public class _06_StringToUpperCase {
    public static void main(String[] args) {
        String text= "Merhaba Dunya";

        System.out.println("orjinal hali = " + text);
        System.out.println("text'in buyuk harf hali = " + text.toUpperCase());//MERHABA DUNYA

        //buyuk veya kucuk harf farketmeksizin Ya ile bitiyor mu?
        System.out.println("sonuc =" + text.toUpperCase().endsWith("YA"));
    }
}
