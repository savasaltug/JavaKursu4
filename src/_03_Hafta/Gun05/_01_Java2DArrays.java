package _03_Hafta.Gun05;

public class _01_Java2DArrays {
    public static void main(String[] args) {
        int[][] tablo= {
                {3,4,55},
                {234,22,33}
        };
        System.out.println("satir sayisi = " + tablo.length);
        System.out.println("satir uzunlugu = " + tablo[0].length);
        System.out.println("satir uzunlugu = " + tablo[1].length);


        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < tablo[i].length; j++) {
                System.out.print(tablo[i][j]+"\t");

            }
            System.out.println();

        }
    }
}
