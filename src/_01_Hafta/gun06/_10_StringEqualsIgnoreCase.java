package _01_Hafta.gun06;

public class _10_StringEqualsIgnoreCase {
    public static void main(String[] args) {
        // equals ile ayni calisir sadece buyuk kucuk harf ayrimi yapmaz

        String s1 = "Merhaba";
        String s2 = "MERHABA";

        System.out.println("s1.equals(s2) = " + s1.equals(s2));
        System.out.println("s1.equalsIgnoreCase(s2) = " + s1.equalsIgnoreCase(s2));
    }
}
