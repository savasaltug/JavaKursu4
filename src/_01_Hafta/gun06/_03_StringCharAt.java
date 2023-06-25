package _01_Hafta.gun06;

public class _03_StringCharAt {
    public static void main(String[] args) {
        // istenen noktadaki karakteri verir
        //karakterlerin sirasi 0(sifird)dan baslar.
        // buna index denir.
        // 0123456789

        String cumle= "Merhaba Dunya";

        char ilkHarf = cumle.charAt(0);
        System.out.println("ilkHarf = " + ilkHarf);
        System.out.println("h harfi = " +cumle.charAt(3)); // cumlenin 3 deki karakteri
    }
}
