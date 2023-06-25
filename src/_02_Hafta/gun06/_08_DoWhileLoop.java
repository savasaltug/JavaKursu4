package _02_Hafta.gun06;

import java.util.Scanner;

public class _08_DoWhileLoop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // kullanicidan x girilene kadar ekrana "program calisiyor " yazan
        // ve x girldiginde ise "program bitti " yazan programi yazin.
        String okunan = "";
        do {
            System.out.println("program calisiyor");
            System.out.print("Ifade giriniz: ");
            okunan = in.next();

        }while(!okunan.equalsIgnoreCase("x"));
        System.out.println("program bitti");
    }
}
