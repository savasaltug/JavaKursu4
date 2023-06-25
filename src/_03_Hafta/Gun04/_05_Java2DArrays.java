package _03_Hafta.Gun04;

import java.util.Scanner;

public class _05_Java2DArrays {
    public static void main(String[] args) {
        // 2 ye 3 luk bir tabloyu kullanicidan sayi alarak doldurunuz
        // daha sonra ayri bir dongu de en buyuk sayiyi bulunuz.

        int[][] tablo = new int[2][3];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(i+" "+j+ ".sayi giriniz=");
                tablo[i][j] = in.nextInt();


            }
        }
        int maxSayi=0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tablo[i][j]+"\t");
                if (tablo[i][j]>maxSayi){
                    maxSayi = tablo[i][j];
                }

            }
            System.out.println();

        }
        System.out.println("maxSayi = " + maxSayi);
    }
}
