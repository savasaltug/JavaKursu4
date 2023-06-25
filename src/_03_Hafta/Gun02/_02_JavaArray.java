package _03_Hafta.Gun02;

import java.util.Scanner;

public class _02_JavaArray {
    public static void main(String[] args) {
        int sayi = 0; // daha once degiskeni bu sekilde tanimliyorduk, hafizada 1 tane yer acti
        int [] dizi = new int[5]; // 0,1,2,3,4, indexli 5 adet yer  acti hafizada

        dizi[0]=5;
        dizi[1]=47;
        // dizi[5]=50; // bu olamaz challenger patlar

        System.out.println("dizi.length = " + dizi.length);// bu bana kac eleman oldugunu verir
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < dizi.length ; i++) {
            System.out.println("sayi giriniz");
            dizi[i]= in.nextInt();
        }
        System.out.println("dizi = " + dizi[4]);

        for (int i = 0; i < dizi.length; i++) {
            System.out.println(dizi[i]);

        }
    }
}
