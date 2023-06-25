package _02_Hafta.gun04;

import java.util.Scanner;

public class _02_JavaMathMax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print(" a deger =");
        int a = in.nextInt();

        System.out.print(" b degeri =");
        int b = in.nextInt();

        System.out.print(" c degeri =");
        int c= in.nextInt();

        // 1. yontem
        int max = Math.max(a,b);
        max = Math.max(max, c);
        System.out.println("max = " + max);

        //2. yontem
        int max2 = Math.max(a, Math.max(b,c));
        System.out.println("max2 = " + max2);

        //3. yontem
        System.out.println(Math.max(a, Math.max(b,c)));
    }
}
