package _03_Hafta.Gun05;

import java.util.Arrays;
import java.util.Scanner;

public class _03_Java2DArrays {
    public static void main(String[] args) {
        // gunun sorusu: 3*2lik bir diziyi kullanicidan sayi alarak doldurunuz
        //sonra dizideki tek elemanlarini tek boyutlu bir diziye atayiniz

        Scanner in = new Scanner(System.in);

        int[][] dizi = new int[3][2];

        int tekMik=0;
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                System.out.print("sayi giriniz=");
                dizi[i][j]= in.nextInt();
                if (dizi[i][j]%2!=0)
                    tekMik++;
            }

        }
        int[] teklerDizisi=new int[tekMik];

        tekMik=0;
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                if (dizi[i][j]%2!=0){
                    teklerDizisi[tekMik]=dizi[i][j];
                    tekMik++;
                }

            }

        }
        System.out.println(Arrays.toString(teklerDizisi));
    }
}


