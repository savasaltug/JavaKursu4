package _03_Hafta.Gun05;

public class _02_Java2DArrays {
    public static void main(String[] args) {
        int[][] tablo= {
                {3,4,},
                {234,22,33},
                {4,2,999,45,56,64},
                {42,19,3},
                {4}
        };
        System.out.println("satir sayisi = " + tablo.length);
        System.out.println("0.satir uzunlugu = " + tablo[0].length);
        System.out.println("1.satir uzunlugu = " + tablo[1].length);
        System.out.println("2.satir uzunlugu = " + tablo[2].length);
        System.out.println("3.satir uzunlugu = " + tablo[3].length);
        System.out.println("4.satir uzunlugu = " + tablo[4].length);
        for (int i = 0; i < tablo.length; i++) {
            for (int j = 0; j < tablo[i].length; j++) {
                System.out.print(tablo[i][j]+"\t");

            }
            System.out.println();

        }
    }
}


