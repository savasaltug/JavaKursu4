package _01_Hafta.gun07;

public class _11_StringReplaceAll {
    public static void main(String[] args) {
        // ReplaceAll : replace gibi calisir. farki Kriter(regex) verilebiliyor.
        // regex : regular expression / duzenli ifadeler

        String text= "Merhab Dunya123";

        System.out.println("text = "+ text); // orjinal hali

        System.out.println("abn -> _ = " + text.replaceAll("[abn]", "_")); // Merh___ Du_y_123 sadece abn harflerini degistirdik
        System.out.println("A-Z -> _ =" + text.replaceAll("[A-Z]", "_"));// _erhaba _unya123 buyuk harfleri degistirdik
        System.out.println("0-9 -> _ = " + text.replaceAll("[0-9]", ""));// Merhaba Dunya sadece sayilar
        System.out.println("0-9 -> _ = " + text.replaceAll("[^0-9]", ""));//123 ^sayilarin disndakiler
    }
}
