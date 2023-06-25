package _01_Hafta.gun07;

public class _05_StringToLowerCase {
    public static void main(String[] args) {
        // toLowerCase : stringi kucuk harfe cevirir.

        String text= "Merhaba Dunya";

        System.out.println("Orjinal hali= " + text);// Merhaba Dunya
        System.out.println("text = " + text.toLowerCase());

        System.out.println("text buyuk veya kucuk harf bile olsa me ile basliyor mu? " + text.toLowerCase().startsWith("me"));// true
    }
}
