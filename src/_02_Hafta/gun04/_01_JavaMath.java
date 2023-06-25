package _02_Hafta.gun04;

import java.util.Scanner;

public class _01_JavaMath {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = -12;
        int b = 4;

        System.out.println("a'nin mutlak degeri = " + Math.abs(a)); // 12 absolute mutlak
        System.out.println(" a ve b den en buyuk olani = " + Math.max(a,b)); // 4
        System.out.println(" a ve b den kucuk olani = " + Math.min(a,b)); // -12
        System.out.println(" b nin karekoku = " + Math.sqrt(b)); // 2
        System.out.println(" 2'nin 3. kuvveti (2 uzeri 3)" + Math.pow(2,3));// 8
        System.out.println(" round 3.1 = " + Math.round(3.1));// 3
        System.out.println(" roun 3.5 = " + Math.round(3.5));// 4

        System.out.println(" ceil 3.1 = " + Math.ceil(3.1));// bu rakamdan buyuk en yakin tam sayi 4
        System.out.println(" ceil 3.5 = " + Math.ceil(3.5));// bu rakamdan buyuk en yakin tam sayi 4
        System.out.println(" floor 3.1 = " + Math.floor(3.1));// bu rakamdan kucuk en yakin tam sayi 3
        System.out.println(" floor 3.1 = " + Math.floor(3.5));// bu rakamdan kucuk en yakin tam sayi 3

    }
}
