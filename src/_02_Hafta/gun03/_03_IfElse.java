package _02_Hafta.gun03;

import java.util.Scanner;

public class _03_IfElse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String sifre = in.nextLine();

        if  (sifre.length()<8 || sifre.contains("pass") || sifre.length()>12){
            System.out.println("gecersiz sifre");
        }
        else {
            System.out.println("Gecerli sifre");
        }
       // if (sifre.length()>=8 && !sifre.contains("pass") && sifre.length()>12)
    }
}
