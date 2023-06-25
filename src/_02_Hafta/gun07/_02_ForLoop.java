package _02_Hafta.gun07;

import java.util.Scanner;

public class _02_ForLoop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 2 ler carpim tablosunu yazim
        // 5 ile 7 arasini pas gecin

        int iki = 2;

        for (int i = 1; i <11 ; i++) {

            if (i >=5 && i <=7)// 5 ile 7 arasindaysa
                continue; // kendinden sonra gelenleri calistirma
            // donguyu kirmaz, pas gecirir


            System.out.println( iki +" * " + i+ " = " + (2*i));

        }
    }
}
