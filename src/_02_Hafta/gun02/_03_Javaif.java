package _02_Hafta.gun02;

import java.util.Scanner;

public class _03_Javaif {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // girilen bir sayinin tek mi cift mi oldugunu yazdiriniz

        int n = in.nextInt();
        if (n%2==0){
            System.out.println("CIFT");
        }else
            System.out.println("TEK");
    }
}
