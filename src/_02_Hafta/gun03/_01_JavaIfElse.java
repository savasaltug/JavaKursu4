package _02_Hafta.gun03;

import java.util.Scanner;

public class _01_JavaIfElse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("vize notunuzu girin.");
        int vize = in.nextInt();
        System.out.println("final notunuzu girin");
        int finall = in.nextInt();

        double ortalamaNot = 0.4*vize + 0.6 * finall;

        if(ortalamaNot >= 60){
            System.out.println("Gectiniz. Tebrikler");
        } else if (ortalamaNot < 60) {
            System.out.println("kaldiniz");

        }
    }
}
