package _06_Hafta.Gun04._01_OOP_Soru;

public class HayvanatBahcesi {
    public static void main(String[] args) {

        Kedi kd = new Kedi("bulasik,", false, "01/01/2015");
        System.out.println("kd = " + kd);

        Kartal kr = new Kartal("kel", true, "02/03-2018");
        System.out.println("kr = " + kr);
    }
}
