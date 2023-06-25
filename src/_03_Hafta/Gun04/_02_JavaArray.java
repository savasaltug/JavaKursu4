package _03_Hafta.Gun04;

import java.util.Arrays;
import java.util.Scanner;

public class _02_JavaArray {
    public static void main(String[] args) {
        int[] dizi = new int[10];
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = (int)(Math.random()*10);


        }
        System.out.println(Arrays.toString(dizi));

        Scanner in = new Scanner(System.in);
        System.out.print("sayi giriniz= ");
        int arananSayi= in.nextInt();

        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i]== arananSayi){
                System.out.println("var");
            }else
                System.out.println("yok");

        }
    }
}
