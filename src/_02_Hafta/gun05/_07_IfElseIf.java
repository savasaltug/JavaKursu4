package _02_Hafta.gun05;

import java.util.Scanner;

public class _07_IfElseIf {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //soru : kullanicidan Fizik:90 seklinde not bilgisini aliniz
        // >= 90 icin A
        // >= 80 icin B 
        // >= 70 icin C 
        // >= 60 >= icin D 
        // >= 40 icin E 
        // < 40 icin F yazdiriniz
        System.out.print("ders ve notu =");
        String dersNot = in.nextLine();
        int ogrNot = Integer.parseInt(dersNot.replaceAll("[^0-9]", "")); // sayi disindakileri bosaltir
        String dersAd = dersNot.replaceAll("[0-9]", ""); // sayilari bosaltir

        System.out.println("dersAd = " + dersAd);
        System.out.println("ogrNot = " + ogrNot);
        
        if (ogrNot >= 90){
            System.out.println("A");
        } else if (ogrNot >= 80) {
            System.out.println("B");
        } else if (ogrNot >= 70) {
            System.out.println("C");
        } else if (ogrNot >= 60) {
            System.out.println("D");
        } else if (ogrNot >= 40) {
            System.out.println("E");
        }else{
            System.out.println("F");
        }

    }
}
