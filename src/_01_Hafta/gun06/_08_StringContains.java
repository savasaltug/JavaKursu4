package _01_Hafta.gun06;

public class _08_StringContains {
    public static void main(String[] args) {
        // contains : bir stringin icerisinde karakter(lerin) var olup olmadigini boolean cinsinden soyle true veya false

        String cumle= "Merhaba Dunya";

        boolean varMi= cumle.contains("a");
        System.out.println("varMi = " + varMi);

        //2. yontem
        System.out.println("varMi = " + cumle.contains("a"));

        System.out.println("cumle.contains(ya) = " + cumle.contains("ya"));
        System.out.println("cumle.contains(\"k\") = " + cumle.contains("k"));
        System.out.println("cumle.contains(\"Dunya\") = " + cumle.contains("Dunya"));
        System.out.println("cumle.contains(\"dunya\") = " + cumle.contains("dunya"));

    }
}
