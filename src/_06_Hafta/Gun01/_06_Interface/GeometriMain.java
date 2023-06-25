package _06_Hafta.Gun01._06_Interface;

public class GeometriMain {
    public static void main(String[] args) {
        Dikdortgen sekil = new Dikdortgen();
        System.out.println("sekil.alan() = " + sekil.alan(4,5));
        System.out.println("sekil.cevre(4,5) = " + sekil.cevre(4,5));

        Kare kare = new Kare();
        System.out.println(kare.cevre(5));
        System.out.println(kare.alan(5));
    }
}
