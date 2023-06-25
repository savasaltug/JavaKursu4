package _01_Hafta.gun06;

public class _12_StringLastIndexOf {
    public static void main(String[] args) {
        // indexof gibi calisir bu aramaya bastan baslar
        // LastIndexOf ise aaramaya sondan baslar.

        String s1 = "Merhaba";

        System.out.println("Bastan sona dogru a yi arar = " + s1.indexOf("a")); // 4
        System.out.println("Sondan basa dogru a yi ara = " + s1.lastIndexOf("a")); // 6
        // index aynidir , tektir sadece arama yonu degisir.
    }
}
