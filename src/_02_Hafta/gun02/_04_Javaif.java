package _02_Hafta.gun02;

import java.util.Scanner;

public class _04_Javaif {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Lutfen notunuzu girin. ");
        int n = in.nextInt();

        if (n>=50){
            System.out.println("Gectiniz. ");
        }else
            System.out.println(" Kaldiniz.");
    }
}
