package _02_Hafta.gun02;

import java.util.Scanner;

public class _06_Javaif {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();
        int x = in.nextInt();

        if (n>m && n>x){
            System.out.println(n);
        }if (m>n && m>x){
            System.out.println(m);
        }else
            System.out.println(x);
    }
}
