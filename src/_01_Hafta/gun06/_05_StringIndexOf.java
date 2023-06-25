package _01_Hafta.gun06;

public class _05_StringIndexOf {
    public static void main(String[] args) {

        // verilen karakterin(ler)in string icindeki indez degerini verir.

        String cumle = "Merhaba Dunya";

        System.out.println("cumle.indexof(r) = " + cumle.indexOf("r")); // 2
        System.out.println("cumle.indexOf(\"ha\") = " + cumle.indexOf("ha")); // 3
        System.out.println("cumle.indexOf(\"a\") = " + cumle.indexOf("a")); // 4
        System.out.println("cumle.indexOf(\"ny\") = " + cumle.indexOf("ny")); //10
        System.out.println("cumle.indexOf(\" \") = " + cumle.indexOf(" ")); //7
        System.out.println("cumle.indexOf(\"A\") = " + cumle.indexOf("A")); // -1 yok demenin degeri
        System.out.println("cumle.indexOf(\"a\", 5) = " + cumle.indexOf("a", 5));//6
        // a yi aramaya 5 (dahil) nolu indexten aramaya baslar.
    }
}
