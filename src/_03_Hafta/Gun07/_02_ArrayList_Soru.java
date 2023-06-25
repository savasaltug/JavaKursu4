package _03_Hafta.Gun07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _02_ArrayList_Soru {
    public static void main(String[] args) {
        //kullanicidan alacaginiz 6 elemanli (sayi) bir dizinin
        // sadece tek sayi olan elemanlarini ayri bir diziye (Arraylist) atayarak yazdiriniz

        Scanner in = new Scanner(System.in);

        int[] dizi = new int[6];

        for (int i = 0; i < dizi.length; i++) {
            System.out.print("sayi = ");
            dizi[i] = in.nextInt();

        }

        System.out.println("dizi = " + Arrays.toString(dizi));

        ArrayList<Integer> tekler = new ArrayList<>();


        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] %2 !=0)
                tekler.add(dizi[i]);

        }
        System.out.println("tekler = " + tekler);

        //2.yontem
        for (int i = 0; i < dizi.length; i++) {
            System.out.print("sayi = ");
            dizi[i]= in.nextInt();

            if (dizi[i] %2 !=0)
                tekler.add(dizi[i]);

        }
        System.out.println("tekler = " + tekler);

    }
}
