package _03_Hafta.Gun02;

import java.util.Scanner;

// 5 tv kanali ismini bir diziye doldurunuz.
//daha sonra random olarak bir tanesini secip ekrana secileni yazdiriniz.
public class _06_JavaArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] tvler={"trt", "kanald", "fox", "showtw", "haberturk"};

        int secilen = (int) (Math.random()*tvler.length);
        System.out.println("tvler = " + tvler[secilen]);
    }
}
