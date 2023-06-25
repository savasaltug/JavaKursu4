package _02_Hafta.gun02;

import java.util.Scanner;

public class _05_Javaif {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        if (n%10 == (n/10)%10){
            System.out.println("esittir");
        }else
            System.out.println("degildir");
    }
}
