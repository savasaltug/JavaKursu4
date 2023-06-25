package _03_Hafta.Gun01;

public class _01_JavaNestedLoop {
    public static void main(String[] args) {
        // 1'den 10'a kadar  olan carpim tablosunu yaziniz.

        int carpim = 0;
        for (int i = 1; i <=10 ; i++) {
            System.out.println("");
            System.out.println("Tablo "+ i);
            for (int j = 1; j <=10; j++){
                carpim = i*j;
                System.out.println(i + " x " + j + " = " + carpim);
            }

        }
    }
}
