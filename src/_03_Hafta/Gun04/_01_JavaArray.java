package _03_Hafta.Gun04;

import java.util.Arrays;

public class _01_JavaArray {
    public static void main(String[] args) {

        int[] dizi = new int[10];
        int tekMiktar=0;
        int ciftMiktar=0;
        for (int i = 0; i < dizi.length; i++) {
            dizi[i]= (int) (Math.random()*100);

            if (dizi[i]%2==0)
                ciftMiktar++;
            else
                tekMiktar++;
        }
        System.out.println("dizi= "+ Arrays.toString(dizi));
        int[] tekDizi = new int[tekMiktar];
        int[] ciftDizi = new int[ciftMiktar];

        int cIndex=0;
        int tIndex=0;
        for (int i = 0; i < dizi.length; i++) {

            if (dizi[i]%2==0){
                ciftDizi[cIndex]= dizi[i];
                cIndex++;
            }else{
                tekDizi[tIndex] = dizi [i];
                tIndex++;
            }
        }
        System.out.println("cift dizi= "+ Arrays.toString(ciftDizi));
        System.out.println("tek dizi= "+ Arrays.toString(tekDizi));


    }
}
