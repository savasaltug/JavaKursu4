package _01_Hafta.gun03;

public class Ornek02 {
    public static void main(String[] args) {
        // yari capi (r) verilen bir dairenin cevresini ve alanini bulunuz
        // alan = pi * r * r,  cevre = 2 * pi * r   "pi = 3.14

        int r = 5;
        double pi = 3.14;
        double alan = pi * r * r;
        double cevre = 2 * pi * r;
        System.out.println("alan = " + alan);
        System.out.println("cevre = " + cevre);
    }

}
