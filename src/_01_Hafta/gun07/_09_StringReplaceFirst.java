package _01_Hafta.gun07;

public class _09_StringReplaceFirst {
    public static void main(String[] args) {
        // replace : bir string icindeki karakter(leri) verilenle degistir. Sadece ilkini.

        String text= "Herkese Merhaba Dunya";
        System.out.println("text'in orjinal hali ="+text);
        System.out.println("a -> e :"+text.replaceFirst("a", "e")); // Merheba Dunya
        System.out.println("ba -> de :"+text.replaceFirst("ba", "de")); //Merhade Dunya
        System.out.println("Dunya -> Java :" + text.replaceFirst("Dunya", "Java"));// Merhaba Java
        System.out.println("ilk a'yi silelim :" +text.replaceFirst("a", ""));//Merhba Dunya
        System.out.println("ilk boslugi temizle : "+ text.replaceFirst(" ", ""));//HerkeseMerhaba Dunya
    }
}
