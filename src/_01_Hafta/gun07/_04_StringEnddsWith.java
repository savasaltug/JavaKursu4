package _01_Hafta.gun07;

public class _04_StringEnddsWith {
    public static void main(String[] args) {
        // EndsWith : verilen karakter(ler) ile bitiyor mu
        // sonuc true veya false yani boolean doner

        String text = "Merhaba Dunya";

        System.out.println("ya ile bitiyor mu ? " + text.endsWith("ya"));// true
        System.out.println("a ile bitiyor mu ? " + text.endsWith("a"));// true
        System.out.println("ny ile bitiyor mu ? " + text.endsWith("ny"));// false
        System.out.println("m ile bitiyor mu ? " + text.endsWith("m"));// false
        System.out.println("Dunya ile bitiyor mu ? " + text.endsWith("Dunya"));// true
        System.out.println("dunya ile bitiyor mu ? " + text.endsWith("dunya"));// false
    }
}
