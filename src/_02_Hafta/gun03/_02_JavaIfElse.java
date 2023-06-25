package _02_Hafta.gun03;

import java.util.Scanner;

public class _02_JavaIfElse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Bir cumle giriniz. ");
        String cumle = in.nextLine();

        int uzunluk = cumle.length();
        boolean arananKelimeVarMi = cumle.contains("study");

        if (uzunluk > 10 && arananKelimeVarMi == true){
            System.out.println("evet");
        }
        else {
            System.out.println("hayir");
        }

    }
}
