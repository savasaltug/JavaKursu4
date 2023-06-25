package _01_Hafta.gun07;

public class _03_StringStartsWith {
    public static void main(String[] args) {
        // StartsWith komutu : bununla basliyor mu?
        // sonuc true veya false

        String text="HCL teknoloji";

        System.out.println("HC ile basliyor mu = " + text.startsWith("HC"));//true
        System.out.println("Te ile basliyor mu = " + text.startsWith("Te"));//false
        System.out.println("H ile basliyor mu = " + text.startsWith("H"));//true
        System.out.println("hc ile basliyor mu = " + text.startsWith("hc"));//false
        System.out.println("h ile basliyor mu = " + text.startsWith("h"));//false
        System.out.println("a ile basliyor mu = " + text.startsWith("a"));//false
    }
}
