package _01_Hafta.gun07;

public class _08_StringReplace {
    public static void main(String[] args) {
        // replace : bir string icindeki karakter(leri) verilenle degistir. hepsini

        String text= "Merhaba Dunya";
        System.out.println("text'in orjinal hali ="+text);
        System.out.println("a -> e :"+text.replace("a", "e")); // Merhebe Dunye
        System.out.println("ba -> de :"+text.replace("ba", "de")); //Merhade Dunya
        System.out.println("Dunya -> Java :" + text.replace("Dunya", "Java"));// Merhaba Java
        System.out.println("a lari silelim :" +text.replace("a", ""));//Merhb Duny
        System.out.println("bosluklari temizle : "+ text.replace(" ", ""));//MerhabaDunya
    }
}
