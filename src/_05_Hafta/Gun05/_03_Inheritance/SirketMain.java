package _05_Hafta.Gun05._03_Inheritance;

public class SirketMain {
    public static void main(String[] args) {
        Calisan cal1 = new Calisan("savas", 10000,2);
        System.out.println("cal1 = " + cal1);

        GenelMudur gm1 = new GenelMudur("nihat", 12000, 3,10000);
        System.out.println("gm1 = " + gm1);
    }
}
