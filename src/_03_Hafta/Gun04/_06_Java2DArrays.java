package _03_Hafta.Gun04;

import java.util.Scanner;

public class _06_Java2DArrays {
    public static void main(String[] args) {


        int[][] tablo =  {
            {4,55,66},
            {45,6,77},
                {4,2,999},
                {42,12,9},
                {4,22,39}
        };
        Scanner in = new Scanner(System.in);
        System.out.println("satir miktari=" +tablo.length);
        System.out.println("0.satirdaki sutun sayisi=" +tablo[0].length);
        System.out.println("0.satirdaki sutun sayisi=" +tablo[1].length);
        System.out.println("0.satirdaki sutun sayisi=" +tablo[2].length);
        System.out.println("0.satirdaki sutun sayisi=" +tablo[3].length);
        System.out.println("0.satirdaki sutun sayisi=" +tablo[4].length);

        for (int i = 0; i < tablo.length; i++) {
            for (int j = 0; j < tablo[j].length; j++) {
                System.out.print(tablo[i][j]+"\t");

            }
            System.out.println();

        }




    }
}
