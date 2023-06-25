package _03_Hafta.Gun04;

public class _03_Java2DArrays {
    public static void main(String[] args) {
        int[][] tablo = new int[2][3]; // bos default deger 0
        int[][] tablo1 = { {3,4,5}, {56,7,88}};// her bir satir icin icerde {} acilir
        // {3,4,5} 1. satir, {56,7,88} 2. satir
        // 2 satir , 3 sutun int [][] tablo1=new int[2][3];

        for (int satir=0; satir<2; satir++){
            for (int sutun = 0; sutun < 3; sutun++) {
                System.out.print(tablo1[satir][sutun]+"\t");


            }
            System.out.println();
        }

    }
}
